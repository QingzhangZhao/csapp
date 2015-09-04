package cn.edu.hust.baidu.club.csapp.UsedClasses;

import org.w3c.dom.DOMStringList;

import java.util.List;

/**
 * Created by zqz on 15-9-4.
 */
public class Article {
   private String auth; //文章作者
   private boolean  checkcollect; //是否收藏
   private List<String> audiopath;//短url，可以无视
   private int  Zcount;  //被赞的次数
   private boolean checkzan; //当前用户是否点赞
   private boolean  checkauth; //当前用户是否为作者
   private String content; //文章内容
   private  int Ccount; //被收藏的次数
   private  String article_id; //文章id
   private List<String> imagespath; //文章图片路径
   private  String auth_id; //文章作者的id
   private String  title; //文章标题
   private  String ctime; //文章发表时间

   public boolean isCheckauth() {
      return checkauth;
   }

   public boolean isCheckcollect() {
      return checkcollect;
   }

   public boolean isCheckzan() {
      return checkzan;
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

   public String getAuth() {
      return auth;
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

   public String getTitle() {
      return title;
   }

   public void setArticle_id(String article_id) {
      this.article_id = article_id;
   }

   public void setAuth(String auth) {
      this.auth = auth;
   }

   public void setAuth_id(String auth_id) {
      this.auth_id = auth_id;
   }

   public void setCcount(int ccount) {
      Ccount = ccount;
   }

   public void setCheckauth(boolean checkauth) {
      this.checkauth = checkauth;
   }

   public void setCheckcollect(boolean checkcollect) {
      this.checkcollect = checkcollect;
   }

   public void setCheckzan(boolean checkzan) {
      this.checkzan = checkzan;
   }

   public void setContent(String content) {
      this.content = content;
   }

   public void setCtime(String ctime) {
      this.ctime = ctime;
   }

   public void setImagespath(List<String> imagespath) {
      this.imagespath = imagespath;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public void setZcount(int zcount) {
      Zcount = zcount;
   }
}
