package baekjoon2577;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt() * sc.nextInt() * sc.nextInt();
        int[] number = new int[10];
        int temp;

        while (sum != 0) {
            temp = sum % 10;
            number[temp]++;
            sum /= 10;
        }

        for (int j : number) {
            System.out.println(j);
        }
    }
}