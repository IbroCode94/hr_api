package com.example.demowork.dto;

import com.example.demowork.enums.Role;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class HrResponseDto {
    private String firstname;
    private String middleName;
    private  String lastname;
    private String dateOfBirth;
    private String email;
    private Role role;
}
