package manager;

import domain.Post;

public class PostManager {
    private Post[] posts;

    public Post[] search(int ownerId, String domain, String query, boolean ownersOnly, int count, int offset) {
        Post[] posts = PostManager.search();
        return null;
    }


    public void delete(int ownerId, int postId) {
        Post[] posts = PostManager.delete();
    }

}
