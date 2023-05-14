package com.example.demowork.model;

import com.example.demowork.enums.Role;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Getter
@Setter
@Document
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id

    private String id;

    private String firstname;

    private String middleName;


    private String lastname;

    private String DateOfBirth;

    private String email;

    private String password;

    private String PhoneNumber;
    private Role role;

}
