package com.example.hyatrix.firstservice.controllers;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import sun.net.www.protocol.http.HttpURLConnection;

@Component
public class Producer {
  private String url = "http://localhost:8080/spam";
  private URL obj = new URL(url);

  public Producer() throws MalformedURLException {
  }


  @Scheduled(fixedDelay = 1200L)
  @HystrixCommand
  void spamRequests() throws IOException, InterruptedException {

    RestTemplate restTemplate = new RestTemplate();
    System.out.println(restTemplate.getForObject(url, String.class, ""));

  }
}
