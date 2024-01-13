package com.myblog.myblog1.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ErrorDetails {
    private String message;
    private Date date;
    private String url;

//    public ErrorDetails(String message, Date date, String url) {
//        this.message = message;
//        this.date = date;
//        this.url = url;
//    }
}
