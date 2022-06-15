package ru.andronov.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.andronov.model.Phone;

@SpringBootTest
public class PhoneServiceImplTest {

    @Configuration
    static class PhoneServiceConfiguration {

        public static final Phone HP = new Phone("HP");

        @Bean
        public PhoneService phoneService() {
            return new PhoneServiceImpl(HP);
        }
    }

    @Autowired
    private PhoneService phoneService;

    @Test
    public void getPhoneByPriceShouldWork() {
        Phone phone = phoneService.getPhoneByPrice(1.2);
        Assertions.assertEquals(PhoneServiceConfiguration.HP, phone);
    }
}
