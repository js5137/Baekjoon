package baekjoon10773;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int count = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < count; i++) {
            int temp = sc.nextInt();
            if (temp == 0) {
                arr.remove(arr.size() - 1);
            } else {
                arr.add(temp);
            }
        }

        for (Integer integer : arr) {
            sum += integer;
        }

        System.out.println(sum);
    }
}