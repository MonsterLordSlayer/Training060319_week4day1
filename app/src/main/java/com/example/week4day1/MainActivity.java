package com.example.week4day1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.week4day1.github.GithubRepo;
import com.example.week4day1.github.GithubUser;

import java.util.ArrayList;
import java.util.Arrays;


public class MainActivity extends AppCompatActivity implements MainActivityContract {
    
    protected TextView tvfield1;
    protected TextView tvfield2;
    protected TextView tvfield3;
    protected TextView tvfield4;
    protected static String field1;
    protected static String field2;
    protected static String field3;
    protected static String field4;
    private MainActivityPresenter mainActivityPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvfield1=findViewById(R.id.field1);
        tvfield2=findViewById(R.id.field2);
        tvfield3=findViewById(R.id.field3);
        tvfield4=findViewById(R.id.field4);
        mainActivityPresenter
                = new MainActivityPresenter(this);
        mainActivityPresenter.getAllUser(this);

        /*tvfield1=findViewById(R.id.field1);
        tvfield2=findViewById(R.id.field2);
        tvfield3=findViewById(R.id.field3);
        tvfield4=findViewById(R.id.field4);
        OkHttpExample okHttpExample=new OkHttpExample();
        okHttpExample.getUser(tvfield1,tvfield2,tvfield3,tvfield4);*/




    }
    public void onClick(View v){
        Intent intent=new Intent(this,ShowRepoActivity.class);
        startActivity(intent);

    }

    @Override
    public void populateAllUser(String s1,String s2, String s3, String s4) {

        tvfield1.setText(s1);
        tvfield2.setText(s2);
        tvfield3.setText(s3);
        tvfield4.setText(s4);
        //OkHttpExample okHttpExample=new OkHttpExample();
        //okHttpExample.getUser(tvfield1,tvfield2,tvfield3,tvfield4);

    }
}
