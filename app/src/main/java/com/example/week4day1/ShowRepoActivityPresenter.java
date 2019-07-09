package com.example.week4day1;

import android.content.Context;

import java.util.ArrayList;

public class ShowRepoActivityPresenter {
    ShowRepoAcitivityContract showRepoAcitivityContract;

    public ShowRepoActivityPresenter(ShowRepoAcitivityContract showRepoAcitivityContract) {
        this.showRepoAcitivityContract = showRepoAcitivityContract;
    }
    public void getAllRepos(Context context) {
        OkHttpExample okHttpExample=new OkHttpExample();
        okHttpExample.getRepos(context,showRepoAcitivityContract);


    }
}
