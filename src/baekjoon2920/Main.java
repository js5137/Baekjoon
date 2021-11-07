package baekjoon2920;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] melody = new int[8];
        String result = "";

        for (int i = 0; i < melody.length; i++) {
            melody[i] = sc.nextInt();

            if (i != 0) {
                if (melody[i] == melody[i - 1] + 1) {
                    result = "ascending";
                } else if (melody[i] == melody[i - 1] - 1) {
                    result = "descending";
                } else {
                    result = "mixed";
                    break;
                }
            }
        }
        System.out.println(result);
    }
}