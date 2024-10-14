package com.example.homework_pinterest;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

public class PostViewHolder extends RecyclerView.ViewHolder {

   private ImageView image,avatar;
   private TextView tvNickname;

    public PostViewHolder(@NonNull View itemView) {
        super(itemView);
        image = itemView.findViewById(R.id.iv_picture);
        avatar = itemView.findViewById(R.id.iv_circleImage);
        tvNickname = itemView.findViewById(R.id.tv_user);

    }

    public void onBind(Post post) {
        Glide.with(image.getContext()).load(post.getImage()).into(image);
        Glide.with(avatar.getContext()).load(post.getAvatar()).into(avatar);
        tvNickname.setText(post.getNickName());
        int height = (int) (Math.random() * 500 + 400);
        image.getLayoutParams().height = height;
        image.requestLayout();
    }
}
