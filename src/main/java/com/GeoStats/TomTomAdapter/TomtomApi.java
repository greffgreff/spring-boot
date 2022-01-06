package com.GeoStats.TomTomAdapter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Scanner;
import java.net.MalformedURLException;
import java.net.URL;

@Service
public class TomtomApi {
    
    private final String key;
    private int responseCode;
    
    public TomtomApi(String key) {
        this.key = key;
    }

    public TomtomApi() {
        this("r6SBW2lsmjrN88T2GgG7ddAwmtmJiwiC");
    }

    public String getDataFromQuery(String query) {
        String urlString = String.format("https://api.tomtom.com/search/2/poiSearch/%s.json?key=%s", query, key);
        System.out.println(urlString);
        return queryApi(urlString);
    }
    
    private String queryApi(String urlString) {
        try {
            URL url = new URL(urlString);
            
            if (checkConnection(url)) {
                return getRequestData(url);
            }
        }
        catch (MalformedURLException ignore) { }
        
        responseCode = 500; // temporary
        return null;
    }
    
    private Boolean checkConnection(URL url) {
        try {
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            responseCode = conn.getResponseCode();
            System.out.println(responseCode);
            return true;
        }
        catch(IOException ignored) { }
        
        responseCode = 500;
        return false;
    }
    
    private String getRequestData(URL url) {
        StringBuilder informationString = new StringBuilder();
        
        try {
            Scanner scanner = new Scanner(url.openStream());

            while (scanner.hasNext()) {
                informationString.append(scanner.nextLine());
            }
            scanner.close();
        }
        catch (IOException ignored) { }

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonElement jsonString = JsonParser.parseString(informationString.toString());

        return gson.toJson(jsonString);
    }
}
