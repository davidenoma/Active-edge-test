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




    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public String createStock( @PathVariable("stockName") String stockName,
                             @PathVariable("stockPrice") int stockPrice){

        return stockService.createStock(stockName,stockPrice).toString();

    }

    @RequestMapping(method = RequestMethod.PUT)
    public String updateStocks(@PathVariable("id") int stockId,
                               @PathVariable("newName") String newName,
                              @PathVariable("newPrice") int newPrice){
        
        return stockService.updateStock(stockId,newName,newPrice).toString();
    }

    @RequestMapping(method = RequestMethod.GET, path="/api/stocks")
    public List<Stock> getAllStocks(){

        return this.stockService.getAllStocks();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/api/stocks/{id}")
    public Stock getStock(@PathVariable("id")int stockId){

    return stockService.getStock(stockId);
    }
}
