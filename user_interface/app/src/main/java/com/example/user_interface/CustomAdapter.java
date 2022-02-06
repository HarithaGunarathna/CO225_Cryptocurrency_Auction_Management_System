package com.example.user_interface;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.Currency;
import java.util.List;

public class CustomAdapter extends BaseAdapter {

    Context context ;
    List<CurrencyObject> currencyArray ;
    LayoutInflater inflater ;

    public CustomAdapter(Context applicationContext, List<CurrencyObject> currencyArray){
        this.context = applicationContext;
        this.currencyArray = currencyArray;
        this.inflater = (LayoutInflater.from(applicationContext)) ;
    }

    @Override
    public int getCount() {
        return currencyArray.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view =inflater.inflate(R.layout.activity_currency_row,null) ;
        TextView rank = (TextView) view.findViewById(R.id.rankID) ;
        TextView symbol = (TextView) view.findViewById(R.id.symbolID) ;
        TextView CurrencyName = (TextView) view.findViewById(R.id.nameID) ;

        rank.setText(String.valueOf(currencyArray.get(i).getRank()));
        CurrencyName.setText(String.valueOf(currencyArray.get(i).getName()));
        symbol.setText(String.valueOf(currencyArray.get(i).getSymbol()));

        return view ;
    }
}
