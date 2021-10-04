package ДЗ_07_10;

import java.util.Scanner;

public class Homework3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int m = sc.nextInt();
        for(int i = k; i < (m+1); i++) {
            if(i%3 == 0) {
                System.out.print(i + " ");
            }

        }
    }
}
