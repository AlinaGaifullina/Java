package ДЗ_2021.ДЗ_07_10;

import java.util.Scanner;

public class Homework3_1 {
    static int Factorial(int x) {
        if(x>0) {
            return x * Factorial(x-1);
        } else {
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(Factorial(number));

    }

}
