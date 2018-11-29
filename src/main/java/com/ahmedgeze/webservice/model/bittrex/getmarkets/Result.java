package com.ahmedgeze.webservice.model.bittrex.getmarkets;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "MarketCurrency",
        "BaseCurrency",
        "MarketCurrencyLong",
        "BaseCurrencyLong",
        "MinTradeSize",
        "MarketName",
        "IsActive",
        "IsRestricted",
        "Created",
        "Notice",
        "IsSponsored",
        "LogoUrl"
})
public class Result {

    @JsonProperty("MarketCurrency")
    private String marketCurrency;
    @JsonProperty("BaseCurrency")
    private String baseCurrency;
    @JsonProperty("MarketCurrencyLong")
    private String marketCurrencyLong;
    @JsonProperty("BaseCurrencyLong")
    private String baseCurrencyLong;
    @JsonProperty("MinTradeSize")
    private float minTradeSize;
    @JsonProperty("MarketName")
    private String marketName;
    @JsonProperty("IsActive")
    private boolean isActive;
    @JsonProperty("IsRestricted")
    private boolean isRestricted;
    @JsonProperty("Created")
    private String created;
    @JsonProperty("Notice")
    private Object notice;
    @JsonProperty("IsSponsored")
    private Object isSponsored;
    @JsonProperty("LogoUrl")
    private String logoUrl;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("MarketCurrency")
    public String getMarketCurrency() {
        return marketCurrency;
    }

    @JsonProperty("MarketCurrency")
    public void setMarketCurrency(String marketCurrency) {
        this.marketCurrency = marketCurrency;
    }

    @JsonProperty("BaseCurrency")
    public String getBaseCurrency() {
        return baseCurrency;
    }

    @JsonProperty("BaseCurrency")
    public void setBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    @JsonProperty("MarketCurrencyLong")
    public String getMarketCurrencyLong() {
        return marketCurrencyLong;
    }

    @JsonProperty("MarketCurrencyLong")
    public void setMarketCurrencyLong(String marketCurrencyLong) {
        this.marketCurrencyLong = marketCurrencyLong;
    }

    @JsonProperty("BaseCurrencyLong")
    public String getBaseCurrencyLong() {
        return baseCurrencyLong;
    }

    @JsonProperty("BaseCurrencyLong")
    public void setBaseCurrencyLong(String baseCurrencyLong) {
        this.baseCurrencyLong = baseCurrencyLong;
    }

    @JsonProperty("MinTradeSize")
    public float getMinTradeSize() {
        return minTradeSize;
    }

    @JsonProperty("MinTradeSize")
    public void setMinTradeSize(float minTradeSize) {
        this.minTradeSize = minTradeSize;
    }

    @JsonProperty("MarketName")
    public String getMarketName() {
        return marketName;
    }

    @JsonProperty("MarketName")
    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }

    @JsonProperty("IsActive")
    public boolean isIsActive() {
        return isActive;
    }

    @JsonProperty("IsActive")
    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    @JsonProperty("IsRestricted")
    public boolean isIsRestricted() {
        return isRestricted;
    }

    @JsonProperty("IsRestricted")
    public void setIsRestricted(boolean isRestricted) {
        this.isRestricted = isRestricted;
    }

    @JsonProperty("Created")
    public String getCreated() {
        return created;
    }

    @JsonProperty("Created")
    public void setCreated(String created) {
        this.created = created;
    }

    @JsonProperty("Notice")
    public Object getNotice() {
        return notice;
    }

    @JsonProperty("Notice")
    public void setNotice(Object notice) {
        this.notice = notice;
    }

    @JsonProperty("IsSponsored")
    public Object getIsSponsored() {
        return isSponsored;
    }

    @JsonProperty("IsSponsored")
    public void setIsSponsored(Object isSponsored) {
        this.isSponsored = isSponsored;
    }

    @JsonProperty("LogoUrl")
    public String getLogoUrl() {
        return logoUrl;
    }

    @JsonProperty("LogoUrl")
    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
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