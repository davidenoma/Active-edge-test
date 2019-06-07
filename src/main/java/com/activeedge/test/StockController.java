package com.activeedge.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/stocks")
public class StockController {
//    StockService
    @Autowired
    public StockService stockService;

    public StockController(StockService stockService){
        this.stockService = stockService;
    }


    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void createStock(Stock stock){

    }
    @RequestMapping(method = RequestMethod.PUT)
    public void updateStocks(int stockId){


    }
    @RequestMapping(method = RequestMethod.GET, path = "/api/stocks")
    public List<Stock> getAllStocks(){

        return stockService.getAllStocks();
    }
    @RequestMapping(method = RequestMethod.GET, path = "api/stocks/{id}")
    public void getStock(int stockId){


    }
}
