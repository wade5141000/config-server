package com.shoalter.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@RefreshScope
@SpringBootApplication
public class Client1Application {

  public static void main(String[] args) {
    SpringApplication.run(Client1Application.class, args);
  }

}
