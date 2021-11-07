package baekjoon10871;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        int standard = sc.nextInt();

        for (int i = 0; i < length; i++) {
            int num = sc.nextInt();
            if (num < standard) {
                System.out.print(num + " ");
            }
        }
        sc.close();
    }
}