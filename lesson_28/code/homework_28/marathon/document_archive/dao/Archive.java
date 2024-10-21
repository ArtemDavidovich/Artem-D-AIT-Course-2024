package homework_28.marathon.document_archive.dao;

import homework_28.marathon.document_archive.model.Document;

public interface Archive {

    Document[] fillArchive(Document[] documents);

    boolean addDocument(Document document);

    Document removeDocument(long id);

    Document findDocument(long id);

    Document[] findByAuthor(String author);

    Document findByTitle(String title);

    void printDocument();

    int size();

    boolean updateDocument(Document document);

}
