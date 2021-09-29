package ДЗ_30_09;

import java.util.Scanner;

public class Num2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String h = scanner.nextLine();
        char bukva = h.charAt(0);
        String p = "qwertyuiopasdfghjklzxcvbnmq";
        for(int i = 0; i < p.length(); i++) {
            if(bukva == p.charAt(i)) {
                System.out.println(p.charAt(i+1));
                break;
            }
        }

    }
}
