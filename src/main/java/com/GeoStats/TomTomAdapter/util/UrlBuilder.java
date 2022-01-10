package com.GeoStats.TomTomAdapter.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class UrlBuilder {
    private String route;
    private String domain;
    private String protocol;
    private final Map<String, String> queryStrings;

    public UrlBuilder() {
        queryStrings = new HashMap<String, String>();
        protocol = "https";
    }

    public UrlBuilder(String route) {
        this.route = route;
        queryStrings = new HashMap<String, String>();
        protocol = "https";
    }

    public UrlBuilder(String domain, String route) {
        this.route = route;
        this.domain = domain;
        queryStrings = new HashMap<String, String>();
        protocol = "https";
    }

    public UrlBuilder setRoute(String route) {
        this.route = route;
        return this;
    }

    public UrlBuilder setDomain(String domain) {
        this.domain = domain;
        return this;
    }

    public UrlBuilder setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    public UrlBuilder addQueryString(String param, String val) {
        try {
            checkParam(param);
        }
        catch(Exception e) {
            System.out.println(e);
        }

        queryStrings.put(param, val);
        return this;
    }

    public UrlBuilder addQueryString(String param, ArrayList<String> vals) {
        try {
            checkParam(param);
        }
        catch(Exception e) {
            System.out.println(e);
        }

        String formatedVals = String.join("+", vals);
        queryStrings.put(param, formatedVals);
        return this;
    }

    @Override
    public String toString() {
        try {
            checkUrl();
        }
        catch(Exception e) {
            System.out.println(e);
        }

        StringBuilder url = new StringBuilder();
        url.append(String.format("#s://", protocol));
        url.append(String.format("%s/", domain));
        url.append(String.format("%s/", route));

        if (queryStrings.size() != 0) {
            StringBuilder query = new StringBuilder();
            for (Map.Entry<String, String> queryString : queryStrings.entrySet()) {
                query.append(String.format("%s=%s", queryString.getKey(), queryString.getValue()));
            }
            url.append(String.format("?%s", query));
        }

        return url.toString();
    }

    public void checkUrl() throws Exception {
        if (!protocol.isEmpty())
            throw new Exception("Incomplete url, missing protocol");
        if (!domain.isEmpty())
            throw new Exception("Incomplete url, missing domain");
        if (!route.isEmpty())
            throw new Exception("Incomplete url, missing route");
    }

    public void checkParam(String param) throws Exception {
        for (String key : queryStrings.keySet()) {
            if (Objects.equals(key, param)) {
                throw new Exception("Parameter already exists");
            }
        }
    }
}
