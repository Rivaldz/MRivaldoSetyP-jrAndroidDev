package com.example.muhrivaldosetyopjrandroiddeveloper.api;

import com.example.muhrivaldosetyopjrandroiddeveloper.Model.Contacts.Data;
import com.example.muhrivaldosetyopjrandroiddeveloper.Model.ResponseData;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Interface {
    @GET("api/contacts")
    Call<Data> getDataUser();

    @FormUrlEncoded
    @POST("user_login.php")
    Call<ResponseData> userLogin(
            @Field("username") String username,
            @Field("password") String password
    );

}
