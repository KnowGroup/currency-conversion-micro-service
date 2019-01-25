package org.know.micro.services.currencyconversionmicroservice.model;

import java.math.BigInteger;

/**
 *
 * @author KnowGroup
 */
public class CurrencyConversion {

    private Integer id;
    private String from;
    private String to;
    private BigInteger conversionMultiple;
    private BigInteger quantity;
    private BigInteger totalConversion;
    private Integer port;

    public CurrencyConversion() {
    }

    public CurrencyConversion(Integer id, String from, String to, BigInteger conversionMultiple, BigInteger quantity, BigInteger totalConversion) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionMultiple = conversionMultiple;
        this.quantity = quantity;
        this.totalConversion = totalConversion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigInteger getConversionMultiple() {
        return conversionMultiple;
    }

    public void setConversionMultiple(BigInteger conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }

    public BigInteger getQuantity() {
        return quantity;
    }

    public void setQuantity(BigInteger quantity) {
        this.quantity = quantity;
    }

    public BigInteger getTotalConversion() {
        return totalConversion;
    }

    public void setTotalConversion(BigInteger totalConversion) {
        this.totalConversion = totalConversion;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }
      
}
