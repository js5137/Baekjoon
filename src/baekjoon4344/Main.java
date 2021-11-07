package baekjoon4344;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int avgCount = sc.nextInt();
        int[] score;
        double sum, count, avg;

        for (int i = 0; i < avgCount; i++) {
            score = new int[sc.nextInt()];
            sum = 0;
            count = 0;

            for (int j = 0; j < score.length; j++) {
                score[j] = sc.nextInt();
                sum += score[j];
            }

            avg = sum / (double)score.length;

            for (int k : score) {
                if (k > avg) {
                    count++;
                }
            }
            System.out.println(String.format("%.3f",(count/(double) score.length)*100)+"%");
        }
    }
}