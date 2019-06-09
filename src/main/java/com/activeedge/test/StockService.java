package com.activeedge.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class StockService {
    @Autowired
    private static List<Stock>  stocks;

    public StockService(){
        createAllStocks();
    }


   public List<Stock> createAllStocks(){

        stocks = new ArrayList<>();
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
    public Stock updateStock(int stockId, Stock stock){
       if(stockId == stocks.size()){
           stockId -= 1;
       }
        Stock updateStock =  stocks.get(stockId);
        System.out.println("Before"+ stock.toString());

       updateStock.setName(stock.getName());
       updateStock.setCurrentPrice(stock.getCurrentPrice());
       updateStock.setLastUpdate(new Timestamp(new Date().getTime()));
        System.out.println("After "+ stock.toString());
        return updateStock;
    }

    public Stock createStock(String name, int currentPrice){

        int id =  stocks.size()+1;

        Stock createdStock =   new Stock(id, name, currentPrice);
        stocks.add(createdStock);
        System.out.println("latest Stock = " + stocks.get(stocks.size() -1 ));
        System.out.println(createdStock.toString());
       return createdStock;
    }







}
