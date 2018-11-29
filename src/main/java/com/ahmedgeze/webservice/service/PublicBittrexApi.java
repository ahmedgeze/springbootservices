package com.ahmedgeze.webservice.service;

import com.ahmedgeze.webservice.model.bittrex.getcurrencies.GetCurrenciesObject;
import com.ahmedgeze.webservice.model.bittrex.getmarkethistory.GetMarketHistoryObject;
import com.ahmedgeze.webservice.model.bittrex.getmarkets.GetMarketsObject;
import com.ahmedgeze.webservice.model.bittrex.getmarketsummaries.GetMarketSummariesObject;
import com.ahmedgeze.webservice.model.bittrex.getorderbook.GetOrderBookObject;
import com.ahmedgeze.webservice.model.bittrex.getticker.GetTickerObject;

import java.io.IOException;

public interface PublicBittrexApi {

     GetMarketsObject getAllMarkets(String url) throws IOException;

     GetCurrenciesObject getCurrencies(String url) throws IOException;

     GetTickerObject getTicker(String url) throws IOException;

     GetMarketSummariesObject getMarketSummaries(String url) throws IOException;

     GetOrderBookObject getOrderBook(String url) throws  IOException;

     GetMarketHistoryObject getMarketHistory(String url) throws  IOException;

}
