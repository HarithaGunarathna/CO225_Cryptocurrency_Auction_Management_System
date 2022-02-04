package com.example.user_interface;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SelectLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_login);
    }

    //call when the client click on the button "login as a client"
    public void signInAsAClient(View view){
        //create an intent
        Intent intent = new Intent(this , SignInAsAClientActivity.class) ;

        //start The intended activity
        startActivity(intent) ;
    }

    //call when the client click on the button "login as an Administrator"
    public void createANewAccount(View view){
        //create an intent
        Intent intent = new Intent(this , CreateANewAccountActivity.class) ;

        //start the intended activity
        startActivity(intent) ;
    }


}