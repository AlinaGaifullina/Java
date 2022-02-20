package ДЗ_2021.ДЗ_23_09;
///2123ув2
import java.util.Scanner;

public class Homework_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count_5 = 0;
        int number;
        System.out.println("Mikhail, please enter the numbers(don't forget to put '0' at the end): ");
        while (true) {
            number = scanner.nextInt();
            if(number == 0) {
                System.out.println("Thank you! This is your answer: ");
                break;
            }
            if(number == 5) {
                count_5++;
            }
        }
        if(count_5 == 0) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}

