package com.example.week4day1;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.week4day1.github.GithubRepo;

import java.util.ArrayList;
public class ReposViewAdapter extends RecyclerView.Adapter<ReposViewAdapter.ViewHolder>{
    private ArrayList<GithubRepo> reposList=new ArrayList<>();
    public ReposViewAdapter(ArrayList<GithubRepo> reposList) {
        this.reposList=reposList;

    }
    @NonNull
    @Override
    public ReposViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ReposViewAdapter.ViewHolder holder, int position) {
        final GithubRepo repo=reposList.get(position);
        holder.tvField1.setText(reposList.get(position).getName());
        holder.tvField2.setText(reposList.get(position).getFullName());
        holder.tvField3.setText(reposList.get(position).getContentsUrl());
        holder.tvField4.setText(reposList.get(position).getCreatedAt());


    }

    @Override
    public int getItemCount() {
        return reposList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvField1;
        TextView tvField2;
        TextView tvField3;
        TextView tvField4;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvField1=itemView.findViewById(R.id.tvField1);
            tvField2=itemView.findViewById(R.id.tvField2);
            tvField3=itemView.findViewById(R.id.tvField3);
            tvField4=itemView.findViewById(R.id.tvField4);
        }
    }
}
