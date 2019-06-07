package com.activeedge.test;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StockService {

    private List<Stock> stocks;

   public List<Stock> createAllStocks(){
        stocks = new ArrayList<>();
        stocks.add(new Stock(1, "Cocoa ", 100));
        stocks.add(new Stock(2, "Milk ", 40));
        stocks.add(new Stock(3, "Cement ", 200));
        stocks.add(new Stock(4, "Flour ", 50));
        stocks.add(new Stock(5, "Sugar ", 30));
        stocks.add(new Stock(6, "Salt ", 20));
        return this.stocks;

    }





}
