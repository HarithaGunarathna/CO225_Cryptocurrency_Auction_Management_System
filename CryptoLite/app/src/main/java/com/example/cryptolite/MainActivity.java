package com.example.cryptolite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void SignInUserButton(View v){
        Intent i = new Intent(this,SignInAsAUser.class);
        startActivity(i);
    }

    public void NewUserAccount(View v){
        Intent i = new Intent(this,CreateUserAccount.class);
        startActivity(i);

    }
    public void AdminLogin(View v){
        Intent i = new Intent(this,CreateUserAccount.class);
        startActivity(i);
    }
}