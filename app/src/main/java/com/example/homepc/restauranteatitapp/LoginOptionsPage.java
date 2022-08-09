package com.example.homepc.restauranteatitapp;

import android.app.AlertDialog;
import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class LoginOptionsPage extends AppCompatActivity {
    Button sign_in,sign_up;
    DatabaseHelper myDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_options_page);
        sign_in = (Button) findViewById(R.id.signin);
        sign_up = (Button) findViewById(R.id.signup);

        myDB = new DatabaseHelper(this);
        sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signinpage = new Intent(getApplicationContext(),SignInPage.class);
                startActivity(signinpage);
                finish();

            }
        });

        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signuppage = new Intent(getApplicationContext(),SignUpPage.class);
                startActivity(signuppage);
                finish();

            }
        });


    }

}

