package com.manga;


import com.manga.model.CustomUserDetails;
import com.manga.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
        User user = new User();
        user.setId(111L);
        user.setUsername("thang");
        user.setPassword("tran");
        CustomUserDetails customUserDetails = new CustomUserDetails(user);
        System.out.println(customUserDetails.getPassword());

        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

        System.out.println(passwordEncoder.encode("thang"));
    }
}
