package com.example.week4day1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.week4day1.github.GithubRepo;

import java.util.ArrayList;
import java.util.Arrays;

public class ShowRepoActivity extends AppCompatActivity implements ShowRepoAcitivityContract {
    protected ArrayList<GithubRepo> newrepos;
    RecyclerView rvRepos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_repo);
        rvRepos=findViewById(R.id.rvRepos);
        ShowRepoActivityPresenter showRepoActivityPresenter=new ShowRepoActivityPresenter(this);
        showRepoActivityPresenter.getAllRepos(this);



    }

    @Override
    public void populateAllRepo(ArrayList<GithubRepo> repos) {

        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(rvRepos.getContext());
        rvRepos.setLayoutManager(layoutManager);
        ReposViewAdapter reposViewAdapter=new ReposViewAdapter(repos);
        rvRepos.setAdapter(reposViewAdapter);
    }
}
