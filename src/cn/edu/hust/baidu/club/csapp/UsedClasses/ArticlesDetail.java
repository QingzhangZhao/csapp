package cn.edu.hust.baidu.club.csapp.UsedClasses;

/**
 * Created by zqz on 15-9-5.
 */
public class ArticlesDetail {

    private  boolean checkcollect;// false,    //是否已经收藏
    private  boolean checkzanl; //false,      //是否已经点赞
    private ArticleInDetail article;
    private int status; //200

    public ArticleInDetail getArticle() {
        return article;
    }

    public boolean isCheckcollect() {
        return checkcollect;
    }

    public boolean isCheckzanl() {
        return checkzanl;
    }

    public int getStatus() {
        return status;
    }
}
