package org.example10.entity;

public class ReportingDetail {
    private Posts posts;
    private int postsNumber;

    public ReportingDetail(Posts posts, int postsNumber) {
        this.posts = posts;
        this.postsNumber = postsNumber;
    }

    public Posts getPosts() {
        return posts;
    }

    public void setPosts(Posts posts) {
        this.posts = posts;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    public void setPostsNumber(int postsNumber) {
        this.postsNumber = postsNumber;
    }

    @Override
    public String toString() {
        return "ReportingDetail{" +
                "posts=" + posts +
                ", postsNumber=" + postsNumber +
                '}';
    }
}
