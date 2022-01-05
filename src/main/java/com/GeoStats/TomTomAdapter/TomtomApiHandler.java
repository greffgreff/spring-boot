package com.GeoStats.TomTomAdapter;

import java.util.Scanner;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

@Service
public class TomtomApiHandler {
    
    private final String key;
    private static int responseCode;
    
    public TomtomApiHandler(String key) {
        this.key = key;
    }

    public TomtomApiHandler() {
        this("r6SBW2lsmjrN88T2GgG7ddAwmtmJiwiC");
    }

    public String getDataFromQuery(String query) {
        String urlString = String.format("https://api.tomtom.com/search/2/poiSearch/%s.json?key=%s", query, key);
        System.out.println(responseCode); // temporary
        return query(urlString);
    }
    
    private String query(String urlString) {
        try {
            URL url = new URL(urlString);
            
            if (checkConnection(url)) {
                return getRequestData(url);
            }
        }
        catch (MalformedURLException e) { }
        
        responseCode = 500; // temporary
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

        return String.valueOf(informationString);
    }
}
