package com.example.demowork.service.ServiceImpl;

import com.example.demowork.dto.HrDTO;
import com.example.demowork.enums.Role;
import com.example.demowork.exception.ResourceNotFoundException;
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
    public HrDTO createHrUser(HrDTO hrDTO) {
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
        User newHr = hrUserRepository.save(hr);
        HrDTO mapHr = modelMapper.map(newHr, HrDTO.class);
        return mapHr;
    }

//    @Override
//    public void validateHrUser(HrDTO hrDTO) {
//        if()
//    }
}
