package com.company;

import java.util.Scanner;

public class Faktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Zadej cislo");
        number = sc.nextInt();

        int factorial = 1;

        for (int i = 1; i <= number; i++){
            factorial = factorial * i;
        }
        System.out.println(factorial);

    }
}
