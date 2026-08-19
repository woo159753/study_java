package ex_work;

import java.util.Scanner;

public class Ex2_work {
    public static void main(String[] args) {
        //이메일 : abc@korea.com
        //이메일 형식 오류

        //이메일 : aabbcc@n.com
        //aabbcc님 환영합니다

        Scanner sc = new Scanner(System.in);
        System.out.print("이메일 : ");

        String email = sc.next();

        String[] sp = email.split("@");
        //@이라는 문자열을 기준으로 나누고
        //String 배열에 순차적으로 담는다
        String res = sp[0];

        if( res.length() < 4 || res.length() > 8){
            System.out.println("이메일 형식이 올바르지 않음");
        }else{
            System.out.println(res + "님 환영합니다");
        }
    }//main
}
