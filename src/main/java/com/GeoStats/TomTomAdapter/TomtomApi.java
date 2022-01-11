package com.GeoStats.TomTomAdapter;

import com.GeoStats.TomTomAdapter.util.UrlBuilder;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

@Service
public class TomtomApi {
    private final String key;

    public TomtomApi(String key) {
        this.key = key;
    }

    public TomtomApi() {
        this("r6SBW2lsmjrN88T2GgG7ddAwmtmJiwiC");
    }

    public String makeApiRequest(String route, String query) throws Exception {
        if (query == null || query.isEmpty())
            throw new Exception("Cannot make API request with empty query string");

        UrlBuilder builder = new UrlBuilder();
        builder.setDomain("api.tomtom.com");
        builder.setRoute(route);
        String url = String.format("%s/%s.json?key=%s", builder, query, key);
        System.out.println(url);
        return queryApi(url);
    }
    
    private String queryApi(String urlString) {
        try {
            URL url = new URL(urlString);
            if (checkConnection(url))
                return getRequestData(url);
        }
        catch (MalformedURLException ignore) { }
        return null;
    }
    
    private Boolean checkConnection(URL url) {
        try {
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            System.out.println(conn.getResponseCode());
            return true;
        }
        catch(IOException ignored) { }
        return false;
    }
    
    private String getRequestData(URL url) {
        StringBuilder informationString = new StringBuilder();
        
        try {
            Scanner scanner = new Scanner(url.openStream());
            while (scanner.hasNext())
                informationString.append(scanner.nextLine());
            scanner.close();
        }
        catch (IOException ignored) { }

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonElement jsonString = JsonParser.parseString(informationString.toString());
        return gson.toJson(jsonString);
    }
}
