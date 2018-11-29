package com.ahmedgeze.webservice.model.bittrex.getcurrencies;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Currency",
        "CurrencyLong",
        "MinConfirmation",
        "TxFee",
        "IsActive",
        "CoinType",
        "BaseAddress"
})

public class CurrenciesResult {
    @JsonProperty("Currency")
    private String currency;
    @JsonProperty("CurrencyLong")
    private String currencyLong;
    @JsonProperty("MinConfirmation")
    private long minConfirmation;
    @JsonProperty("TxFee")
    private float txFee;
    @JsonProperty("IsActive")
    private boolean isActive;
    @JsonProperty("CoinType")
    private String coinType;
    @JsonProperty("BaseAddress")
    private Object baseAddress;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("Currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("CurrencyLong")
    public String getCurrencyLong() {
        return currencyLong;
    }

    @JsonProperty("CurrencyLong")
    public void setCurrencyLong(String currencyLong) {
        this.currencyLong = currencyLong;
    }

    @JsonProperty("MinConfirmation")
    public long getMinConfirmation() {
        return minConfirmation;
    }

    @JsonProperty("MinConfirmation")
    public void setMinConfirmation(long minConfirmation) {
        this.minConfirmation = minConfirmation;
    }

    @JsonProperty("TxFee")
    public float getTxFee() {
        return txFee;
    }

    @JsonProperty("TxFee")
    public void setTxFee(float txFee) {
        this.txFee = txFee;
    }

    @JsonProperty("IsActive")
    public boolean isIsActive() {
        return isActive;
    }

    @JsonProperty("IsActive")
    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    @JsonProperty("CoinType")
    public String getCoinType() {
        return coinType;
    }

    @JsonProperty("CoinType")
    public void setCoinType(String coinType) {
        this.coinType = coinType;
    }

    @JsonProperty("BaseAddress")
    public Object getBaseAddress() {
        return baseAddress;
    }

    @JsonProperty("BaseAddress")
    public void setBaseAddress(Object baseAddress) {
        this.baseAddress = baseAddress;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}
