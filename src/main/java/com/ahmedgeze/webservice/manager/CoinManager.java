package com.ahmedgeze.webservice.manager;


import com.ahmedgeze.webservice.entity.Kur;
import com.ahmedgeze.webservice.repository.CoinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CoinManager {
    @Autowired
    private CoinRepository coinRepository;


    public Kur saveKur(Kur kur){
        return  coinRepository.save(kur);
    }

    public List<Kur> findByKur(){
        return coinRepository.findByKur("BTC");
    }

    public List<Kur> findByKurIn(List<String> kurList){
        return coinRepository.findByKurIn(kurList);
    }






}
