package org.example;

public class FizzBuzz {

    public String FizzBuzzTest(int n){
        for (int i = 0; i <=n ; i++) {
            if (i % 3==0 && i %5==0){
                System.out.println("FizzBuzz");
            } else if (i % 3==0) {
                System.out.println("Fizz");
            } else if (i % 5 ==0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
        return null;
    }
}
