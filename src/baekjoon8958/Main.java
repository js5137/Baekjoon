package baekjoon8958;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int temp, score;
        String ox;
        char[] answer;

        for (int i = 0; i < count; i++) {
            ox = sc.next();
            answer = ox.toCharArray();
            temp = 0;
            score = 0;

            for (char c : answer) {
                if (c == 'O') {
                    temp++;
                    score += temp;
                } else {
                    temp = 0;
                }
            }
            System.out.println(score);
        }
    }
}