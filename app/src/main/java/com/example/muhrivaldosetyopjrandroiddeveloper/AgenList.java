package com.example.muhrivaldosetyopjrandroiddeveloper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.muhrivaldosetyopjrandroiddeveloper.Adapter.DataAdapter;
import com.example.muhrivaldosetyopjrandroiddeveloper.Model.Contacts.Data;
import com.example.muhrivaldosetyopjrandroiddeveloper.Model.Contacts.GetData;
//import com.example.muhrivaldosetyopjrandroiddeveloper.Model.Contacts.Success;
//import com.example.muhrivaldosetyopjrandroiddeveloper.Model.Contacts.UserData;
import com.example.muhrivaldosetyopjrandroiddeveloper.api.Interface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AgenList extends AppCompatActivity {
    RecyclerView rvAgentList;
    public static final String BASE_URL = "https://private-anon-d737bb707d-recruitment.apiary-mock.com/api/contacts/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agen_list);

        rvAgentList = findViewById(R.id.rvAgenList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        rvAgentList.setLayoutManager(layoutManager);
        rvAgentList.setHasFixedSize(true);
        getDataUser();
    }

    void getDataUser(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        Interface service = retrofit.create(Interface.class);
        Call<Data> getUserData = service.getDataUser();
        getUserData.enqueue(new Callback<Data>() {
            @Override
            public void onResponse(Call<Data> call, Response<Data> response) {
                DataAdapter adapter = new DataAdapter( AgenList.this,response.body().getResult());
                adapter.notifyDataSetChanged();
                rvAgentList.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<Data> call, Throwable t) {
                t.printStackTrace();
            }
        });

    }
}