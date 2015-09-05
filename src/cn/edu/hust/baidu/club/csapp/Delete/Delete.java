package cn.edu.hust.baidu.club.csapp.Delete;

import android.util.Log;
import com.squareup.okhttp.*;

import java.io.IOException;

/**
 * Created by zqz on 15-9-5.
 */
public class Delete {
    /**
     * 取消关注某个而你
     * @param uid the uid
     * @param cookie cookie
     * @return the result of delete
     * @throws IOException
     */
    public static String deleteFollow(String uid,String cookie) throws IOException {

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("http://128.199.101.105:8080/users/detail/"+uid+"/")
                .delete()
                .addHeader("cookie", cookie)
                .build();

        Response response = client.newCall(request).execute();
        if (!response.isSuccessful()) Log.i("Delete Error", "Delete Failed");
        return response.body().string();
    }

    /**
     * 删除某个文章
     * @param uid uid
     * @param cookie cookie
     * @return the result of delete
     * @throws IOException
     */
    public static String deleteArticle(String uid,String cookie) throws IOException {

        OkHttpClient client = new OkHttpClient();
        RequestBody formBody = new FormEncodingBuilder()
                .add("uid",uid)
                .build();

        Request request = new Request.Builder()
                .url("http://128.199.101.105:8080/articles/")
                .delete(formBody)
                .addHeader("cookie", cookie)
                .build();

        Response response = client.newCall(request).execute();
        if (!response.isSuccessful()) Log.i("Delete Error", "Delete Failed");
        return response.body().string();
    }

    /**
     * 取消赞或收藏
     * @param act 进行的操作 1是取消收藏 2是取消赞
     * @param uid the uid
     * @param cookie the cookie
     * @return the result of delete
     * @throws IOException
     */
    public static String deleteZanorCollect(int act,String uid,String cookie) throws IOException {

        OkHttpClient client = new OkHttpClient();
        RequestBody formBody = new FormEncodingBuilder()
                .add("act",act+"")
                .build();

        Request request = new Request.Builder()
                .url("http://128.199.101.105:8080/articles/detail/"+uid+"/")
                .delete(formBody)
                .addHeader("cookie", cookie)
                .build();

        Response response = client.newCall(request).execute();
        if (!response.isSuccessful()) Log.i("Delete Error", "Delete Failed");
        return response.body().string();
    }
    public static String deleteComment(String uid,String cookie) throws IOException {

        OkHttpClient client = new OkHttpClient();
        RequestBody formBody = new FormEncodingBuilder()
                .add("uid",uid)
                .build();

        Request request = new Request.Builder()
                .url("http://128.199.101.105:8080/articles/")
                .delete(formBody)
                .addHeader("cookie", cookie)
                .build();

        Response response = client.newCall(request).execute();
        if (!response.isSuccessful()) Log.i("Delete Error", "Delete Failed");
        return response.body().string();
    }
}
