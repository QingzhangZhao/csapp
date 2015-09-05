package cn.edu.hust.baidu.club.csapp;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import cn.edu.hust.baidu.club.csapp.Delete.Delete;
import cn.edu.hust.baidu.club.csapp.Get.GetJson;
import cn.edu.hust.baidu.club.csapp.Parse.ParseJson;
import cn.edu.hust.baidu.club.csapp.Post.PostJson;
import cn.edu.hust.baidu.club.csapp.UsedClasses.*;

import java.util.List;

/**
 * Created by zhaoqingzhang on 15-5-10.
 */
public class TestActivity extends Activity {
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        new Thread(){
            public void run(){
                new AnotherTask().execute("JSON");
            }
        }.start();
    }

    private class AnotherTask extends AsyncTask<String, Void, String> {
        @Override
        protected void onPostExecute(String result) {
            //对UI组件的更新操作

        }
        @Override
        protected String doInBackground(String... params) {
            //耗时的操作
            try {
                //获取lostandfoundlist的例子
                GetJson getJson=new GetJson();
                String url ="http://45.62.117.228:8000/lostandfound/";
                 String json2 =getJson.run(url);
                  Log.i("josn get !",json2);
                List<Lostandfound> lostandfoundlist = ParseJson.fromJsontoLostandfoundList(json2);
                Log.i("pssize",lostandfoundlist.size()+"");
                Lostandfound lostandfound = lostandfoundlist.get(2);
                Log.i("lostandfound",lostandfound.getMessage());


                //Post一个lostandfound的例子
                 Lostandfound lostandfound2 = new Lostandfound();
                 lostandfound2.setContent("content");
                 lostandfound2.setMessage("123@123.com");
                 lostandfound2.setTitle("title");
                 String result = PostJson.postLostandfound(url, lostandfound2);
                 Log.i("result",result);

                //获取新闻列表的一个例子
                GetJson getJson2=new GetJson();
                String url2 ="http://45.62.117.228:8000/news/";
                String newlist_json =getJson2.run(url2);
                List<News> newsList = ParseJson.fromJsontoNewsList(newlist_json);
                Log.i("pssize",newsList.size()+"");
                int i;
                for (i=0;i<newsList.size();i++){
                    News news = newsList.get(i);
                    Log.i("news title",news.getTitle());
                }

                //获取某个指定id新闻的例子
                 int  id = 10461;
                 String url3 = "http://45.62.117.228:8000/new/"+id+"/";
                GetJson getJson3=new GetJson();
                String new_json =getJson3.run(url3);
                News news = ParseJson.fromJsontoNews(new_json);
                Log.i("news id 10461 ",news.getTitle()+"");


                // 2015-9.3新增
                //注册一个新用户的例子
                User user = new User();
                user.setUsername("test5");
                user.setEmail("233@123.com");
                user.setPassword("test");
                user.setConfirm("test");
                String result2 = PostJson.postUsers(user);
                Log.i("uesr post_result", result2);

                //用户登录的例子(登录成功会返回一个cookie 需要保存下来)
                User user1 = new User();
                user1.setUsername("test5");
                user1.setPassword("test");
                String cookie = PostJson.userLogin(user);
                Log.i("uesr post_result 登录", cookie);

                //登录后应该立马访问（跳转到）articles 这里是文章大概 这里除了返回文章外 还有当前用户的信息
                 String result3 = GetJson.getArticles(cookie);
                Log.i("文章信息", result3);
                HomePage homePage = ParseJson.fromJsontoHomePage(result3);
                List<Article> articleList = homePage.getArticles();
                for (i=0;i<articleList.size();i++){
                    Article article = articleList.get(i);
                    Log.i("article title",article.getTitle());
                }
                Log.i("当前用户",homePage.getCurrent_user());
                Log.i("当前用户的uid", homePage.getUserid());

                //查看某个用户详细资料 需要该用户的uid
                String result6 = GetJson.getAUserInfo(homePage.getUserid(), cookie);
                Log.i("用户详细资料", result6);
                UserDetail userDetail = ParseJson.fromJsontoUserDetail(result6);
                Log.i("该用户id",userDetail.getUserdetail().get(0)+"");
                Log.i("该用户用户名",userDetail.getUserdetail().get(1)+"");
                Log.i("该用户发表的文章列表",userDetail.getArticles()+"");
                Log.i("该用户赞列表",userDetail.getZan()+"");
                Log.i("该用户收藏列表",userDetail.getCollections()+"");
                Log.i("该用户关注的人",userDetail.getFollowing()+"");
                Log.i("关注该用户的人",userDetail.getFollower()+"");
                //关注某个人需要该用户的uid uid可以从查看用户的详细资料里获得
                String result7 = PostJson.postFollower(homePage.getUserid(), cookie);
                Log.i("关注",result7);

                //取消关注某个人
                String result8 = Delete.deleteFollow(homePage.getUserid(), cookie);
                Log.i("取消关注",result8);

                //文章详细信息
                String response = GetJson.getDetailArticles(articleList.get(1).getArticle_id(), cookie);
                Log.i("文章详细信息",response);
                ArticlesDetail articlesDetail = ParseJson.fromJsontoArticlesDetail(response);
               Log.i("文章的标题", articlesDetail.getArticle().getTitle());
                Log.i("文章的内容", articlesDetail.getArticle().getContent());

                //发表文章 发表文章 有且只有 title 和 content
                Article article = new Article();
                article.setTitle("title_test");
                article.setContent("content_test");
                String result4 = PostJson.postArticle(article,cookie);
                Log.i("文章发表状态", result4);

                //删除某个文章
                String result9= Delete.deleteArticle(articleList.get(1).getArticle_id(), cookie);
                Log.i("删除文章状态",result9);
                //赞某个文章
                String result10 = PostJson.postZanorCollect(2, "7e22ac6d-ff9a-36c3-b4f8-8b6ca00d01ee", cookie);
                Log.i("赞文章状态", result10);
                //删除某个赞
                String result12= Delete.deleteZanorCollect(2, "9907a806-40f3-3029-ba86-46728d56e137", cookie);
                Log.i("删除赞状态",result12);


                //收藏某个文章
                String result11 = PostJson.postZanorCollect(1, "7e22ac6d-ff9a-36c3-b4f8-8b6ca00d01ee", cookie);
                Log.i("收藏状态", result11);

                //取消收藏
                String result13= Delete.deleteZanorCollect(1, "9907a806-40f3-3029-ba86-46728d56e137", cookie);
                Log.i("取消收藏状态",result13);
                //查看某个文章的评论

                String result16 = GetJson.getArticleComment("7e22ac6d-ff9a-36c3-b4f8-8b6ca00d01ee", cookie);
                Log.i("文章评论信息",result16);
                ArticleComments articleComments = ParseJson.fromJsontoArticleComments(result16);
                Log.i("文章评论一个id", articleComments.getComments().get(1).getId());

                //评论某个文章
                String result14 = PostJson.postComment("test2333","7e22ac6d-ff9a-36c3-b4f8-8b6ca00d01ee",cookie);
                Log.i("评论状态",result14);

                //删除评论
                String result15 = Delete.deleteComment(articleComments.getComments().get(1).getId(),cookie);
                Log.i("删除评论状态",result15);






            }catch (java.net.ConnectException e){
                Log.i("Connect Error","can't connect to the server!");
            }catch (java.io.IOException e){
                Log.i("IO Error",e.getMessage());
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            return params[0];
        }
    }
}
