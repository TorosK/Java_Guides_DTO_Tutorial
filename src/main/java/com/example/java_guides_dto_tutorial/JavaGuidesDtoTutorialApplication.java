package com.example.java_guides_dto_tutorial;

import com.example.java_guides_dto_tutorial.model.Location;
import com.example.java_guides_dto_tutorial.model.User;
import com.example.java_guides_dto_tutorial.repository.LocationRepository;
import com.example.java_guides_dto_tutorial.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaGuidesDtoTutorialApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(JavaGuidesDtoTutorialApplication.class, args);
    }

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private LocationRepository locationRepository;

    @Override
    public void run(String... args) throws Exception {

        Location location = new Location();
        location.setPlace("Stockholm");
        location.setDescription("Beautiful");
        location.setLongitude(15.5);
        location.setLatitude(98.7);
        locationRepository.save(location);

        User user1 = new User();
        user1.setEmail("toros@email.com");
        user1.setFirstName("Toros");
        user1.setLastName("K");
        user1.setPassword("password123");
        user1.setLocation(location);
        userRepository.save(user1);

        User user2 = new User();
        user2.setEmail("Tate@email.com");
        user2.setFirstName("Andrew");
        user2.setLastName("T");
        user2.setPassword("password987");
        user2.setLocation(location);
        userRepository.save(user2);

    }
}
