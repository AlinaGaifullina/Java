package ДЗ_2021.ДЗ_30_09;

import java.util.Scanner;

public class Num1 {
    static void isPrime(int j) {
        boolean a = true;
        for(int i = 2; i < j; i++){
            if(j % i == 0){
                a = false;
                break;
            }
        }
        if(a == true) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        isPrime(number);
    }
}
