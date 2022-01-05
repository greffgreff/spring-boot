package com.GeoStats.TomTomAdapter.poi.models;

public class Classification {
    private String code;
    private ClassificationName[] names;

    public Classification() {}

    public Classification(String code, ClassificationName[] names) {
        this.code = code;
        this.names = names;
    }

    public String getCode() {
        return code;
    }

    public ClassificationName[] getNames() {
        return names;
    }
}
