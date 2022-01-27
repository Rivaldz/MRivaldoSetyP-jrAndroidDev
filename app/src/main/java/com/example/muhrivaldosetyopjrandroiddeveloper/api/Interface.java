package com.example.muhrivaldosetyopjrandroiddeveloper.api;

import com.example.muhrivaldosetyopjrandroiddeveloper.Model.Auth.Login;
import com.example.muhrivaldosetyopjrandroiddeveloper.Model.Contacts.Data;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface Interface {
    @GET("https://private-anon-d737bb707d-recruitment.apiary-mock.com/api/contacts")
    Call<Data> getDataUser();

}
