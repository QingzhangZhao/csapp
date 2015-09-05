package cn.edu.hust.baidu.club.csapp.UsedClasses;

import com.google.gson.Gson;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zqz on 15-9-5.
 */
public class UserDetail {
    private  List<String> userdetail;
    private  List<ArrayList> articles;
    private  List<ArrayList> follower;
    private  int count ;
    private  List<UserZan> zan;
    private  int status;
    private  List<UserCollection> collections;
    private  boolean checkfollow;
    private  List<ArrayList> following;

    public int getCount() {
        return count;
    }

    public boolean isCheckfollow() {
        return checkfollow;
    }

    public int getStatus() {
        return status;
    }

    public List<ArrayList> getArticles() {
        return articles;


    }

    public List<UserCollection> getCollections() {
        return collections;
    }

    public List<ArrayList> getFollower() {
        return follower;
    }

    public List<ArrayList> getFollowing() {
        return following;
    }

    public List<String> getUserdetail() {
        return userdetail;
    }

    public List<UserZan> getZan() {
        return zan;
    }
}
