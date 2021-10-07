package КР;

import java.util.Scanner;

public class n1 {
    public static int pow(int x, int y) {
        int x1 = x;
        for(int i = 1; i < y; i++) {
            x = x*x1;
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(pow(a, n));
    }
}
