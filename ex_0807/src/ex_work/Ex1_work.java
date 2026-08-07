package ex_work;

import java.util.Scanner;

public class Ex1_work {

    public static void main(String[] args){

        //윤년 구하기
        //키보드에서 년도를 입력받는다
        //입력받은 년도가 윤년인지 평년인지 판단

        //---윤년---
        //4로 나누어떨어지지만 100으로는 나누어떨어지지 않는 연도
        //연도가 100으로 나누어떨어지는 해는 평년
        // -> 4년 주기에 포함이 되어 있더라도 100으로 나누어지면 평년
        //단, 100으로 나누어지더라도 400으로 나누어지면 윤년
        //----------------------------------
        //연도 : 2020
        //2020년은 윤년입니다

        //연도 : 2021
        //2021년은 평년입니다
        int year = 0;

        Scanner yearsc = new Scanner(System.in);//Scanner class를 활용하여 yearsc객체 생성

        System.out.print("연도 : ");
        year = yearsc.nextInt();

        if(year % 4 == 0){

            if(year % 100 == 0){

                if(year % 400 == 0){
                    System.out.println(year + "년은 윤년입니다");
                }else{
                    System.out.println(year + "년은 평년입니다");
                }
            }else{
                System.out.println(year + "년은 윤년입니다");
            }
        }else{
            System.out.println(year + "년은 평년입니다");
        }
        //-------------------------------
        if(year % 400 == 0 ){
            System.out.println(year + "년은 윤년입니다");
        }else if(year % 100 == 0){
            System.out.println(year + "년은 평년입니다");
        }else if(year % 4 == 0){
            System.out.println(year + "년은 윤년입니다");
        }else{
            System.out.println(year + "년은 평년입니다");
        }
    }//main
}
