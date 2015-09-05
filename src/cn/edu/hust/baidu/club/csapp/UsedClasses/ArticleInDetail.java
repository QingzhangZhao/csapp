package cn.edu.hust.baidu.club.csapp.UsedClasses;

import java.util.List;

/**
 * Created by zqz on 15-9-5.
 */
public class ArticleInDetail {
    private String auth;
    private  boolean transmited;
    private  boolean checkcollect;
    private  String title;
    private  String transmit;
    private int Zcount ;
    private  boolean checkzan;
    private String audiopath;
    private String betransmit;
    private boolean checkauth;
    private  String ctime;
    private  int Ccount;
    private  String article_id;
    private  List<String> imagespath;
    private  String auth_id;
    private  String content;

    public boolean isCheckcollect() {
        return checkcollect;
    }

    public boolean isCheckauth() {
        return checkauth;
    }

    public boolean isCheckzan() {
        return checkzan;
    }

    public boolean isTransmited() {
        return transmited;
    }

    public int getCcount() {
        return Ccount;
    }

    public int getZcount() {
        return Zcount;
    }

    public List<String> getImagespath() {
        return imagespath;
    }

    public String getArticle_id() {
        return article_id;
    }

    public String getAudiopath() {
        return audiopath;
    }

    public String getAuth() {
        return auth;
    }

    public String getAuth_id() {
        return auth_id;
    }

    public String getBetransmit() {
        return betransmit;
    }

    public String getContent() {
        return content;
    }

    public String getCtime() {
        return ctime;
    }

    public String getTitle() {
        return title;
    }

    public String getTransmit() {
        return transmit;
    }
}
