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
        String delimeter = ",";
        if (numbers.matches("//(.*)\n(.*)")) {
            delimeter = Character.toString(numbers.charAt(2));
            numbers = numbers.substring(4);
        }
        for(int i=0; i<numbers.length(); i++){
            char ch = numbers.charAt(i);
            if(ch=='@'){
                return multiply(numbers);
            }
        }

        String arr[] = numbers.split(delimeter + "|\n");

        for(int i=0; i<numbers.length(); i++){
            char ch = numbers.charAt(i);
            if(ch=='@'){
                return multiply(numbers);
            }
        }

        return sum(arr);
    }

    private int multiply(String numbers) {
        int sum = 0;
        String arr[] = numbers.split("@");

        sum = Integer.parseInt(arr[0]) * Integer.parseInt(arr[1]);

        return sum;
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