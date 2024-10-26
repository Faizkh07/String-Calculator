package org.example;

public class StringCalculator {

    public int add(String numbers){
        if(numbers.length() == 0){
            return 0;
        }else{
            return Integer.parseInt(numbers);
        }
    }
}