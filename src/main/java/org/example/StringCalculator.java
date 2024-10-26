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
        String arr[] = numbers.split("," + "|\n");

        return sum(arr);
    }

    public int sum(String[] arr){
        int totalSum=0;

        StringBuilder negativeNumbers = new StringBuilder();

        for(String num:arr){
            if(Integer.parseInt(num)<0){
                if(negativeNumbers.toString().isEmpty()){
                    negativeNumbers = new StringBuilder(num);

                }else{
                    negativeNumbers.append(",").append(num);
                }
            }
            totalSum+=Integer.parseInt(num);
        }
        if(!negativeNumbers.isEmpty()){
            throw new IllegalArgumentException("Negative numbers not allowed:" + " "+ negativeNumbers);
        }
        return totalSum;
    }

}