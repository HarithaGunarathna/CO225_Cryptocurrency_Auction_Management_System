package com.example.cryptolite;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.content.Context;

import com.example.cryptolite.databinding.ActivityUserHomePageBinding;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class UserHomePage extends AppCompatActivity {
    private String UserEmail;
    private String UserPassword;

    //ActivityUserHomePageBinding binding;
    //ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  binding= DataBindingUtil.setContentView(this,R.layout.activity_user_home_page);


        setContentView(R.layout.activity_user_home_page);
        Intent i =getIntent();
        UserEmail = i.getStringExtra("UserEmail");
        UserPassword = i.getStringExtra("UserPassword");

        String Greeting = "Hello "+UserEmail;
        ((TextView)findViewById(R.id.GreetingText)).setText(Greeting);
       // binding.GreetingText.setText(Greeting);


        Button Signout = ((Button)findViewById(R.id.button6));
       // Button Signout = binding.button6;
        Signout.setTextColor(Color.BLACK);
        Signout.setBackgroundColor(Color.WHITE);

      // listView = (ListView)findViewById(R.id.listview);
        readCyptoData();


    }
    private ArrayList<CoinEntry> coinEntryList = new ArrayList<>();
    public void readCyptoData(){
        InputStream is = getResources().openRawResource(R.raw.cryptocurrency);
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(is, Charset.forName("UTF-8"))
        );
        String line = " ";
        try {
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(",");
                CoinEntry sample = new CoinEntry(tokens[0],tokens[1],Integer.parseInt(tokens[2]));
                coinEntryList.add(sample);

                Log.d("MobileActivity","Just Created:"+sample);
            }
        } catch (IOException e) {
            Log.wtf("ERROR: Reading .csv file"+line,e);e.printStackTrace();
        }

//        ArrayList<CoinEntry > arrayList = new ArrayList<>();
//        String[] Symbol1 = {"BIT","TOT","BOT"};
//        String[] Name1 = {"Bitcoin","totCoin","Botcoin"};
//        int [] rank1 ={1,2,3};
//        for(int i=0;i<3;i++){
//            CoinEntry coin = new CoinEntry(Symbol1[i],Name1[i],rank1[i]);
//            arrayList.add(coin);
//        }
        ListAdapter listAdapter = new ListAdapter(UserHomePage.this,coinEntryList);

        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(listAdapter);
        listView.setClickable(true);
  //      listview.setClickable(true);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent t = new Intent(UserHomePage.this,MainActivity.class);
                startActivity(t);
            }
        });
    }
    public void SignOutButton(View v){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }

}