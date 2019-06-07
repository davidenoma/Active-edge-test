package com.activeedge.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/")
public class StockController {
//    StockService
    @Autowired
    public StockService stockService;

    public StockController(StockService stockService){
        this.stockService = new StockService();
    }


    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void createStock(Stock stock){

    }
    @RequestMapping(method = RequestMethod.PUT)
    public void updateStocks(int stockId){


    }
    @RequestMapping(method = RequestMethod.GET)
    public List<Stock> getAllStocks(){

        return stockService.getAllStocks();
    }
    @RequestMapping(method = RequestMethod.GET, path = "api/stocks/{id}")
    public Stock getStock(@PathVariable(value = "stockId")int stockId){

    return stockService.getStock(stockId);
    }
}
