package com.proximity.api.tomtomApi;

import java.util.*;
import java.util.Scanner;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class TomtomApi {
    
    private final String TOMTOM_API_KEY = "r6SBW2lsmjrN88T2GgG7ddAwmtmJiwiC";
    private static int responseCode;

    public List<String> getData(String query) {

        String urlString = String.format("https://api.tomtom.com/search/2/poiSearch/%s.json?key=%s", query, TOMTOM_API_KEY);
        String result = query(urlString);
        return List.of(String.valueOf(responseCode), result);
    }
    
    private String query(String urlString) {
        
        try {
            URL url = new URL(urlString);
            
            if (checkConnection(url)) {
                return getRequestData(url);
            }
        }
        catch (MalformedURLException e) { }

        responseCode = 500;
        return null;
    }
    
    private Boolean checkConnection(URL url) {
        
        try {
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            responseCode = conn.getResponseCode();
            return true;
        }
        catch(IOException e) { }
        
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
        catch (IOException e) { }

        responseCode = 500;
        return null;
    }
}
