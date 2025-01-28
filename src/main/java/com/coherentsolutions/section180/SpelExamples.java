package com.coherentsolutions.section180;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class SpelExamples {

    // 1. Arithmetic Operation
    @Value("#{10 + 20}")
    private int arithmeticResult;

    // 2. Calling Methods
    @Value("#{'Spring Framework'.toLowerCase()}")
    private String lowerCaseString;

    // 3. Conditional Expression
    @Value("#{20 > 10 ? 'Greater than 10' : 'Not greater than 10'}")
    private String conditionResult;

    // 4. Accessing Properties and Arrays
    @Value("#{dataList[0]}")
    private String firstElement;

    // 5. Regular Expression Matching
    @Value("#{'100abc'.matches('\\d+') ? 'Contains only digits' : 'Contains non-digit characters'}")
    private String regexResult;

    // Additional Examples

    // 6. Accessing static methods
    @Value("#{T(java.lang.Math).sqrt(25)}")
    private double squareRoot;

    // 7. Accessing environment properties
    @Value("#{systemProperties['user.home']}")
    private String userHome;

    // 8. Inline lists
    @Value("#{{'One','Two','Three'}}")
    private java.util.List<String> inlineList;

    // 9. Inline maps
    @Value("#{{'key1':'value1', 'key2':'value2'}}")
    private java.util.Map<String, String> inlineMap;

    // 10. Accessing object properties and methods
    // Assuming there's a 'user' bean with 'getName()' method
    @Value("#{user.name}")
    private String userName;

    // Getters for demonstration purposes
    public int getArithmeticResult() {
        return arithmeticResult;
    }

    public String getLowerCaseString() {
        return lowerCaseString;
    }

    public String getConditionResult() {
        return conditionResult;
    }

    public String getFirstElement() {
        return firstElement;
    }

    public String getRegexResult() {
        return regexResult;
    }

    public double getSquareRoot() {
        return squareRoot;
    }

    public String getUserHome() {
        return userHome;
    }

    public java.util.List<String> getInlineList() {
        return inlineList;
    }

    public java.util.Map<String, String> getInlineMap() {
        return inlineMap;
    }

    public String getUserName() {
        return userName;
    }
}
