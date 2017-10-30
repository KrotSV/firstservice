package com.example.hyatrix.firstservice.controllers;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import java.io.IOException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Consumer {

  @GetMapping(value = "/spam")
  @HystrixCommand
  public String getComputers() throws IOException {
    return "OKOKOK";
  }

}
