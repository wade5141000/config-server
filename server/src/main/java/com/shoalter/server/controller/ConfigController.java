package com.shoalter.server.controller;

import com.shoalter.server.entity.PropertiesEntity;
import com.shoalter.server.repo.PropertiesRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.bus.BusProperties;
import org.springframework.cloud.bus.event.RefreshRemoteApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

  @Autowired
  private ApplicationEventPublisher publisher;

  @Autowired
  private BusProperties busProperties;

  @Autowired
  private PropertiesRepo propertiesRepo;

  @PostMapping("/update")
  public String update(@RequestBody List<PropertiesEntity> data) {

    propertiesRepo.saveAll(data);

    this.publisher.publishEvent(
        new RefreshRemoteApplicationEvent(this, busProperties.getId(), "**"));
    return "ok";
  }

}
