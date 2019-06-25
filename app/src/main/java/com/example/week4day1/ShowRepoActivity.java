package com.example.week4day1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.week4day1.github.GithubRepo;

import java.util.ArrayList;

public class ShowRepoActivity extends AppCompatActivity {
    protected ArrayList<GithubRepo> newrepos;
    RecyclerView rvRepos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_repo);
        rvRepos=findViewById(R.id.rvRepos);
        OkHttpExample okHttpExample=new OkHttpExample();


        newrepos=okHttpExample.getRepos();
        Log.d("burrrrrrrrffff", "onCreate: "+newrepos.get(0).getFullName());
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this);
        rvRepos.setLayoutManager(layoutManager);
        ReposViewAdapter reposViewAdapter=new ReposViewAdapter(newrepos);
        rvRepos.setAdapter(reposViewAdapter);


    }
}
