package com.github.fwerther28.controller;

import com.github.fwerther28.environment.InstanceInformationService;
import com.github.fwerther28.model.Exchange;
import com.github.fwerther28.repository.ExchangeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("exchange-service")
public class ExchangeController {

    @Autowired
    InstanceInformationService informationService;

    @Autowired
    ExchangeRepository repository;

    //http://localhost:8000/exchange-service/5/USD/BRL

    @GetMapping(value = "/{amount}/{from}/{to}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Exchange getExchange(
            @PathVariable("amount") BigDecimal amount,
            @PathVariable("from") String from,
            @PathVariable("to") String to){

         Exchange exchange = repository.findByFromAndTo(from, to);

         if (exchange == null) throw new RuntimeException("Currency Unsupported");

         BigDecimal conversionFactor = exchange.getConversionFactor();
         BigDecimal conversionValue = conversionFactor.multiply(amount);
         exchange.setConvertedValue(conversionValue);
         exchange.setEnvironment("PORT " + informationService.retrieveServerPort());

         return exchange;
    }
}
