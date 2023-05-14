package com.example.demowork.service;

import com.example.demowork.dto.HrRequestDTO;
import com.example.demowork.dto.HrResponseDto;

public interface HrService {
     HrResponseDto createHrUser(HrRequestDTO hrDTO);
//    void  validateHrUser(HrDTO hrDTO);
}
