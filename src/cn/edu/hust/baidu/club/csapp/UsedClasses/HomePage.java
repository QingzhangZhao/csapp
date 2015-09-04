package cn.edu.hust.baidu.club.csapp.UsedClasses;

import java.util.List;

/**
 * Created by zqz on 15-9-4.
 */
public class HomePage {
    private  int status; //状态码
    private List<Article> articles; //文章
    private  String userid; // 当前用户id 比如"a7b94026-35b1-3428-89bf-f274a772aa14"
    private  String current_user;//当前用户名 如 "test1"
    private  String _xsrf; //没什么用的东西 "2|03d9ca98|4c4e49650834b4679cd74bd75d31a652|1441334064"

    public int getStatus() {
        return status;
    }


    public String get_xsrf() {
        return _xsrf;
    }

    public String getCurrent_user() {
        return current_user;
    }

    public String getUserid() {
        return userid;
    }

    public void set_xsrf(String _xsrf) {
        this._xsrf = _xsrf;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setCurrent_user(String current_user) {
        this.current_user = current_user;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }
}
