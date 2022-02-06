package com.example.user_interface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

public class BidMarketActivity extends AppCompatActivity {

    //String[] currencies = {"Win XP" ,"Ishta" , "Thumula" , "ganidu" , "Chathura","Ishta" , "Thumula" , "ganidu" , "Chathura","Ishta" , "Thumula" , "ganidu" , "Chathura","Ishta" , "Thumula" , "ganidu" , "Chathura","Ishta" , "Thumula" , "ganidu" , "Chathura","Ishta" , "Thumula" , "ganidu" , "Chathura","Ishta" , "Thumula" , "ganidu" , "Chathura","Ishta" , "Thumula" , "ganidu" , "Chathura","Ishta" , "Thumula" , "ganidu" , "Chathura","Ishta" , "Thumula" , "ganidu" , "Chathura","Ishta" , "Thumula" , "ganidu" , "Chathura","Ishta" , "Thumula" , "ganidu" , "Chathura","Ishta" , "Thumula" , "ganidu" , "Chathura","Ishta" , "Thumula" , "ganidu" , "Chathura","Ishta" , "Thumula" , "ganidu" , "Chathura","Ishta" , "Thumula" , "ganidu" , "Chathura","Ishta" , "Thumula" , "ganidu" , "Chathura"} ;
    ListView listView ;
    //String fileCurrencies ="cryptocurrency.csv";
    //String line = "" ;



    private List<CurrencyObject> currencyArray = new ArrayList<CurrencyObject>() ;

    private void readCsv(){
        InputStream is = getResources().openRawResource(R.raw.cryptocurrency) ;
        BufferedReader reader = new BufferedReader(new InputStreamReader(is,Charset.forName("UTF-8"))) ;

        String line = "" ;

        try {
            line= reader.readLine() ;

            while ((line= reader.readLine()) != null){
                String[] tokens =line.split(",");

                CurrencyObject currencyObject = new CurrencyObject();
                currencyObject.setRank(Integer.parseInt(tokens[2]));
                currencyObject.setSymbol(tokens[0]);
                currencyObject.setName(tokens[1]);

                currencyArray.add(currencyObject) ;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



/*
    {
        try {
            br = new BufferedReader(new FileReader(fileCurrencies));
            line = br.readLine() ;
            while ((line = br.readLine())!=null){
                String[] values = line.split(",");
                currencyArray[i] = new CurrencyObject((Integer.parseInt(values[2])) , values[0] , values[1]) ;
                i++ ;
                System.out.println(values[0]);
                if(i==10) break ;

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
*/


    //CurrencyObject a = new CurrencyObject( 1,"BTC","Bitcoin");
    //CurrencyObject b = new CurrencyObject(2,"OMC","Omicron");
    //CurrencyObject currencyArray[] ={a,b};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bid_market);

        readCsv();

        listView =(ListView) findViewById(R.id.window_list_id) ;
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext() ,currencyArray);
        listView.setAdapter(customAdapter);


    }




}