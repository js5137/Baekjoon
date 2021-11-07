package baekjoon11399;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] people = new int[Integer.parseInt(br.readLine())];
        int time = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < people.length; i++) {
            people[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(people);
        for (int i = people.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                people[i] += people[j];
            }
            time += people[i];
        }

        System.out.println(time);
    }
}