package Inflearn;

import java.util.Scanner;

public class main_7_2 {

    public String solution(String str){
        String answer = "NO";

        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(tmp)) answer = "YES";

        return answer;
    }
    

    public static void main(String[] args) {
        main_7_2 T = new main_7_2();
        Scanner kb = new Scanner(System.in);

        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
