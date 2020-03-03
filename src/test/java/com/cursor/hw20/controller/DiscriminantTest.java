package com.cursor.hw20.controller;

import com.cursor.hw20.service.DiscriminantCalculating;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.jupiter.api.Assertions.assertEquals;


@RunWith(SpringRunner.class)
class DiscriminantTest {
    @Autowired
    private DiscriminantCalculating discriminantService = new DiscriminantCalculating();

    @Test
    void printResult() {
        //GIVEN
        double a = 20;
        double b = 30;
        double c = 10;
        double expectedResult = 100;

        //WHEN

        //THEN
        double actualResult = discriminantService.calculateDiscriminant(a, b, c);

        assertEquals(expectedResult, actualResult);
    }
}
