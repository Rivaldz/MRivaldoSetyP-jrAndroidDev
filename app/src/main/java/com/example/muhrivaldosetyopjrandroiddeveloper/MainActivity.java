package com.example.muhrivaldosetyopjrandroiddeveloper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button submit;
    EditText username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit = findViewById(R.id.button);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usernameSt = username.getText().toString();
                String passwordSt = password.getText().toString();
                if (usernameSt.equals("user") && passwordSt.equals("user")){
                   Toast.makeText(getApplicationContext(),"Berhasil Login",Toast.LENGTH_SHORT).show();
                   startActivity(new Intent(MainActivity.this, HomeActivity.class));
                }

            }
        });

    }
}