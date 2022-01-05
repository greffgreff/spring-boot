package com.GeoStats.TomTomAdapter.poi.models;

public class Poi {
    private String name;
    private String phone;
    private String[] brands;
    private String url;

    public Poi(String name, String phone, String[] brands, String url) {
        this.name = name;
        this.phone = phone;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String[] brands() {
        return brands;
    }

    public String getWebsite() {
        return url;
    }
}
