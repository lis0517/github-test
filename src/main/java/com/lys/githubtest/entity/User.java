package com.lys.githubtest.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank
    @Size(min = 10, max = 20)
    @Column(nullable = false)
    private String username;

    @NotBlank
    @Size(min = 10, max = 20)
    @Column(nullable = false)
    private String password;

    private String email;
}
