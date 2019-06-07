package com.activeedge.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/stocks")
public class StockController {
//    StockService


    public void createStock(Stock stock){

    }
    public void updateStocks(int stockId){


    }
    @RequestMapping(method = RequestMethod.GET, path = "/api/stocks")
    public String getAllStocks(){

        return "stocks";
    }
    @RequestMapping(method = RequestMethod.GET, path = "api/stocks/id")
    public void getStock(int stockId){


    }
}
