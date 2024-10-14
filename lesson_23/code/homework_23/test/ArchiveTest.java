package homework_23.test;

import homework_23.controller.Archive;
import homework_23.model.Document;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArchiveTest {

    Archive archive;

    Document[] documents;
    int size = 0;

    @BeforeEach
    void setUp() {
        archive = new Archive(5);
        documents[0] = new Document(111_111_111_0);
        documents[1] = new Document(111_111_111_1);
        documents[2] = new Document(111_111_111_2);
        documents[3] = new Document(111_111_111_3);

        for(Document document : documents){
            archive.addDocument(document);
        }
    }

    @Test
    void testFindDocument(){
        Document foundDocument = archive.findDocument(111_111_111_0);
        assertEquals(documents[0], archive.findDocument(111_111_111_0));
        assertNull(archive.findDocument(111_111_111_9));
    }

}//end of class