import java.util.Scanner;

public class Main {
    /*
    * 대문자는 65 ~ 90
    * 소문자는 97 ~ 122
    * 둘의 차이는 32임.
    * */
    public String solution(String str){
        String answer = "";

        for(char x : str.toCharArray()){
            if(x>=97 && x<=122) answer+=(char)(x-32);
            else answer+=(char)(x+32);
            /*
            if(Character.isLowerCase(x)) answer+=Character.toUpperCase(x);
            else answer+=Character.toLowerCase(x);*/
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        String str = kb.next();

        System.out.println(T.solution(str));
    }

}
