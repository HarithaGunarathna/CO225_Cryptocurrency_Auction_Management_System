package com.example.cryptolite;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;


public class ListAdapter extends ArrayAdapter<CoinEntry> {

    public ListAdapter(Context context, ArrayList<CoinEntry> coinArrayList){
        super(context,R.layout.list_item,coinArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        CoinEntry coin = getItem(position);

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        TextView SymbolView = convertView.findViewById(R.id.Symbol_block);
        TextView NameView = convertView.findViewById(R.id.Name_Block);
        TextView RankView = convertView.findViewById(R.id.Rank_Block);

        SymbolView.setText(coin.Symbol);
        NameView.setText(coin.Name);
        RankView.setText(coin.Rank+"");

        return convertView;
    }
}
