package com.codegym;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Input a year");
	Scanner sc = new Scanner(System.in);
    int year = sc.nextInt();
    boolean isLeapYear = false;
        boolean isDivisibleBy4 = year % 4 == 0;
        if(isDivisibleBy4){
            boolean isDivisibleBy100 = year % 100 == 0;
            if(isDivisibleBy100){
                boolean isDivisibleBy400 = year % 400 == 0;
                if(isDivisibleBy400){
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }
    if(isLeapYear){
        System.out.printf("%d is a Leap Year", year);
    } else {
        System.out.printf("%d is not a Leap Year", year);
    }
    }
}
