package com.proximity.api.tomtomApi.models;

import com.proximity.api.tomtomApi.models.enums.RelationType;

public class RelatedPoi {
    
    private String id;
    private RelationType relationType;

    public RelatedPoi(String id, RelationType relationType) {
        this.id = id;
        this.relationType = relationType;
    }
}
