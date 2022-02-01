package com.example.muhrivaldosetyopjrandroiddeveloper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.muhrivaldosetyopjrandroiddeveloper.login.LoginPresenter;
import com.example.muhrivaldosetyopjrandroiddeveloper.login.LoginView;

public class MainActivity extends AppCompatActivity implements LoginView {

    Button submit;
    EditText username, password;
    LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginPresenter = new LoginPresenter();

        submit = findViewById(R.id.bottomLogin);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);

//        submit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                System.out.println("Button sedang di klik di oncreate");
//            }
//        });

//        submit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String usernameSt = username.getText().toString();
//                String passwordSt = password.getText().toString();
//                if (usernameSt.equals("user") && passwordSt.equals("user")){
//                   Toast.makeText(getApplicationContext(),"Berhasil Login",Toast.LENGTH_SHORT).show();
//                   startActivity(new Intent(MainActivity.this, HomeActivity.class));
//                }
//
//            }
//        });
        onAttachView();

    }

//    private void loginAction(){
//        String usernameString = username.getText().toString();
//        String passwordString = password.getText().toString();
//        if (usernameString.equals(null) && passwordString.equals(null)){
//            Toast.makeText(getApplicationContext(),"Please input field",Toast.LENGTH_SHORT).show();
//        }else{
//
//        }
//    }



    @Override
    public void onAttachView() {
        loginPresenter.onAttach(this);
//        submit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                System.out.println("Button Sedang di Klik");
//
//            }
//        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userSt = username.getText().toString();
                String passSt = password.getText().toString();
                loginPresenter.Login(userSt,passSt);
            }
        });

    }

    @Override
    public void onDetachView() {
        loginPresenter.onDetach();
    }

    @Override
    public void showSukses(String username) {
        startActivity(new Intent(MainActivity.this,HomeActivity.class));

    }

    @Override
    public void showMessage(String message) {
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
    }


}