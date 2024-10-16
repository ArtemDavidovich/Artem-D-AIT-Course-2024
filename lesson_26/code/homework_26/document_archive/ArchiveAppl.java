package homework_26.document_archive;

import homework_26.document_archive.dao.ArchiveImpl;
import homework_26.document_archive.model.Document;

public class ArchiveAppl {

    public static void main(String[] args) {

        Document[] documents = new Document[6];
        documents[0] = new Document("D1","A1",111_111_111_0);
        documents[1] = new Document("D2","A2",111_111_111_1);
        documents[2] = new Document("D3","A3",111_111_111_2);
        documents[3] = new Document("D4","A4",111_111_111_3);

        ArchiveImpl archive = new ArchiveImpl(6);

        archive.fillArchive(documents);
        archive.printDocument();
        System.out.println(archive.size());
        System.out.println("==========================");

        Document newDocument = new Document("D5","A5",111_111_111_4);
        archive.addDocument(newDocument);
        archive.printDocument();
        System.out.println(archive.size());
        System.out.println("==========================");

        archive.removeDocument(111_111_111_0);
        archive.printDocument();
        System.out.println(archive.size());
        System.out.println("==========================");

        Document oneMoreDocument = new Document("D6","A4",111_111_111_3);
        archive.updateDocument(oneMoreDocument);
        archive.printDocument();
        System.out.println(archive.size());
        System.out.println("==========================");

    }//end of main

}//end of class
