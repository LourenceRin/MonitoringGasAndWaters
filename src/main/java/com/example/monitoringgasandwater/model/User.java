package com.example.monitoringgasandwater.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "email")
    private String email;
    @Enumerated(value = EnumType.STRING)
    @Column(name = "roleuser")
    private Role roleuser;
    @Enumerated(value = EnumType.STRING)
    @Column(name = "status")
    private Status status;
}
