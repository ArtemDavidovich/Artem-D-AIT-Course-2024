package homework_35.forum.dao;

import homework_35.forum.model.Post;

import java.time.LocalDate;

public class ForumImpl implements Forum{

    private Post[] posts;
    private int size;

    public ForumImpl(int quantity) {
        this.posts = new Post[quantity];
    }

    @Override
    public boolean addPost(Post post) {
        return false;
    }

    @Override
    public boolean removePost(int postId) {
        return false;
    }

    @Override
    public boolean updatePost(int postId, String content) {
        return false;
    }

    @Override
    public Post getPostById(int postId) {
        return null;
    }

    @Override
    public Post[] getPostsByAuthor(String author) {
        return new Post[0];
    }

    @Override
    public Post[] getPostsByAuthor(String author, LocalDate dateFrom, LocalDate dateTo) {
        return new Post[0];
    }

    @Override
    public int size() {
        return 0;
    }

}//end of class
