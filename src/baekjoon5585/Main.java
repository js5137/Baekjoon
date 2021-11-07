package baekjoon5585;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = 1000 - sc.nextInt();
        int[] change = {500, 100, 50, 10, 5, 1};
        int count = 0;

        for (int j : change) {
            count += money / j;
            money %= j;
        }

        System.out.println(count);
    }
}