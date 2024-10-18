package homework_26.document_archive.dao;

import homework_26.document_archive.model.Document;

public interface Archive {

    Document[] fillArchive(Document[] documents);

    boolean addDocument(Document document);

    Document removeDocument(long id);

    Document findDocument(long id);

    void printDocument();

    int size();

    boolean updateDocument(Document document);

}
