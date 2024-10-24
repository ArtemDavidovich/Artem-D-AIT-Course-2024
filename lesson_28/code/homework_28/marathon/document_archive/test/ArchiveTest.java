package homework_28.marathon.document_archive.test;

import homework_28.marathon.document_archive.dao.Archive;
import homework_28.marathon.document_archive.dao.ArchiveImpl;
import homework_28.marathon.document_archive.model.Document;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArchiveTest {

    Archive archive;

    Document[] documents;


    @BeforeEach
    void setUp() {
        archive = new ArchiveImpl(5);
        documents = new Document[5];
        documents[0] = new Document("D1","A1",111_111_111_0);
        documents[1] = new Document("D2","A1",111_111_111_1);
        documents[2] = new Document("D3","A3",111_111_111_2);
        documents[3] = new Document("D4","A4",111_111_111_3);

        archive.fillArchive(documents);
    }

    @Test
    @DisplayName("Filling the archive with documents")
    void testFillArchive(){
        assertEquals(documents, archive.fillArchive(documents));
    }

    @Test
    @DisplayName("Adding document to Archive")
    void testAddDocument(){
        //no null adding
        assertFalse(archive.addDocument(null));
        //no duplicate adding
        assertFalse(archive.addDocument(documents[0]));
        //adding new document
        Document newDocument = new Document("D5","A5",111_111_111_4);
        assertTrue(archive.addDocument(newDocument));
        assertEquals(5, archive.size());
        //adding one more document over capacity
        Document oneMoreDocument = new Document("D6","A6",111_111_111_5);
        assertFalse(archive.addDocument(oneMoreDocument));
    }

    @Test
    @DisplayName("Searching for exact document by its id")
    void testFindDocument(){
        assertEquals(documents[0], archive.findDocument(111_111_111_0));
        assertNull(archive.findDocument(111_111_111_9));
    }

    @Test
    @DisplayName("Searching for all documents with the same author")
    void testFindByAuthor(){
        Document[] tempDocuments = new Document[2];
        tempDocuments[0] = new Document("D1","A1",111_111_111_0);
        tempDocuments[1] = new Document("D2","A1",111_111_111_1);
        assertArrayEquals(tempDocuments, archive.findByAuthor("A1"));
    }

    @Test
    @DisplayName("Searching for exact document by its title")
    void testFindByTitle(){
        Document testDocument = new Document("D1","A1",111_111_111_0);
        assertEquals(testDocument, archive.findByTitle("D1"));
    }

    @Test
    @DisplayName("Deleting document from Archive")
    void testRemoveDocument(){
        //remove existing document
        assertEquals(documents[0], archive.removeDocument(111_111_111_0));
        assertEquals(3, archive.size());
    }

    @Test
    @DisplayName("Checking actual size of Archive")
    void testSize(){
        assertEquals(4, archive.size());
    }

    @Test
    @DisplayName("Printing the Archive")
    void testPrintDocument(){
        System.out.println("=============================");
        archive.printDocument();
    }

    @Test
    @DisplayName("Updating one of the documents in archive")
    void testUpdateDocument(){
        Document newDocument = new Document("D5","A3",111_111_111_2);
        assertTrue(archive.updateDocument(newDocument));
    }

}//end of class