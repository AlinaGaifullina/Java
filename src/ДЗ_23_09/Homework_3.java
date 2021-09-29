package ДЗ_23_09;

import java.util.Scanner;

public class Homework_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int number1 = 0; //меняющаяся переменная, временно содержащая в себе предыдущее число
        int count_num = 0; //счётчик всех чисел в последовательности
        int count_up = 1; //счётчик чисел, которые возрастают по сравнению с предыдущим
        int count_down = 1; //счётчик чисел, которые убывают по сравнению с предыдущим
        int count_equal = 1; //счётчик чисел, которые равны с предыдущим
        //присвоено значение "1", т.к. первое число не имеет предыдущего, так что по сути его можно отнести к любой из категорий(count_up, count_down, count_equal)
        System.out.println("Mikhail, please enter the numbers(don't forget to put '0' at the end): ");
        while (true) {
            number = scanner.nextInt();
            count_num++;
            if(count_num == 1) { //отдельно рассматриваем самый первый проход по циклу, когда в переменной number1 не лежит предыдущее число, т.к. его пока просто нет
                number1 = number;
                if(number == 0) { //частный случай, когда в консоль ввели толко "0", без каких либо чисел до него
                    count_num = 1; // делаем так, чтобы штука под циклом сработала так, как нас просит условие
                    break;
                }
                continue;
            }
            if (number == 0) {
                count_num--; //вычитаем 1, т.к. "0" не должен быть частью нашей последовательности
                break;
            } else if(number > number1) {
                count_up++;
            } else if(number < number1) {
                count_down++;
            } else if(number == number1) {
                count_equal++;
                count_up++; //прибавляем ко всему, т.к., например, ситуация "1 1" является и возрастающей, и убывающей, и равной
                count_down++;
            }
            number1 = number; //после каждого прохода текущее число становится предыдущим для следующего прохода по циклу
        }
        System.out.println("Thank you! This is your answer: ");
        if(count_equal == count_num) {
            System.out.println("=");
        } else if(count_num == count_up) {
            System.out.println("<");
        } else if(count_num == count_down) {
            System.out.println(">");
        } else {
            System.out.println("!");
        }
    }
}
