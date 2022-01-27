package com.example.muhrivaldosetyopjrandroiddeveloper.api;

import com.example.muhrivaldosetyopjrandroiddeveloper.Model.Auth.Login;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface Interface {
    @FormUrlEncoded
    @POST()
    Call<Login> postLogin(@Field("username") String username,
                          @Field("password") String password);
}
