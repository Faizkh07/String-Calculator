package org.example;

public class StringCalculator {

    public int add(String numbers){
        if(numbers.length() < 2){
            if(numbers.length() == 0){
                return 0;
            }else{
                return Integer.parseInt(numbers);
            }
        }
        String arr[] = numbers.split(",");

        return sum(arr);
    }

    public int sum(String[] arr){
        int totalSum=0;

        for(String num:arr){
            totalSum+=Integer.parseInt(num);
        }
        return totalSum;
    }

}