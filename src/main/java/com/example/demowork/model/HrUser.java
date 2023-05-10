package com.example.demowork.model;

import com.example.demowork.enums.Role;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Table(name = "Hr_user")
@AllArgsConstructor
@NoArgsConstructor
public class HrUser {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(nullable = false)
    private String firstname;
    @Column(nullable = false)
    private String lastname;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String PhoneNumber;
    @Enumerated(EnumType.STRING)
    private Role role;

}
