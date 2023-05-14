package com.example.demowork.service.ServiceImpl;

import com.example.demowork.dto.HrRequestDTO;
import com.example.demowork.dto.HrResponseDto;
import com.example.demowork.enums.Role;
import com.example.demowork.exception.RegistrationException;
import com.example.demowork.exception.UserAlreadyExistExceptions;
import com.example.demowork.model.User;
import com.example.demowork.repository.HrUserRepository;
import com.example.demowork.service.HrService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class HrServiceImpl implements HrService {
    private final HrUserRepository hrUserRepository;
    private final ModelMapper modelMapper;
    @Override
    public HrResponseDto createHrUser(HrRequestDTO hrDTO) {
        Optional<User> find = hrUserRepository.findByEmail(hrDTO.getEmail());
        if(find.isPresent()){
            throw  new UserAlreadyExistExceptions("User Already exists");
        }
        User hr = new User();
        hr.setFirstname(hrDTO.getFirstname());
        hr.setMiddleName(hrDTO.getMiddleName());
        hr.setLastname(hrDTO.getLastname());
        hr.setDateOfBirth(hrDTO.getDateOfBirth());
        hr.setEmail(hrDTO.getEmail());
        hr.setPassword(hrDTO.getPassword());
        hr.setPhoneNumber(hrDTO.getPhoneNumber());
        hr.setRole(Role.HR);
        try {
            User newHr = hrUserRepository.save(hr);
            HrResponseDto mapHr = modelMapper.map(newHr, HrResponseDto.class);
            return mapHr;
        }catch(Exception e){
            throw new RegistrationException("Failed to Register User");
        }

    }

//    @Override
//    public void validateHrUser(HrDTO hrDTO) {
//        if()
//    }
}
