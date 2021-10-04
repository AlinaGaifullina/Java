package ДЗ_07_10;

import java.util.Scanner;

public class Homework3_3 {
    static int isPrime(int j) {
        int a = 1;
        for(int i = 2; i < j; i++){
            if(j % i == 0){
                a = 0;
                break;
            }
        }
        if(a == 1) {
            return 1;
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(isPrime(number) == 0) {
            System.out.print("1 ");
            for(int i = 2; i < (number+1); i++) {
                if(number%i == 0) {
                    while(number%i==0) {
                        System.out.print(i + " ");
                        number = number / i;
                    }
                }
            }
        } else {
            System.out.println("Prime");
        }
    }
}
