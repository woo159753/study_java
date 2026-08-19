package ex_work;

import java.util.Scanner;

public class Ex1_work {
    public static void main(String[] args){
        //키보드에서 입력받은 값이 회문인지 판다
        //----------------------------
        //입력 : abcba
        //abcba은(는) 회문입니다

        //입혁 : abc
        //abc은(는) 회문이 아닙니다

        Scanner scanner = new Scanner(System.in);
        System.out.print("입력 : ");
        String inputStr = scanner.next();
        
        int i = 0;
        for( ; i < inputStr.length(); i++ ){// i를 inputStr.length() / 2 로 설정해도 될듯
            if(inputStr.charAt(i) != 
            inputStr.charAt(inputStr.length() - i - 1)){
                break;
            }//if
        }//for
        if(i == inputStr.length()){
            System.out.println(inputStr + "은 회문입니다");
        }else{
            System.out.println(inputStr + "은 회문이 아닙니다");
        }//if

        //-----------------------------------------
        //나는 저번에 강사님에게 배운 방법을 사용했다
        //강사님 첫번째 방법
        //원본과 원본을 뒤집어서 저장할 객체를 선언해서 equals로 비교하기
        //for문의 초기값 i = str.length() - 1 로 선언해서 rev에 거꾸로 이어붙인다

        //*두번째 방법* 
        // StringBuffer() 클래스를 사용하여 선언한 객체 sb를
        //String rev = sb.revers().toString();
        //toString은 StringBuffer()클래스의 데이터를 
        // String타입 객체로 변환하는 메서드
    }//main
}
