package com.example.demowork.exception;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter

@NoArgsConstructor
public class ErrorDetails {
    private LocalDate errorTime;
    private String errorMesssage;
    private String errorPath;
    private Integer errorStatusCode;
}
