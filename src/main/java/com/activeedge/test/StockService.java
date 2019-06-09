package com.activeedge.test;

import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
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
    public List<Stock> getAllStocks(){
        return stocks;
    }
    public Stock getStock(int stockId){

        return stocks.get(stockId);
    }
    public void updateStock(int stockId, String name, int currentPrice){
       Stock stock =  stocks.get(stockId);
       stock.setId(stockId);
       stock.setName(name);
       stock.setCurrentPrice(currentPrice);
       stock.setLastUpdate(new Timestamp(new Date().getTime()));
    }

    public Stock createStock(String name, int currentPrice){
        int id =  stocks.size();
       Stock createdStock =   new Stock(id, name, currentPrice);
        System.out.println();
       return createdStock;
    }







}
