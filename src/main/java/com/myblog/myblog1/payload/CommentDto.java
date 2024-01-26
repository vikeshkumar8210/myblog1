package com.myblog.myblog1.payload;

import lombok.Data;

@Data
public class CommentDto {
    private long id;

    private String text;

    private String email;

//generate getter and setter


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
