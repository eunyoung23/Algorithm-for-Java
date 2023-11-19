package Inflearn;

import java.util.Scanner;

public class main_6 {

    //indexOf() 메서드 : String 객체에서 주어진 값과 일치하는 첫 번째 인덱스를 반환함.

    public String solution(String str){
        String answer = "";

        for(int i=0; i<str.length(); i++){
            if(str.indexOf(str.charAt(i))==i) answer+=str.charAt(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        main_6 T = new main_6();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
