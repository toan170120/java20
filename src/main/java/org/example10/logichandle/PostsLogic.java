package org.example10.logichandle;

import org.example10.entity.Posts;

import java.util.Scanner;

public class PostsLogic {
    private Posts[] posts = new Posts[100];

    public Posts[] getPosts() {
        return posts;
    }

    public void inputPosts(){
        System.out.print("Bạn muốn thêm bao nhiêu bài post: ");
        int postsNumber = new Scanner(System.in).nextInt();
        for(int i = 0; i < postsNumber; i++){
            Posts posts1 = new Posts();
            posts1.inputInfo();
            savePosts(posts1);
        }
    }
    public void savePosts(Posts posts1){
        for(int i = 0; i < posts.length; i++){
            if(posts[i] == null){
                posts[i] = posts1;
                break;
            }
        }
    }

    public void showPosts() {
        for (int i = 0; i < posts.length; i++) {
            if (posts[i] != null) {
                System.out.println(posts[i]);
            }
        }
    }

    public boolean postsIsNotEmpty() {
        for (int i = 0; i < posts.length; i++) {
            if (posts[i] != null) {
                return true;
            }
        }
        return false;
    }

}
