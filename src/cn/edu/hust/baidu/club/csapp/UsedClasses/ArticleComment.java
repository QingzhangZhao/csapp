package cn.edu.hust.baidu.club.csapp.UsedClasses;

/**
 * Created by zqz on 15-9-5.
 */
public class ArticleComment {
    private String   article_id;
    private boolean checkuser;
    private String content;
    private  String ctime;
    private String id;
    private  String user_id;
    private  String username;

    public String getArticle_id() {
        return article_id;
        }

    public boolean isCheckuser() {
            return checkuser;
        }


    public String getContent() {
            return content;
        }

    public String getCtime() {
            return ctime;
        }

    public String getId() {
            return id;
        }

    public String getUser_id() {
            return user_id;
        }

    public String getUsername() {
            return username;
        }
}
