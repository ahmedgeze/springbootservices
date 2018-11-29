package com.ahmedgeze.webservice.model.bittrex.getticker;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Bid",
        "Ask",
        "Last"
})


public class GetTickerResult {
    @JsonProperty("Bid")
    private float bid;
    @JsonProperty("Ask")
    private float ask;
    @JsonProperty("Last")
    private float last;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    @JsonProperty("Last")
    public float getLast() {
        return last;
    }

    @JsonProperty("Last")
    public void setLast(float last) {
        this.last = last;
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
