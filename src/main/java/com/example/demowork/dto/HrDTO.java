package com.example.demowork.dto;

import com.example.demowork.enums.Role;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
public class HrDTO {
    @NotBlank(message = "First name is mandatory")
    private String firstname;
    @NotBlank(message = "First name is mandatory")
    private String middleName;
    @NotBlank(message = "First name is mandatory")
    private  String lastname;
    private String dateOfBirth;
    @NotBlank(message = "First name is mandatory")
    @Email(message = "Enter a valid email", regexp = "(^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$)")
    private String email;
    private String password;
    @Size(min = 11, max = 14, message = "phone number must have  a minimum length of 11 and maximum of 15")
    private String phoneNumber;
    private Role role;
}
