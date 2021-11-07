package baekjoon16435;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] fruit = new int[Integer.parseInt(st.nextToken())];
        int length = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < fruit.length; i++) {
            fruit[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(fruit);

        for (int j : fruit) {
            if (length >= j) {
                length++;
            } else {
                break;
            }
        }

        System.out.println(length);
    }
}