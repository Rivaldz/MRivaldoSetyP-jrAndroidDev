package com.example.muhrivaldosetyopjrandroiddeveloper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void agenListClick(View view) {
        startActivity(new Intent(HomeActivity.this, AgenList.class));
    }

    public void addAgenClick(View view) {
        startActivity(new Intent(HomeActivity.this, AddAgent.class));
    }
}