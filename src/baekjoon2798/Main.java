package baekjoon2798;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] card = new int[sc.nextInt()];
        int sum = sc.nextInt();
        int max = 0;

        for (int i = 0; i < card.length; i++) {
            card[i] = sc.nextInt();
        }

        for(int i=0;i<card.length-2;i++){
            for(int j=i+1;j<card.length-1;j++){
                for(int k=j+1;k< card.length;k++){
                    if(card[i]+card[j]+card[k]<=sum && card[i]+card[j]+card[k]>max){
                        max = card[i]+card[j]+card[k];
                    }
                }
            }
        }
        System.out.println(max);
    }
}