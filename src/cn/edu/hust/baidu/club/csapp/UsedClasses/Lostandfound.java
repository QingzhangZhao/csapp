package cn.edu.hust.baidu.club.csapp.UsedClasses;

/**
 * Created by zhaoqingzhang on 15-5-11.
 */
public class Lostandfound {
    private int id;
    private String date;
    private String message;
    private String content;
    private String title;


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getMessage() {
        return message;
    }

    public String getTitle() {
        return title;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

}
