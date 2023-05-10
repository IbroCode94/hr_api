package com.example.demowork.controller;

import com.example.demowork.dto.HrDTO;
import com.example.demowork.model.HrUser;
import com.example.demowork.service.HrService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/hr")
public class HrController {
    private  final HrService hrService;


    public HrController(HrService hrService) {
        this.hrService = hrService;
    }
    @PostMapping("/register")

    public ResponseEntity<HrDTO> creatHr(@RequestBody HrDTO hrDTO){
        return  new ResponseEntity<>(hrService.createHrUser(hrDTO), HttpStatus.CREATED);
    }
}
