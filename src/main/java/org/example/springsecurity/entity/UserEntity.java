package org.example.springsecurity.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // 이 세개는 꼭 필요
    @Column(unique = true)
    private String username;
    private String password;

    private String role;
}