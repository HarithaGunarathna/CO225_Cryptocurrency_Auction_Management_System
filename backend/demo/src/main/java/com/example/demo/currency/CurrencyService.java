package com.example.demo.currency;


import com.example.demo.client.Client;
import com.example.demo.client.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class CurrencyService {
    private final CurrencyRepository currencyRepository;

    @Autowired
    public CurrencyService(CurrencyRepository currencyRepository) {
        this.currencyRepository = currencyRepository;
    }


    public List<Currency> getCurrencies(){
        return currencyRepository.findAll();
    }

    public void addNewCurrency(Currency currency) {
        Optional <Currency> currencyOptional = currencyRepository.findCurrencyByName(currency.getName()) ;

        if(currencyOptional.isPresent()){
            throw new IllegalStateException("Currency Name Taken") ;
        }

        currencyRepository.save(currency) ;

    }

    public void deleteCurrency(Long currencyId) {
        boolean exists =currencyRepository.existsById(currencyId);

        if(!exists){
            throw new IllegalStateException("Currency with id " + currencyId+ " does not exist");
        }
        currencyRepository.deleteById(currencyId);
    }

/*
    @Transactional
    public void updateClient(Long clientId, String name, int  buyingPower) {
        Client client = clientRepository.findById(clientId).orElseThrow(()->new IllegalStateException("client with id " + clientId+ " does not exist"));

        if (name != null && name.length()>0 && !Objects.equals(client.getName(),name)){
            client.setName(name);
        }

        if (buyingPower>0 ){
            client.setBuyingPower(buyingPower);
        }
    }*/
}
