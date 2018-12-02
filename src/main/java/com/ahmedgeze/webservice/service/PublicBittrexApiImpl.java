package com.ahmedgeze.webservice.service;

import com.ahmedgeze.webservice.entity.Kur;
import com.ahmedgeze.webservice.manager.CoinManager;
import com.ahmedgeze.webservice.model.bittrex.getcurrencies.GetCurrenciesObject;
import com.ahmedgeze.webservice.model.bittrex.getmarkethistory.GetMarketHistoryObject;
import com.ahmedgeze.webservice.model.bittrex.getmarkets.GetMarketsObject;
import com.ahmedgeze.webservice.model.bittrex.getmarkets.Result;
import com.ahmedgeze.webservice.model.bittrex.getmarketsummaries.GetMarketSummariesObject;
import com.ahmedgeze.webservice.model.bittrex.getorderbook.GetOrderBookObject;
import com.ahmedgeze.webservice.model.bittrex.getticker.GetTickerObject;
import com.ahmedgeze.webservice.repository.CoinRepository;
import com.ahmedgeze.webservice.response.BaseResponse;
import com.ahmedgeze.webservice.response.UniqueKurResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service("publicBittrexApiService")
public class PublicBittrexApiImpl implements PublicBittrexApi {

    @Autowired
    private CoinManager coinManager;

    @Autowired
    private CoinRepository coinRepository;

    final String uri = "https://bittrex.com/api/v1.1/public";

    public List<String> distinctKur() throws IOException {
        GetMarketsObject markets = getAllMarkets();
        List<Result> getMarketResult = markets.getResult();
        List<String> kurList = new ArrayList<>();
        for (Result result : getMarketResult) {
            if (!(kurList.contains(result.getBaseCurrency()))) {
                kurList.add(result.getBaseCurrency());
            }
        }
        return kurList;
    }


    public List<String> controlKurFromDb() throws IOException {
        List<String> kurListFromBittrex = distinctKur();
        List<Kur> kurList = coinManager.findByKurIn(kurListFromBittrex);
        List<String> kurListStringFromDb = new ArrayList<>();
        for (Kur kurFromDb : kurList) {
            kurListStringFromDb.add(kurFromDb.getKur());
        }

        kurListFromBittrex.removeAll(kurListStringFromDb);
        System.out.println(kurListFromBittrex);

        return kurListFromBittrex;


    }

    @Override
    public BaseResponse saveAllKur() throws IOException {
        BaseResponse baseResponse = new BaseResponse();
        List<String> saveList = controlKurFromDb();
        List<Kur> savedObject = new ArrayList<>();
        for (String kur : saveList) {
            Kur kurObj = new Kur();
            kurObj.setKur(kur);
            savedObject.add(kurObj);
        }
        baseResponse.setOperationCode(BaseResponse.SUCCESS_CODE);
        baseResponse.setOperationMessage("Successfully Insert Process");
        baseResponse.setOperationSuccess(true);

        return baseResponse;

    }


    public BaseResponse saveKur(String kurName) {
        BaseResponse response = new BaseResponse();
        Kur kur = new Kur();
        kur.setKur(kurName);
        coinManager.saveKur(kur);
        response.setOperationCode(BaseResponse.SUCCESS_CODE);
        response.setOperationMessage("succes");
        response.setOperationSuccess(true);
        return response;
    }


    public GetMarketsObject getAllMarkets() throws IOException {
        String url = uri + "/getmarkets";
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
        System.out.println("alo");
        System.out.println("ben bir branchim");
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
