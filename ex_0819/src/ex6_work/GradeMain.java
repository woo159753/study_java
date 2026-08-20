package ex6_work;

import java.util.Scanner;

public class GradeMain {
    public static void main(String[] args){

        //--등급기준--
        //VIP -> 구매금액의 10%
        //GOLD -> 5%
        //SILVER -> 3%

        //키보드에서 구매금액과 등급을 입력받아 적립포인트를 계산
        //---------------------------
        //구매금액 : 10000
        //등급 : vip
        //적립포인트 : 1000

        //구매금액 : 1000
        //등급 : aaa
        //회원등급이 올바르지 않습니다
        //적립포인트 : 0

        Scanner sc = new Scanner(System.in);

        System.out.print("구매금액 : ");
        int pay = sc.nextInt();
        System.out.print("회원등급 : ");
        String rating = sc.next();

        GradeSub gds = new GradeSub();
        int point = gds.oper(pay, rating);
        System.out.println("적립포인트 : " + point);

    }//main
}
