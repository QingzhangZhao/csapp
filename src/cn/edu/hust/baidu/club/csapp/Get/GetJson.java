package cn.edu.hust.baidu.club.csapp.Get;

import android.util.Log;
import com.squareup.okhttp.Headers;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;

/**
 * Created by zhaoqingzhang on 15-5-14.
 */

//Get json by OkHttp
public class GetJson {

    /**
     *
     * @param url The address that you want to get json from
     * @return The json
     * @throws Exception
     */
    public static  String  run(String url) throws Exception {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url(url)
                .build();
        Response response = client.newCall(request).execute();
        if (!response.isSuccessful())
            throw new IOException("Unexpected code " + response);
        return response.body().string();
    }

    public  static  String  getArticles(String cookie) throws Exception {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("http://128.199.101.105:8080/articles/")
                .header("Cookie", cookie)
                .build();
        Response response = client.newCall(request).execute();
        if (!response.isSuccessful())
            throw new IOException("Unexpected code " + response);
        return response.body().string();
    }

    public  static  String  getDetailArticles(String id,String cookie) throws Exception {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("http://128.199.101.105:8080/articles/detail/"+id+"/")
                .header("Cookie", cookie)
                .build();
        Response response = client.newCall(request).execute();
        if (!response.isSuccessful())
            throw new IOException("Unexpected code " + response);
        return response.body().string();
    }

    public  static  String  getAUserInfo(String uid,String cookie) throws Exception {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("http://128.199.101.105:8080/users/detail/"+uid+"/")
                .header("Cookie",cookie)
                .build();
        Response response = client.newCall(request).execute();
        if (!response.isSuccessful())
            throw new IOException("Unexpected code " + response);
        return response.body().string();
    }
}
