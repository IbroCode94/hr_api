package com.example.demowork;

import com.example.demowork.repository.HrUserRepository;
import com.example.demowork.service.ServiceImpl.HrServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {DemoWorkApplicationTests.class})
class DemoWorkApplicationTests {
    @Mock
    private HrUserRepository hrUserRepository;

    @Mock
    private ModelMapper modelMapper;
    @InjectMocks
    private HrServiceImpl hrService;

    @Test
    void contextLoads() {

    }

}
