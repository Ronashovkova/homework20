package com.cursor.hw20.service;
import org.springframework.stereotype.Service;

@Service
public class DiscriminantCalculating {

    public double calculateDiscriminant(double a, double b, double c) {
        return  Math.pow(b, 2) - (4 * a * c);
    }
}
