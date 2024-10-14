package com.example.homework_pinterest;

public class Post {
    private String image;
    private String avatar;
    private String nickName;

    public Post(String image, String avatar, String nickName) {
        this.image = image;
        this.avatar = avatar;
        this.nickName = nickName;
    }

    public String getImage() {
        return image;
    }

    public String getAvatar() {
        return avatar;
    }

    public String getNickName() {
        return nickName;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
