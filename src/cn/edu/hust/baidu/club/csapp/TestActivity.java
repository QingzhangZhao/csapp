package cn.edu.hust.baidu.club.csapp;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import cn.edu.hust.baidu.club.csapp.Get.GetJson;
import cn.edu.hust.baidu.club.csapp.Parse.ParseJson;
import cn.edu.hust.baidu.club.csapp.Post.PostJson;
import cn.edu.hust.baidu.club.csapp.UsedClasses.Lostandfound;
import cn.edu.hust.baidu.club.csapp.UsedClasses.News;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
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
                 String result = PostJson.post(url, lostandfound2);
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
