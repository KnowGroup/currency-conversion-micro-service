package org.know.micro.services.currencyconversionmicroservice.resource;

import java.math.BigInteger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.know.micro.services.currencyconversionmicroservice.model.CurrencyConversion;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author KnowGroup
 */
@RestController
public class CurrencyConversionResource {

    @GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversion convert(@PathVariable String from,
                        @PathVariable String to,
                        @PathVariable Integer quantity) throws Exception{
        
        final Map<String,String> pathVariables = new ConcurrentHashMap<>();
            pathVariables.put("to", to);
            pathVariables.put("from", from);
        final ResponseEntity<CurrencyConversion> responseEntity = new RestTemplate().
                getForEntity("http://localhost:8000/currency-exchange/from/{from}/to/{to}",CurrencyConversion.class,pathVariables);
        final CurrencyConversion response = responseEntity.getBody();
        final CurrencyConversion result = new CurrencyConversion(response.getId(),
                from,to,response.getConversionMultiple(),new BigInteger(quantity+""),
                response.getConversionMultiple().multiply(new BigInteger(quantity+"")));
        result.setPort(response.getPort());
        return result;
    }
}