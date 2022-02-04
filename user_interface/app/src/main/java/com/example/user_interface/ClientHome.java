package com.example.user_interface;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ClientHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_home);
    }

    //call when the client click on the button "Sign Out"
    public void signOut(View view) {
        //create an intent
        Intent intent = new Intent(this, SelectLoginActivity.class);

        //start the intended activity
        startActivity(intent);
    }

    //call when the client click on the button "BID Market"
    public void bidMarket(View view) {
        //create an intent
        Intent intent = new Intent(this, BidMarketActivity.class);

        //start the intended activity
        startActivity(intent);
    }

}