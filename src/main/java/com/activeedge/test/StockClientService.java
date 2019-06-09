package com.activeedge.test;

import org.springframework.stereotype.Service;

@Service
public class StockClientService {
    private final String ALL_STOCKS = "http://localhost:8080/api/stocks";
    private final String STOCK_BY_ID = "http://localhost:8080/api/stocks/";
    private final String CREATE_STOCK = "http://localhost:8080/api/stocks/";
    private final String UPDATE_STOCK = "http://localhost:8080/api/stocks/";

}
