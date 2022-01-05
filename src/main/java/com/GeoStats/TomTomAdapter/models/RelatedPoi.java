package com.GeoStats.TomTomAdapter.models;

import com.GeoStats.TomTomAdapter.models.enums.RelationType;

public class RelatedPoi {
    private String id;
    private RelationType relationType;

    public RelatedPoi(String id, RelationType relationType) {
        this.id = id;
        this.relationType = relationType;
    }
}
