package com.GeoStats.TomTomAdapter.models;

import com.GeoStats.TomTomAdapter.dto.Address;
import com.GeoStats.TomTomAdapter.dto.Position;
import com.fasterxml.jackson.annotation.JsonInclude;

public class ResponsePoi {
    private final String name;
    private final String type;
    private final String[] categories;
    private final String phone;
    private final String website;
    private final String[] brands;
    private final Address address;
    private final Position position;
    private final double score;
    private final double distance;

    public ResponsePoi(String name, String type, String[] categories, String phone, String website, String[] brands, Address address, Position position, double score, double distance) {
        this.name = name;
        this.type = type;
        this.categories = categories;
        this.phone = phone;
        this.website = website;
        this.brands = brands;
        this.address = address;
        this.position = position;
        this.score = score;
        this.distance = distance;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public double getDistance() {
        return distance;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public double getScore() {
        return score;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getType() {
        return type;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String[] getCategories() {
        return categories;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPhone() {
        return phone;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getWebsite() {
        return website;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String[] getBrands() {
        return brands;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Address getAddress() {
        return address;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Position getPosition() {
        return position;
    }

    public static class Builder {
        private String name = "fyuytu";
        private String type;
        private String[] categories;
        private String phone;
        private String website;
        private String[] brands;
        private Address address;
        private Position position;
        private double score;
        private double distance;

        public Builder() { }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setCategories(String[] categories) {
            this.categories = categories;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder setWebsite(String website) {
            this.website = website;
            return this;
        }

        public Builder setBrands(String[] brands) {
            this.brands = brands;
            return this;
        }

        public Builder setAddress(Address address) {
            this.address = address;
            return this;
        }

        public Builder setPosition(Position position) {
            this.position = position;
            return this;
        }

        public Builder setScore(double score) {
            this.score = score;
            return this;
        }

        public Builder setDistance(double distance) {
            this.distance = distance;
            return this;
        }

        public ResponsePoi build() {
            return new ResponsePoi(name, type, categories, phone, website, brands, address, position, score, distance);
        }
    }
}
