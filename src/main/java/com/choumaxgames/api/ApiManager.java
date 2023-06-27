package com.choumaxgames.api;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;

public class ApiManager {

    private static final String URL = "http://localhost:3000";

    public static String get(String endpoint) throws IOException {
        CloseableHttpClient httpClient   = HttpClients.createDefault();
        HttpGet                     httpGet      = new HttpGet(URL + endpoint);
        CloseableHttpResponse       response     = httpClient.execute(httpGet);
        return EntityUtils.toString(response.getEntity());
    }

    public static String post(String endpoint, StringEntity body) throws IOException {
        CloseableHttpClient httpClient   = HttpClients.createDefault();
        HttpPost                     httpPost      = new HttpPost(URL + endpoint);
        httpPost.setEntity(body);
        httpPost.setHeader("Accept", "application/json");
        httpPost.setHeader("Content-type", "application/json");
        CloseableHttpResponse       response     = httpClient.execute(httpPost);
        return EntityUtils.toString(response.getEntity());
    }
}
