package com.example.user_interface;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignInAsAClientActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_as_aclient);
    }

    //call when the client click on the button "login as an Administrator"
    public void signInAsAClient(View view){
        //create an intent
        Intent intent = new Intent(this , ClientHome.class) ;

        //start the intended activity
        startActivity(intent) ;
    }

}