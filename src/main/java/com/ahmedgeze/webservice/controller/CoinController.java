package com.ahmedgeze.webservice.controller;


import com.ahmedgeze.webservice.entity.Kur;
import com.ahmedgeze.webservice.model.bittrex.getcurrencies.GetCurrenciesObject;
import com.ahmedgeze.webservice.model.bittrex.getmarkethistory.GetMarketHistoryObject;
import com.ahmedgeze.webservice.model.bittrex.getmarkets.GetMarketsObject;
import com.ahmedgeze.webservice.model.bittrex.getmarketsummaries.GetMarketSummariesObject;
import com.ahmedgeze.webservice.model.bittrex.getorderbook.GetOrderBookObject;
import com.ahmedgeze.webservice.model.bittrex.getticker.GetTickerObject;
import com.ahmedgeze.webservice.repository.CoinRepository;
import com.ahmedgeze.webservice.response.BaseResponse;
import com.ahmedgeze.webservice.response.UniqueKurResponse;
import com.ahmedgeze.webservice.service.PublicBittrexApiImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "coin")
public class CoinController {

    @Autowired
    private CoinRepository coinRepository;

    @Autowired
    private PublicBittrexApiImpl publicBittrexApi;

    final String uri = "https://bittrex.com/api/v1.1/public";


    @RequestMapping(value = "getMarkets", method = {RequestMethod.GET})
    public GetMarketsObject listAllMarket() throws IOException {
        return publicBittrexApi.getAllMarkets();
    }

    @RequestMapping(value = "getCurrencies", method = {RequestMethod.GET})
    public GetCurrenciesObject getCurrencies() throws IOException {
        String url = uri + "/getcurrencies";
        return publicBittrexApi.getCurrencies(url);


    }

    @RequestMapping(value = "getTicker", method = {RequestMethod.GET})
    public GetTickerObject getTicker(@RequestParam("market") String marketName) throws IOException {
        String url = uri + "/getticker?market=" + marketName;
        return publicBittrexApi.getTicker(url);
    }

    @RequestMapping(value = "getMarketSummaries", method = {RequestMethod.GET})
    public GetMarketSummariesObject getMarketSummaries() throws IOException {
        String url = uri + "/getmarketsummaries";
        return publicBittrexApi.getMarketSummaries(url);


    }

    @RequestMapping(value = "getMarketSummary", method = {RequestMethod.GET})
    public GetMarketSummariesObject getMarketSummary(@RequestParam("market") String marketName) throws IOException {
        String url = uri + "/getmarketsummary?market=" + marketName;
        return publicBittrexApi.getMarketSummaries(url);

    }

    @RequestMapping(value = "getOrderBook", method = {RequestMethod.GET})
    public GetOrderBookObject getOrderBook(@RequestParam("market") String marketName, @RequestParam("type") String type) throws IOException {
        String url = uri + "/getorderbook?market=" + marketName + "&type=" + type;
        return publicBittrexApi.getOrderBook(url);


    }


    @RequestMapping(value = "getMarketHistory", method = {RequestMethod.GET})
    public GetMarketHistoryObject getMarketHistory(@RequestParam("market") String marketName) throws IOException {
        String url = uri + "/getmarkethistory?market=" + marketName;
        return publicBittrexApi.getMarketHistory(url);


    }

    @RequestMapping(value = "saveKur", method = {RequestMethod.POST, RequestMethod.GET})
    public BaseResponse saveKur(@RequestParam("kur") String kurName) throws IOException {
        GetMarketsObject allMarket = new GetMarketsObject();
        allMarket = publicBittrexApi.getAllMarkets();
        System.out.println();

        return publicBittrexApi.saveKur("BTC");

    }

    @RequestMapping(value = "getKur", method = {RequestMethod.POST, RequestMethod.GET})
    public BaseResponse getKur() throws IOException {
        UniqueKurResponse response = new UniqueKurResponse();
        List<String> uniqueKur = publicBittrexApi.distinctKur();
        response.setKurList(uniqueKur);
        return response;
    }

    @RequestMapping(value = "getKurDistinct", method = {RequestMethod.POST, RequestMethod.GET})
    public BaseResponse getKurDistinct() throws IOException {
        UniqueKurResponse response = new UniqueKurResponse();
        List<String> uniqueKur = publicBittrexApi.controlKurFromDb();
        response.setKurList(uniqueKur);
        response.setOperationCode(BaseResponse.SUCCESS_CODE);
        response.setOperationSuccess(true);
        response.setOperationMessage("Success with distinct Kur");
        return response;
    }


    @RequestMapping(value = "saveDistinctKur", method = {RequestMethod.POST, RequestMethod.GET})
    public BaseResponse saveDistinctKur() throws IOException {
        return publicBittrexApi.saveAllKur();

    }


}
