package com.cursor.hw20.controller;

import com.cursor.hw20.dto.Data;
import com.cursor.hw20.service.DiscriminantCalculating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/discriminant")
@RestController

public class Discriminant {

    @Autowired
    private DiscriminantCalculating discriminantService;

    @GetMapping("/method")

    public void printResult(@RequestBody Data data) {

        double discriminant = discriminantService.calculateDiscriminant(data.a, data.b, data.c);

        if (discriminant > 0) {
            System.out.println("Discriminant is " + discriminant + " which is Positive");
            System.out.println("Hence Two Solutions");

        } else if (discriminant == 0) {
            System.out.println("Discriminant is " + discriminant + " which is Zero");
            System.out.println("Hence One Solution");

        } else {
            System.out.println("Discriminant is " + discriminant + " which is Negative");
            System.out.println("Hence No Real Solutions");
        }
    }
}
