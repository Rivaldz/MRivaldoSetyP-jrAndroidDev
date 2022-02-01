package com.example.muhrivaldosetyopjrandroiddeveloper.login;

import android.util.Log;
import android.widget.Toast;

import com.example.muhrivaldosetyopjrandroiddeveloper.Model.ResponseData;
import com.example.muhrivaldosetyopjrandroiddeveloper.api.Interface;
import com.example.muhrivaldosetyopjrandroiddeveloper.api.RetroServer;
import com.example.muhrivaldosetyopjrandroiddeveloper.base.Presenter;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginPresenter implements Presenter<LoginView> {
    LoginView loginView;

    @Override
    public void onAttach(LoginView view) {
       loginView  = view;
    }

    @Override
    public void onDetach() {
        loginView = null;
    }

    public void Login(String username, String password){
        if (username.isEmpty() && password.isEmpty()){
            loginView.showMessage("Plese input field");
        }else{
            System.out.println("Username == " + username + " Password == " + password);
            Interface api = RetroServer.getClient().create(Interface.class);
            Call<ResponseData> userLogin = api.userLogin(username, password);
            userLogin.enqueue(new Callback<ResponseData>() {
                @Override
                public void onResponse(Call<ResponseData> call, Response<ResponseData> response) {
                    Log.e("TAG", "response " + response.body().getKode());

                    int kode = response.body().getKode();
                    if (kode == 1) {
                        loginView.showSukses(username);
                        loginView.showMessage("Success Login");

                    } else {
//                        loginVIew.hideLoading();
                        loginView.showMessage("Gagal Login");
                    }
                }

                @Override
                public void onFailure(Call<ResponseData> call, Throwable t) {
                    loginView.showMessage("Gagai Login Error Failure");
                    Log.e("TAG",t.getMessage());

                }
            });
        }
    }
}
