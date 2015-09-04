package cn.edu.hust.baidu.club.csapp.UsedClasses;

import java.util.List;

/**
 * Created by zqz on 15-9-5.
 */
public class UserDetail {
    private List<UserFollowing> following; //关注了那些人
    private  int id; // 2
    private  int  sex;// 1
    private  List<UserCollections>  the_collections;//收藏的文章
    private  List<UserComments>  user_comments; //评论的文章
    private  List<UserZan> zan;//点赞的文章
    private  List<UserFollower> follower;  //关注他的人
    private  String  user_id; // 用户id

    public int getId() {
        return id;
    }

    public int getSex() {
        return sex;
    }

    public List<UserCollections> getThe_collections() {
        return the_collections;
    }

    public List<UserComments> getUser_comments() {
        return user_comments;
    }

    public List<UserFollower> getFollower() {
        return follower;
    }

    public List<UserFollowing> getFollowing() {
        return following;
    }

    public List<UserZan> getZan() {
        return zan;
    }

    public String getUser_id() {
        return user_id;
    }
}
