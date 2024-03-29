package com.nazmul.retrofit.remote;

import com.nazmul.retrofit.Constant;

//import retrofit2.Retrofit;
//import retrofit2.converter.gson.GsonConverterFactory;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient{

    public static final String BASE_URL = Constant.BASE_URL;
    public static Retrofit retrofit = null;

    public static Retrofit getApiClient(){
        if (retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

        }
        return retrofit;

    }





//    public static final String BASE_URL = Constant.BASE_URL;
//    public static Retrofit retrofit = null;
//
//    public static Retrofit getApiClient() {
//
//        if (retrofit == null){
//            retrofit = new Retrofit.Builder()
//                    .baseUrl(BASE_URL)
//                    .addConverterFactory(GsonConverterFactory.create())
//                    .build();
//        }
//        return retrofit;
//
//    }
}
