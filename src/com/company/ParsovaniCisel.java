package com.company;

import java.util.Scanner;

public class ParsovaniCisel {
    public static void main(String[] args) {
        // A2C4Z7 = 13
        String input;
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej vetu");
        input = sc.nextLine();
        int sum = 0;
        int number;

        input = input.replaceAll("[^0-9]", "");
        number = Integer.parseInt(input);
        System.out.println(number);

        while (number > 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        System.out.println(sum);


    }
}
