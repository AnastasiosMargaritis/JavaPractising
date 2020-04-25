package com.lambda;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                String myString = "Let's split thus up into an array.";
                String[] parts = myString.split(" ");
                for (String part: parts){
                    System.out.println(part);
                }
            }
        };

        Runnable runnable1 = () -> {
            String myString = "Let's split thus up into an array.";
            String[] parts = myString.split(" ");
            for (String part: parts){
                System.out.println(part);
            }
        };

        Function<String, String> lambdaFunction = s -> {
          StringBuilder returnVal = new StringBuilder();
          for(int i = 0; i < s.length(); i++){
              if(i % 2 == 0){
                  returnVal.append(s.charAt(i));
              }
          }

          return returnVal.toString();
        };


        System.out.println(lambdaFunction.apply("1234567890"));

        String result = everySecondCharacter(lambdaFunction, "12345677890");
        System.out.println(result);
    }


    public static String everySecondCharacter(Function<String, String> func, String source){
        return func.apply(source);
    }
}
