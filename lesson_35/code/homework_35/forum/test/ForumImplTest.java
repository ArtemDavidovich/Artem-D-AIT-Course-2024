package homework_35.forum.test;

import homework_35.forum.dao.Forum;
import homework_35.forum.dao.ForumImpl;
import homework_35.forum.model.Post;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ForumImplTest {

    Forum forum;
    Post[] posts;

    @BeforeEach
    void setUp() {
        forum = new ForumImpl(7);
        posts = new Post[6];
        posts[0] = new Post(1, "t1", "a1", "c1");
        posts[1] = new Post(2, "t2", "a2", "c2");
        posts[2] = new Post(3, "t3", "a3", "c3");
        posts[3] = new Post(4, "t4", "a1", "c4");
        posts[4] = new Post(5, "t5", "a1", "c5");
        posts[5] = new Post(6, "t6", "a3", "c6");
    }

    @Test
    @DisplayName("")
    void testAddPost() {
    }

    @Test
    @DisplayName("")
    void testRemovePost() {
    }

    @Test
    @DisplayName("")
    void testUpdatePost() {
    }

    @Test
    @DisplayName("")
    void testGetPostById() {
    }

    @Test
    @DisplayName("")
    void testGetPostsByAuthor() {
    }

    @Test
    @DisplayName("")
    void testTestGetPostsByAuthor() {
    }

    @Test
    @DisplayName("")
    void testSize() {
    }
}