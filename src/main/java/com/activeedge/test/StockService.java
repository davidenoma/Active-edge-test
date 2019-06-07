package com.activeedge.test;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StockService {

    private static List<Stock>  stocks = new ArrayList<>();
    StockService(){
        createAllStocks();
    }


   public List<Stock> createAllStocks(){


        stocks.add(new Stock(1, "Cocoa ", 100));
        stocks.add(new Stock(2, "Milk ", 40));
        stocks.add(new Stock(3, "Cement ", 200));
        stocks.add(new Stock(4, "Flour ", 50));
        stocks.add(new Stock(5, "Sugar ", 30));
        stocks.add(new Stock(6, "Salt ", 20));
        return stocks;
    }
    List<Stock> getAllStocks(){
        return stocks;
    }
    Stock getStock(int stockId){

        return stocks.get(stockId);
    }






}
