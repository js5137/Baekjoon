package baekjoon1152;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.nextLine().toCharArray();
        int count = 1;

        for (char c : arr) if (c == ' ') count++;

        if (arr[0] == ' ') count--;
        if (arr[arr.length - 1] == ' ') count--;

        System.out.println(count);
    }
}