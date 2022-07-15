package com.example.newsx.Listeners;

//Nama : Daffa Adisthia F
//NIM : 10119224
// KElas : IF-6

import com.example.newsx.Models.APIStatus;
import com.example.newsx.Models.NewsHeadline;

import java.util.List;

public interface OnFetchDataListener<T> {
    void onFetchData(List<NewsHeadline> data,  String message);
    void onError(String message);

}
