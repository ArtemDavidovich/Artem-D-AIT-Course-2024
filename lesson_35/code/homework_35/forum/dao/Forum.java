package homework_35.forum.dao;

import homework_35.forum.model.Post;

import java.time.LocalDate;

public interface Forum {

    boolean addPost(Post post);

    boolean removePost(int postId);

    boolean updatePost(int postId, String content);

    Post getPostById(int postId);

    Post[] getPostsByAuthor(String author);

    Post[] getPostsByAuthor(String author, LocalDate dateFrom, LocalDate dateTo);

    int size();

}//end of class
