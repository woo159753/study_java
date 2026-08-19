package ex_work;

import java.util.Scanner;

public class Ex6_work {
    public static void main(String[] args){

        //문장 : aabbcc
        //결과 : abc

        Scanner sc = new Scanner(System.in);
        System.out.print("문장 : ");
        String str = sc.next();
        String outString = "";

        outer : for(int i = 0; i < str.length(); i++){
            for(int j = 0; j < i; j++){
                if(str.charAt(i)==str.charAt(j)){
                    continue outer;
                }
            }//inner
            outString += str.charAt(i);
        }//outer
        System.out.println("결과 : " + outString);
        outString = "";

        for( int i = 0; i < str.length(); i++ ){//강사님 방법

            char curr = str.charAt(i);
            if(outString.indexOf(curr) == -1){//핵심
                //indexOf는 같은 값이 없을 경우-1을 반환
                outString += curr;
            }
        }//for
        System.out.println("결과 : " + outString);
    }//main
}
