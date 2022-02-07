package com.example.cryptolite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SignInAsAUser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_as_auser);

    }
    public void SignInUserButton(View v){
        Intent i = new Intent(this,UserHomePage.class);
        String Email = (((TextView)(findViewById(R.id.UserEmail))).getText()).toString();
        String Password = (((TextView)(findViewById(R.id.UserPassword))).getText()).toString();
        i.putExtra("UserEmail",Email);
        i.putExtra("UserPassword",Password);
        startActivity(i);
    }
}