package com.ahmedgeze.webservice.model.bittrex.getmarketsummaries;

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
        "MarketName",
        "High",
        "Low",
        "Volume",
        "Last",
        "BaseVolume",
        "TimeStamp",
        "Bid",
        "Ask",
        "OpenBuyOrders",
        "OpenSellOrders",
        "PrevDay",
        "Created",
        "DisplayMarketName"
})
public class GetMarketSummariesResult {

    @JsonProperty("MarketName")
    private String marketName;
    @JsonProperty("High")
    private float high;
    @JsonProperty("Low")
    private float low;
    @JsonProperty("Volume")
    private float volume;
    @JsonProperty("Last")
    private float last;
    @JsonProperty("BaseVolume")
    private float baseVolume;
    @JsonProperty("TimeStamp")
    private String timeStamp;
    @JsonProperty("Bid")
    private float bid;
    @JsonProperty("Ask")
    private float ask;
    @JsonProperty("OpenBuyOrders")
    private long openBuyOrders;
    @JsonProperty("OpenSellOrders")
    private long openSellOrders;
    @JsonProperty("PrevDay")
    private float prevDay;
    @JsonProperty("Created")
    private String created;
    @JsonProperty("DisplayMarketName")
    private Object displayMarketName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("MarketName")
    public String getMarketName() {
        return marketName;
    }

    @JsonProperty("MarketName")
    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }

    @JsonProperty("High")
    public float getHigh() {
        return high;
    }

    @JsonProperty("High")
    public void setHigh(float high) {
        this.high = high;
    }

    @JsonProperty("Low")
    public float getLow() {
        return low;
    }

    @JsonProperty("Low")
    public void setLow(float low) {
        this.low = low;
    }

    @JsonProperty("Volume")
    public float getVolume() {
        return volume;
    }

    @JsonProperty("Volume")
    public void setVolume(float volume) {
        this.volume = volume;
    }

    @JsonProperty("Last")
    public float getLast() {
        return last;
    }

    @JsonProperty("Last")
    public void setLast(float last) {
        this.last = last;
    }

    @JsonProperty("BaseVolume")
    public float getBaseVolume() {
        return baseVolume;
    }

    @JsonProperty("BaseVolume")
    public void setBaseVolume(float baseVolume) {
        this.baseVolume = baseVolume;
    }

    @JsonProperty("TimeStamp")
    public String getTimeStamp() {
        return timeStamp;
    }

    @JsonProperty("TimeStamp")
    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    @JsonProperty("Bid")
    public float getBid() {
        return bid;
    }

    @JsonProperty("Bid")
    public void setBid(float bid) {
        this.bid = bid;
    }

    @JsonProperty("Ask")
    public float getAsk() {
        return ask;
    }

    @JsonProperty("Ask")
    public void setAsk(float ask) {
        this.ask = ask;
    }

    @JsonProperty("OpenBuyOrders")
    public long getOpenBuyOrders() {
        return openBuyOrders;
    }

    @JsonProperty("OpenBuyOrders")
    public void setOpenBuyOrders(long openBuyOrders) {
        this.openBuyOrders = openBuyOrders;
    }

    @JsonProperty("OpenSellOrders")
    public long getOpenSellOrders() {
        return openSellOrders;
    }

    @JsonProperty("OpenSellOrders")
    public void setOpenSellOrders(long openSellOrders) {
        this.openSellOrders = openSellOrders;
    }

    @JsonProperty("PrevDay")
    public float getPrevDay() {
        return prevDay;
    }

    @JsonProperty("PrevDay")
    public void setPrevDay(float prevDay) {
        this.prevDay = prevDay;
    }

    @JsonProperty("Created")
    public String getCreated() {
        return created;
    }

    @JsonProperty("Created")
    public void setCreated(String created) {
        this.created = created;
    }

    @JsonProperty("DisplayMarketName")
    public Object getDisplayMarketName() {
        return displayMarketName;
    }

    @JsonProperty("DisplayMarketName")
    public void setDisplayMarketName(Object displayMarketName) {
        this.displayMarketName = displayMarketName;
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
