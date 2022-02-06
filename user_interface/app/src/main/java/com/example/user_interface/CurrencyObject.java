package com.example.user_interface;

public class CurrencyObject {
    private String name ;
    private String symbol ;
    int rank;

    public CurrencyObject(){
        this.name = name;
        this.symbol = symbol;
        this.rank = rank ;
    }

    public int getRank() {
        return rank;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}
