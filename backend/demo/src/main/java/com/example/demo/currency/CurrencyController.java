package com.example.demo.currency;

import com.example.demo.client.Client;
import com.example.demo.client.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/currency")
public class CurrencyController {
    private final CurrencyService currencyService ;

    @Autowired
    public CurrencyController(CurrencyService currencyService) {
        this.currencyService = currencyService;
    }

    @GetMapping
    public List<Currency> getCurrencies(){
        return currencyService.getCurrencies() ;
    }

    @PostMapping
    public void registerNewCurrency(@RequestBody Currency currency){
        currencyService.addNewCurrency(currency);
    }

    @DeleteMapping(path ="{currencyId}")
    public void deleteCurrency(@PathVariable("currencyId") Long currencyId){
        currencyService.deleteCurrency(currencyId) ;
    }

    /*
    @PutMapping(path = "{clientId}" )
    public void updateClient(
            @PathVariable("clientId") Long clientId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) int buyingPower){
        clientService.updateClient(clientId,name,buyingPower);
    }*/
}
