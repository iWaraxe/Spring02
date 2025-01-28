package com.coherentsolutions.section180;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CalculationService {

    // Spring Expression Language (SpEL)
    @Value("#{22 * 20 + 10}")
    private int result;

    public void printResult() {
        System.out.println("The result is: " + result);
    }
}
