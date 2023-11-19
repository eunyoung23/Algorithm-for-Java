package Inflearn;

import java.util.Scanner;

/*
 * 대문자는 65 ~ 90
 * 소문자는 97 ~ 122
 * 둘의 차이는 32
 */

public class main_2 {

    public String solution(String str){
        String answer = "";

        
        for(char c : str.toCharArray()){
            /* 
            if(Character.isLowerCase(c)){
                answer+=Character.toUpperCase(c);
            }else{
                answer+=Character.toLowerCase(c);
            }*/
            if(c>=97 && c<=122) answer+=(char)(c-32);
            else answer+=(char)(c+32);
        }

        return answer;
    }

    public static void main(String[] args) {
        main_2 T = new main_2();
        Scanner kb = new Scanner(System.in);

        String str = kb.next();

        System.out.println(T.solution(str));
    }
}
