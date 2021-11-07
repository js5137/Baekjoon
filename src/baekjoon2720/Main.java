package baekjoon2720;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int temp = 0;
        int[] moneys = {25, 10, 5, 1};

        while (temp < count) {
            int money = Integer.parseInt(br.readLine());
            int[] change = new int[4];

            for (int i = 0, moneysLength = moneys.length; i < moneysLength; i++) {
                change[i] = money / moneys[i];
                money %= moneys[i];
                System.out.print(change[i] + " ");
            }

            System.out.println();
            temp++;
        }
    }
}