package com.GeoStats.TomTomAdapter.models;

import com.GeoStats.TomTomAdapter.dto.Address;
import com.GeoStats.TomTomAdapter.dto.Position;
import com.fasterxml.jackson.annotation.JsonInclude;

public class ResponsePoi {
    private String name;
    private String type;
    private String[] categories;
    private String phone;
    private String website;
    private String[] brands;
    private Address address;
    private Position position;
    private double score;
    private double distance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String[] getCategories() {
        return categories;
    }

    public void setCategories(String[] categories) {
        this.categories = categories;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String[] getBrands() {
        return brands;
    }

    public void setBrands(String[] brands) {
        this.brands = brands;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
