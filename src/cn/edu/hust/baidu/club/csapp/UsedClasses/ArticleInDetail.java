package cn.edu.hust.baidu.club.csapp.UsedClasses;

import java.util.List;

/**
 * Created by zqz on 15-9-5.
 */
public class ArticleInDetail {

    private  List<String>  becollected;// [],    //被那些人收藏 每个元素是类似  [id，用户名] 的数组
    private  List<String>  bezan;// [],          //被那些人点赞
    private  String  ctime;// "2015-07-13 14:31:14",
    private  String  audiopath;// null,
    private  String  content;// "春暖花开栗子，我要那佛都烟消云散",
    private  List<String> comments;// [],
    private  String  auth_id;// "01cb74c5-242b-3579-ae87-ee19b60798de",
    private  String title;// "大圣归",
    private  String imagespath;// "",
    private  String article_id;// "7c9f69c1-43ab-3a5f-b315-c639cb841bb3",


    public List<String> getBecollected() {
        return becollected;
    }

    public List<String> getBezan() {
        return bezan;
    }

    public List<String> getComments() {
        return comments;
    }

    public String getArticle_id() {
        return article_id;
    }

    public String getAudiopath() {
        return audiopath;
    }

    public String getAuth_id() {
        return auth_id;
    }

    public String getContent() {
        return content;
    }

    public String getCtime() {
        return ctime;
    }

    public String getImagespath() {
        return imagespath;
    }

    public String getTitle() {
        return title;
    }

}
