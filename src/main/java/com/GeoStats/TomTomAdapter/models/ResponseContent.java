package com.GeoStats.TomTomAdapter.models;

import com.fasterxml.jackson.annotation.JsonInclude;

public class ResponseContent {
    private Pagination pagination;
    private Object[] content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public Object[] getContent() {
        return content;
    }

    public void setContent(Object[] content) {
        this.content = content;
    }
}
