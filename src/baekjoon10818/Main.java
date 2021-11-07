package baekjoon10818;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[sc.nextInt()];
        arr[0] = sc.nextInt();
        int max = arr[0], min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            arr[i] = sc.nextInt();

            if (max < arr[i]) {
                max = arr[i];
            }

            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min + " " + max);
    }
}