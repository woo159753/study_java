package ex_work;

import java.util.Scanner;

public class Ex3_work {
    public static void main(String[] args){
        //키보드에서 아무값이나 입력받는다
        //입력받은 문자열에 소문자 a의 갯수를 출력
        //-----------------------------
        //입력 : dfdsvsafwodsza
        //a의 갯수 : 2

        Scanner sc = new Scanner(System.in);
        System.err.print("입력 : ");
        String inputString = sc.next();

        String[] aCnt = inputString.split("a");
        int cnt = aCnt.length - 1;
        if(inputString.indexOf("a") == inputString.length()){
            cnt++;
        }
        if(inputString.lastIndexOf("a") == 0){
            cnt++;
        }
        System.out.println("a의 갯수 : " + cnt);

        //못쓰는 코드 -> aa가 겹쳐있거나 그러면 쓰지 못함

        //----------------------------------------------------------

        cnt = 0;
        for( int i = 0; i < inputString.length(); i++ ){
            if(inputString.charAt(i) == 'a'){
                cnt++;
            }
        }//for
        System.err.println("a의 갯수 : " + cnt);


    }//main
}
