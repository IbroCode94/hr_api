package com.example.demowork.dto;

import com.example.demowork.enums.Role;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HrDTO {
    private String firstname;
    private  String lastname;
    private String email;
    private String password;
    private String phoneNumber;
    private Role role;
}
