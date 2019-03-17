package me.bretthartman.votingsystem.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "citizens")
@NoArgsConstructor
public @Data class Citizen implements Serializable {
  private static final long serialVersionUID = 3327654436199891365L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "citizen_name")
  private String name;
}
