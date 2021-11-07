package baekjoon10950;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int temp = 0;

        while (temp < count) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(a + b);
            temp++;
        }
    }
}