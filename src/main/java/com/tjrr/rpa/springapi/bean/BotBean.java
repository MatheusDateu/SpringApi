package com.tjrr.rpa.springapi.bean;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "robos")
public class BotBean {
    @Id
    @Column(name = "codigo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @Column(name = "nome")
    private String nome;
    @Column(name = "url")
    private String url;
}