package com.example.vocuong_20002345;

import com.example.vocuong_20002345.models.Candidate;
import com.example.vocuong_20002345.models.address;
import com.example.vocuong_20002345.repositories.CadidateRepository;
import com.neovisionaries.i18n.CountryCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.Random;

@SpringBootApplication
public class VoCuong20002345Application {
    @Autowired
    private CadidateRepository candiCadidateRepository;
    public static void main(String[] args) {
        SpringApplication.run(VoCuong20002345Application.class, args);
    }

@Bean
    CommandLineRunner initData() {
        return args -> {
            Random rnd = new Random();
            address add = new address(100,"HCM","100","sasa",CountryCode.VN);
            Candidate candidate = new Candidate("Name" ,LocalDate.of(1998,rnd.nextInt(1,13),rnd.nextInt(1,29)),add,rnd.nextLong(1111111111L,9999999999L)+""+"email_"+2+"@gmail.com");
            candiCadidateRepository.save(candidate);
            System.out.println("Add" + candidate);
        };
    }
}
