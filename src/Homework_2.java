import java.util.Scanner;

public class Homework_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int summa = 0;
        System.out.println("Mikhail, please enter the numbers(don't forget to put '0' at the end): ");
        while (true) {
            number = scanner.nextInt();
            if (number == 0) {
                break;
            } else {
                summa += number;
            }
        }
        System.out.println("This is your sum: " + summa);
    }
}
