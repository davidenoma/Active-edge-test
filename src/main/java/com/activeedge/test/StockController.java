package com.activeedge.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/")
public class StockController {
//    StockService
    @Autowired
    public StockService stockService;




    @RequestMapping(method = RequestMethod.POST, path = "/api/stocks" , consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Stock> createStock(@RequestBody Stock stock  ){

        stockService.createStock(stock.getName(),stock.getCurrentPrice());
        return new ResponseEntity<>(stock, HttpStatus.CREATED);

    }

    @RequestMapping(method = RequestMethod.PUT, path = "api/stocks/{id}", consumes = "application/json")
    public Stock updateStocks(@PathVariable("id") int stockId, @RequestBody Stock stock){

      return stockService.updateStock(stockId,stock) ;


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
