package com.example.user_interface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;

public class BidMarketActivity extends AppCompatActivity {

    String[] currencies = {"Win XP" ,"Ishta" , "Thumula" , "ganidu" , "Chathura"} ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bid_market);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.activty_listview ,currencies) ;

        ListView listView = (ListView)findViewById(R.id.window_list);
        listView.setAdapter(adapter);
    }


}