package com.ahmedgeze.webservice.model.bittrex.getorderbook;

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
        "Quantity",
        "Rate"
})
public class Buy {

    @JsonProperty("Quantity")
    private float quantity;
    @JsonProperty("Rate")
    private float rate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Quantity")
    public float getQuantity() {
        return quantity;
    }

    @JsonProperty("Quantity")
    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    @JsonProperty("Rate")
    public float getRate() {
        return rate;
    }

    @JsonProperty("Rate")
    public void setRate(float rate) {
        this.rate = rate;
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