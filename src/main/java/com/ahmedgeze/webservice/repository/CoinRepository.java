package com.ahmedgeze.webservice.repository;

import com.ahmedgeze.webservice.entity.Kur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CoinRepository extends JpaRepository<Kur,Integer> {
    Kur save(Kur kur);
    List<Kur> findByKur(String name);
    List<Kur> findByKurIn(List<String> kurList);

}



