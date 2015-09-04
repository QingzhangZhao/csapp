package cn.edu.hust.baidu.club.csapp.Delete;

import android.util.Log;
import com.squareup.okhttp.*;

import java.io.IOException;

/**
 * Created by zqz on 15-9-5.
 */
public class Delete {
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
    public static String deleteArticle(String uid,String cookie) throws IOException {

        OkHttpClient client = new OkHttpClient();
        RequestBody formBody = new FormEncodingBuilder()
                .add("uid",uid)
                .build();

        Request request = new Request.Builder()
                .url("http://128.199.101.105:8080/articles/"+uid+"/")
                .delete(formBody)
                .addHeader("cookie", cookie)
                .build();

        Response response = client.newCall(request).execute();
        if (!response.isSuccessful()) Log.i("Delete Error", "Delete Failed");
        return response.body().string();
    }
}
