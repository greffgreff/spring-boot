package com.GeoStats.TomTomAdapter.poi.models;

import com.GeoStats.TomTomAdapter.poi.models.enums.RelationType;

public class RelatedPoi {
    private String id;
    private RelationType relationType;

    public RelatedPoi(String id, RelationType relationType) {
        this.id = id;
        this.relationType = relationType;
    }

    public String getId() {
        return id;
    }

    public RelationType getRelationType() {
        return relationType;
    }
}
