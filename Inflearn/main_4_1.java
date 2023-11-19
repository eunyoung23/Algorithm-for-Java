package Inflearn;

import java.util.Scanner;
import java.util.ArrayList;

public class main_4_1 {

    public ArrayList<String> solution(int n,String[] str){
        ArrayList<String> answer = new ArrayList<>();

        for(String x:str){
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }

        return answer;
    }


    public static void main(String[] args) {
        main_4_1 T = new main_4_1();
        Scanner kb = new Scanner(System.in);
        
        int n = kb.nextInt();
        String[] str = new String[n];
        for(int i=0; i<n; i++){
            str[i] = kb.next();
        }

        for(String x : T.solution(n, str)){
            System.out.println(x);
        }

    }
}
