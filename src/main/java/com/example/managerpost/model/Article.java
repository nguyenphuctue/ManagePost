package com.example.managerpost.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "baiviet")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long maBviet;

    private String tieude;
    private String tenBhat;
    private String tomtat;
    private String noidung;
    private String hinhanh;
}
