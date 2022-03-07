/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 *
 * @author amaaradji
 */
public class Exercice6 {
    //adapted from https://mkyong.com/java/java-password-generator-example/
    private static final String CHAR_LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String CHAR_UPPERCASE = CHAR_LOWERCASE.toUpperCase();
    private static final String DIGIT = "0123456789";
    private static final String OTHER_PUNCTUATION = "!@#&()–[{}]:;',?/*";
    
    private static final String PASSWORD_ALLOW =
            CHAR_LOWERCASE + CHAR_UPPERCASE + DIGIT + OTHER_PUNCTUATION;
    
    private static final int PASSWORD_LENGTH = 8;
    
    
    
    public String generateStrongPassword() {

        StringBuilder result = new StringBuilder(PASSWORD_LENGTH);

        // at least 1 char (uppercase)
        String strUppercaseCase = getRandomChar(CHAR_UPPERCASE);
        result.append(strUppercaseCase);

        // at least 1 digit
        String strDigit = getRandomChar(DIGIT);
        result.append(strDigit);

        // at least 1 special character (punctuation)
        String strSpecialChar = getRandomChar(OTHER_PUNCTUATION);
        result.append(strSpecialChar);

        // remaining, just random
        for (int i = 0; i < PASSWORD_LENGTH - 3; i++){
            String strOther = getRandomChar(PASSWORD_ALLOW);
            result.append(strOther);
        }

        String password = result.toString();
        // combine all
        System.out.println("Password non mélangé " + password);
        // shuffle again
        System.out.println("Final Password " + shuffleString(password));
        return password;
    }
    
    public String shuffleString(String input) {
        List<String> result = Arrays.asList(input.split(""));
        Collections.shuffle(result);
        // java 8
        return result.stream().collect(Collectors.joining());
    }
    
  
    String getRandomChar(String s){
        Random random = new Random();
        int index = random.nextInt(s.length());
        char c = s.charAt(index);
        return Character.toString(c);        
    }
    
    
    

}
