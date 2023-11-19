package Inflearn;

import java.util.Scanner;

public class main_7_1 {

    public String solution(String str){
        String answer = "YES";
        str = str.toUpperCase();
        int len = str.length();
        for(int i = 0; i<len/2; i++){
            if(str.charAt(i)!=str.charAt(len-i-1)) return "NO";
        }

        return answer;
    }
    
    public static void main(String[] args) {
        main_7_1 T = new main_7_1();
        Scanner kb = new Scanner(System.in);

        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
