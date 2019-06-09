package com.activeedge.test;

import org.junit.Test;

import static org.junit.Assert.*;

public class StockControllerTest {

    @Test
    public void createStock() {
        StockService stockService = new StockService();
        Stock testStock = stockService.createStock("Oil", 5000);
        assertEquals(stockService.getAllStocks().get(stockService.getAllStocks().size()-1), testStock );
    }

    @Test
    public void updateStocks() {
    }

    @Test
    public void getAllStocks() {
    }

    @Test
    public void getStock() {
    }
}