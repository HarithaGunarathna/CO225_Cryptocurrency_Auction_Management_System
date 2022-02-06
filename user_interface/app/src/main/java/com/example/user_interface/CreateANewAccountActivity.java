package com.example.user_interface;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CreateANewAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_a_new_account);
    }

    //call when the client click on the button "login as an Administrator"
    public void createAccount(View view) {
        //create an intent
        Intent intent = new Intent(this, SelectLoginActivity.class);

        //start the intended activity
        startActivity(intent);
    }
}