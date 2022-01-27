package com.example.muhrivaldosetyopjrandroiddeveloper.api;

import com.example.muhrivaldosetyopjrandroiddeveloper.Model.Contacts.Data;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Interface {
    @GET("https://private-anon-d737bb707d-recruitment.apiary-mock.com/api/contacts")
    Call<Data> getDataUser();

}
