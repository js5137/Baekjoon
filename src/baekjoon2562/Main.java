package baekjoon2562;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int maxIndex = -1, max = -1;
        int[] arr = new int[9];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i + 1;
            }
        }
        sc.close();
        System.out.println(max);
        System.out.println(maxIndex);
    }
}