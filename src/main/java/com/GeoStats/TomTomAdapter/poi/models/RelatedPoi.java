package com.GeoStats.TomTomAdapter.poi.models;

import com.GeoStats.TomTomAdapter.poi.models.enums.RelationType;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RelatedPoi {
    @JsonProperty("id") private String id;
    @JsonProperty("relationType") private RelationType relationType;

    public RelatedPoi() {}
    
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
