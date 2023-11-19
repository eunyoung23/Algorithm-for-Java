package Inflearn;

import java.util.Scanner;

public class main_8 {

    public String solution(String s){
        String answer = "NO";
        s=s.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(s).reverse().toString();
        if(s.equals(tmp)){
            answer = "YES";
        }

        return answer;
    }

    public static void main(String[] args) {
        main_8 T = new main_8();

        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
    
}
