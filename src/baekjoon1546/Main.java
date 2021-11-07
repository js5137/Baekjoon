package baekjoon1546;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] score = new double[sc.nextInt()];
        double sum = 0, avg, max = -1;

        for (int i = 0; i < score.length; i++) {
            score[i] = sc.nextInt();
            if (score[i] > max) {
                max = score[i];
            }
        }

        for (int i = 0; i < score.length; i++) {
            score[i] = (score[i] / max) * 100;
            sum += score[i];
        }

        avg = sum / score.length;
        System.out.println(avg);
    }
}