package com.example.homework_pinterest;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PostAdapter extends RecyclerView.Adapter<PostViewHolder> {
    private final LayoutInflater inflater;
    private final ArrayList<Post> posts;

    public PostAdapter(LayoutInflater inflater, ArrayList<Post> posts) {
        this.inflater = inflater;
        this.posts = posts;
    }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.feed_item,parent,false);
        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
        Post post = posts.get(position);
        holder.onBind(post);

    }

    @Override
    public int getItemCount() {
        return posts.size();
    }
}
