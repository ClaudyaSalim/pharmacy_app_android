package com.example.a2502006341_claudyasalim_asgmcs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class AboutActivity extends AppCompatActivity {

    Button homeBtn;
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        user = (User) getIntent().getSerializableExtra("Logged User");

        homeBtn = findViewById(R.id.home_btn);
        homeBtn.setOnClickListener(e->{
            Intent toHome = new Intent(this, HomeActivity.class);
            toHome.putExtra("Logged User", user);
            startActivity(toHome);
        });

    }


}