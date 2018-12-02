package com.ahmedgeze.webservice.repository;

import com.ahmedgeze.webservice.entity.Kur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CoinRepository extends CrudRepository<Kur,Integer>  {
    Kur save(Kur kur);
    <S extends Kur> Iterable<S> saveAll(Iterable<S> entities);
    List<Kur> findByKur(String name);
    List<Kur> findByKurIn(List<String> kurList);


}



