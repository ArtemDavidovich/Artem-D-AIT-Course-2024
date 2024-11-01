package classwork_35.ait.album.test;

import classwork_35.ait.album.dao.Album;
import classwork_35.ait.album.dao.AlbumImpl;
import classwork_35.ait.album.model.Photo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class AlbumImplTest {

    Album album;
    Photo[] photos;

    LocalDateTime now = LocalDateTime.now();

    //Comparator sort by albumId then by photoId
    Comparator<Photo> comparator = (p1, p2) -> {
      int res = Integer.compare(p1.getAlbumId(), p2.getAlbumId());
      return res != 0 ? res : Integer.compare(p1.getPhotoId(), p2.getPhotoId());
    };

    @BeforeEach
    void setUp() {
        album = new AlbumImpl(7);
        photos = new Photo[6];
        photos[0] = new Photo(1, 1, "t1", "url1", now.minusDays(10));
        photos[1] = new Photo(1, 2, "t2", "url2", now.minusDays(7));
        photos[2] = new Photo(1, 3, "t3", "url3", now.minusDays(5));
        photos[3] = new Photo(2, 1, "t4", "url4", now.minusDays(7));
        photos[4] = new Photo(2, 2, "t5", "url5", now.minusDays(5));
        photos[5] = new Photo(1, 4, "t6", "url6", now.minusDays(2));

        for (int i = 0; i < 6; i++) {
            album.addPhoto(photos[i]);
        }

    }

    @Test
    @DisplayName("Checking adding photo to Album")
    void testAddPhoto() {
        assertFalse(album.addPhoto(null));
        assertFalse(album.addPhoto(photos[1]));
        Photo photo = new Photo(1,5, "t7", "url7", now.minusDays(2));
        assertTrue(album.addPhoto(photo));
        album.printPhoto();
        assertEquals(7, album.size());
        photo = new Photo(2,4,"t8","url8",now.minusDays(2));
        assertFalse(album.addPhoto(photo));
    }

    @Test
    @DisplayName("Checking deleting photo to Album")
    void testRemovePhoto() {
        assertTrue(album.removePhoto(1,1));
        assertFalse(album.removePhoto(3,1));
        assertEquals(5, album.size());
    }

    @Test
    @DisplayName("Checking updating photo url in Album")
    void testUpdatePhoto() {
        assertTrue(album.updatePhoto(1,1,"newUrl"));
        assertEquals("newUrl", album.getPhotoFromAlbum(1,1).getUrl());
    }

    @Test
    @DisplayName("Checking finding photo in Album")
    void testGetPhotoFromAlbum() {
        assertEquals(photos[1], album.getPhotoFromAlbum(1,2));
        assertNull(album.getPhotoFromAlbum(5,4));
    }

    @Test
    @DisplayName("Checking finding all photos from one album")
    void testGetAllPhotoFromAlbum() {
        Photo[] expected = {photos[3], photos[4]};
        Photo[] actual = album.getAllPhotoFromAlbum(2);
        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Checking finding all photos in exact period")
    void testGetPhotoBetweenDates() {
        Photo[] actual = album.getPhotoBetweenDate(now.minusDays(6).toLocalDate(), now.minusDays(2).toLocalDate());
        Photo[] expected = {photos[5], photos[4], photos[2]};
        Arrays.sort(expected, comparator);
        Arrays.sort(actual, comparator);
        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Checking actual size")
    void testSize() {
        assertEquals(6, album.size());
    }

}//end of class