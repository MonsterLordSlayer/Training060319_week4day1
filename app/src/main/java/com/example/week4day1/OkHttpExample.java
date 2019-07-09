package com.example.week4day1;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.week4day1.github.GithubRepo;
import com.example.week4day1.github.GithubUser;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONObject;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;

import static com.example.week4day1.MainActivity.field1;
import static com.example.week4day1.MainActivity.field2;
import static com.example.week4day1.MainActivity.field3;
import static com.example.week4day1.MainActivity.field4;

public class OkHttpExample {
    ArrayList<GithubRepo> repos;
    ArrayList<String> returnStrings=new ArrayList<>();
    TextView tv;
    public ArrayList<String> getUser(Context context,MainActivityContract mainActivityContract){


        HttpLoggingInterceptor loggingInterceptor=new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient returnClient =new OkHttpClient.Builder().addInterceptor(loggingInterceptor).build();
        Request request=new Request.Builder().url("https://api.github.com/users/MonsterLordSlayer").build();
        returnClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {

                Gson gson=new Gson();

                GithubUser githubUser =gson.fromJson(response.body().string(),GithubUser.class);
                field1=githubUser.getLogin();
                field2=githubUser.getId().toString();
                field3=githubUser.getHtmlUrl();
                field4=githubUser.getCreatedAt();
                returnStrings.add(field1);
                returnStrings.add(field2);
                returnStrings.add(field3);
                returnStrings.add(field4);
                ((MainActivity)context).runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        mainActivityContract.populateAllUser(field1,field2,field3,field4);

                    }
                });










            }

        });
        return returnStrings;

    }
    public ArrayList<GithubRepo> getRepos(Context context, ShowRepoAcitivityContract showRepoAcitivityContract){
        OkHttpClient returnClient =new OkHttpClient.Builder().build();

        Request request=new Request.Builder().url("https://api.github.com/users/MonsterLordSlayer/repos").build();
        Thread thread=new Thread(new Runnable() {

            @Override
            public void run() {
                try{
                    Gson gson=new Gson();
                    Response response=returnClient.newCall(request).execute();
                    GithubRepo[] respondrepos=gson.fromJson(response.body().string(),GithubRepo[].class);
                    ((ShowRepoActivity)context).runOnUiThread(new Runnable() {
                        @Override
                        public void run() {

                            repos=new ArrayList<GithubRepo>(Arrays.asList(respondrepos));
                            showRepoAcitivityContract.populateAllRepo(repos);
                        }
                    });







                }
                catch(Exception e){
                    e.printStackTrace();

                }
            }
        });
        thread.start();


        return repos;


    }
}
