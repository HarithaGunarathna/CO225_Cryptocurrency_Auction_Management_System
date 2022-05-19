package com.example.demo.currency;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CurrencyRepository extends JpaRepository<Currency , Long> {

@Query("SELECT c FROM Currency  c WHERE c.name=?1")
    Optional<Currency > findCurrencyByName(String name);
        }