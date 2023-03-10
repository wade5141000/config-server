package com.shoalter.server.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("PROPERTIES")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PropertiesEntity {

  @Id
  @Column("ID")
  private Integer id;

  @Column("APPLICATION")
  private String application;

  @Column("PROFILE")
  private String profile;

  @Column("LABEL")
  private String label;

  @Column("KEY")
  private String key;

  @Column("VALUE")
  private String value;

}
