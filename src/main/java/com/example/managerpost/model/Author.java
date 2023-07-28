package com.example.managerpost.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tacgia")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TacGia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long maTgia;

    private String tenTgia;
    private String hinhTgia;
}
