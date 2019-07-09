package com.example.week4day1;

import android.content.Context;

import java.util.ArrayList;

public class MainActivityPresenter {
    MainActivityContract mainActivityContract;

    public MainActivityPresenter(MainActivityContract mainActivityContract) {
        this.mainActivityContract = mainActivityContract;
    }
    public void getAllUser(Context context) {
        OkHttpExample okHttpExample=new OkHttpExample();
        ArrayList<String> strings=okHttpExample.getUser(context,mainActivityContract);


    }
}
