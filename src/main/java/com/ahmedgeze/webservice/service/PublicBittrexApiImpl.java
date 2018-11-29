package com.ahmedgeze.webservice.service;

import com.ahmedgeze.webservice.model.bittrex.getcurrencies.GetCurrenciesObject;
import com.ahmedgeze.webservice.model.bittrex.getmarkethistory.GetMarketHistoryObject;
import com.ahmedgeze.webservice.model.bittrex.getmarkets.GetMarketsObject;
import com.ahmedgeze.webservice.model.bittrex.getmarketsummaries.GetMarketSummariesObject;
import com.ahmedgeze.webservice.model.bittrex.getorderbook.GetOrderBookObject;
import com.ahmedgeze.webservice.model.bittrex.getticker.GetTickerObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@Service("publicBittrexApiService")
public class PublicBittrexApiImpl implements PublicBittrexApi {

    public GetMarketsObject getAllMarkets(String url) throws IOException {

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(url, String.class);
        ObjectMapper mapper = new ObjectMapper();
        GetMarketsObject obj = new GetMarketsObject();
        obj = mapper.readValue(result, GetMarketsObject.class);
        return obj;


    }

    @Override
    public GetCurrenciesObject getCurrencies(String url) throws IOException {
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(url, String.class);
        GetCurrenciesObject obj = new GetCurrenciesObject();
        ObjectMapper mapper = new ObjectMapper();
        obj = mapper.readValue(result, GetCurrenciesObject.class);
        return obj;
    }

    @Override
    public GetTickerObject getTicker(String url) throws IOException {
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(url, String.class);
        GetTickerObject obj = new GetTickerObject();
        ObjectMapper mapper = new ObjectMapper();
        obj = mapper.readValue(result, GetTickerObject.class);
        return obj;
    }

    @Override
    public GetMarketSummariesObject getMarketSummaries(String url) throws IOException {
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(url, String.class);
        GetMarketSummariesObject obj = new GetMarketSummariesObject();
        ObjectMapper mapper = new ObjectMapper();
        obj = mapper.readValue(result, GetMarketSummariesObject.class);
        return obj;
    }

    @Override
    public GetOrderBookObject getOrderBook(String url) throws IOException {
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(url, String.class);
        GetOrderBookObject obj = new GetOrderBookObject();
        ObjectMapper mapper = new ObjectMapper();
        obj = mapper.readValue(result, GetOrderBookObject.class);
        return obj;
    }

    @Override
    public GetMarketHistoryObject getMarketHistory(String url) throws IOException {
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(url, String.class);
        GetMarketHistoryObject obj = new GetMarketHistoryObject();
        ObjectMapper mapper = new ObjectMapper();
        obj = mapper.readValue(result, GetMarketHistoryObject.class);
        return obj;


    }


}
