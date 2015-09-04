package cn.edu.hust.baidu.club.csapp.UsedClasses;

/**
 * Created by zqz on 15-9-4.
 */
public class UserInfo {
    private  int  status;// 200表示成功
    private  boolean checkfollow; //检查是否已经关注这个用户
    private  UserDetail userdetail;

    public boolean isCheckfollow() {
        return checkfollow;
    }

    public int getStatus() {
        return status;
    }

    public UserDetail getUserdetail() {
        return userdetail;
    }

}
