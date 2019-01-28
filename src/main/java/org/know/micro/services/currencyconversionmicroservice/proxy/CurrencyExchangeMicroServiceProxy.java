package org.know.micro.services.currencyconversionmicroservice.proxy;

import org.know.micro.services.currencyconversionmicroservice.model.CurrencyConversion;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author KnowGroup
 */
@FeignClient("currency-exchange-micro-service")
@RibbonClient("currency-exchange-micro-service")
public interface CurrencyExchangeMicroServiceProxy {

       @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyConversion exchangeConversionRate(@PathVariable("from") String from, 
            @PathVariable("to") String to);
    
}
