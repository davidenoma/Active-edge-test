package com.activeedge.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class StockServiceTest {

    @Test
    public void createAllStocks() {
        List allStocks = new StockService().createAllStocks();
        assertEquals(allStocks, new StockService().createAllStocks());

    }
    @Test
    public void createStock(){
        Stock stock = new Stock(1,"gas",2008);
        assertEquals("gas",stock.getName());
    }

    @Test
    public void getStock() {


    }
    @Test
    public void updateStock(){
        List <Stock>allStocks = new StockService().createAllStocks();
       Stock dummy =  allStocks.get(0);
       dummy.setCurrentPrice(500);
        assertEquals(500, dummy.getCurrentPrice() );
    }
}