package ex2_while;

import java.util.Scanner;

public class Ex1_while {
    public static void main(String[] args) {
        
        //while문 : 간단한 구성을 가진 반복문
        //선 비교 후 처리
        //무한반복에 특화된 반복문

        //while문 보다 for문을 실무에서 많이 쓴다
        //더 좋은점은 초기값 설정 항목이 있어서?
        //  ->for내에서 쓸수 있는 전역변수 선언가능
        int num = 1;

        while(num <= 4){
            System.out.println(num);
            num++;

        }//while
        System.out.println("---------------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("홀수 : ");

        while( true ){
            int num2 = sc.nextInt();
            System.out.println(num2);
        }
    }//main
}
