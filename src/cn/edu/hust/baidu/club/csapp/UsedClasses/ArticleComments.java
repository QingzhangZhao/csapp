package cn.edu.hust.baidu.club.csapp.UsedClasses;

import java.util.List;

/**
 * Created by zqz on 15-9-5.
 */
public class ArticleComments {
    private  String _xsrf;
    private List<ArticleComment> comments;
    private  int status;

    public int getStatus() {
        return status;
    }

    public String get_xsrf() {
        return _xsrf;
    }

    public List<ArticleComment> getComments() {
        return comments;
    }
}
