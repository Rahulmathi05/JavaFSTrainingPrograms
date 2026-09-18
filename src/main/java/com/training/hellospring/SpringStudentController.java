package com.training.hellospring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringStudentController {

    @GetMapping("/springstudent")
    public String student() {
        return "Rahul";
    }
}