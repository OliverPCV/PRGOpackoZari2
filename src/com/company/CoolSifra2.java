package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class CoolSifra2 {
    public static void main(String[] args) {
        // AZhAoqjl,Z ybgakbqi

        String StartingSentence;
        String FinalSentence = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej vetu");
        StartingSentence = sc.nextLine();
        System.out.println(StartingSentence.length());

        for (int i = 0; i < StartingSentence.length(); i += 2) {
            FinalSentence += StartingSentence.charAt(i);
        }
        System.out.println(FinalSentence);


    }
}
