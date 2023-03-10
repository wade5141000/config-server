package com.shoalter.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  @Autowired
  Environment env;

  @GetMapping("/{key}")
  public String get(@PathVariable String key){
    return env.getProperty(key);
  }

}
