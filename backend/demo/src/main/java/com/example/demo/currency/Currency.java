package com.example.demo.currency;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Currency {
    @Id
    @SequenceGenerator(name="currency_sequence" , sequenceName = "currency_sequence" , allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY , generator = "currency_sequence")

    private Long ran ;
    private String name ;
    private String symbol;
    private int marketPrice;
    private Long maxBidPerson;
    private int maxBid;

    public Currency() {
    }

    public Currency(Long rank, String name, String symbol, int marketPrice, Long maxBidPerson, int maxBid) {
        this.ran = rank;
        this.name = name;
        this.symbol = symbol;
        this.marketPrice = marketPrice;
        this.maxBidPerson = maxBidPerson;
        this.maxBid = maxBid;
    }

    public Currency(String name, String symbol, int marketPrice, Long maxBidPerson, int maxBid) {
        this.name = name;
        this.symbol = symbol;
        this.marketPrice = marketPrice;
        this.maxBidPerson = maxBidPerson;
        this.maxBid = maxBid;
    }

    public Long getRank() {
        return ran;
    }

    public void setRank(Long rank) {
        this.ran = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(int marketPrice) {
        this.marketPrice = marketPrice;
    }

    public Long getMaxBidPerson() {
        return maxBidPerson;
    }

    public void setMaxBidPerson(Long maxBidPerson) {
        this.maxBidPerson = maxBidPerson;
    }

    public int getMaxBid() {
        return maxBid;
    }

    public void setMaxBid(int maxBid) {
        this.maxBid = maxBid;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "rank=" + ran +
                ", name='" + name + '\'' +
                ", symbol='" + symbol + '\'' +
                ", marketPrice=" + marketPrice +
                ", maxBidPerson=" + maxBidPerson +
                ", maxBid=" + maxBid +
                '}';
    }
}
