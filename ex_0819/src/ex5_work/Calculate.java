package ex5_work;

import java.util.Scanner;

public class Calculate{
    //수1 : 5
    //수2 : 10
    //연산자 : +
    //결과 : 15

    //수1 : 5
    //수2 : 10
    //연산자 : a
    //결과 : 연산기호가 올바르지 않습니다

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("수1 : ");
        int su1 = sc.nextInt();

        System.out.print("수2 : ");
        int su2 = sc.nextInt();

        System.out.print("연산자 : ");
        String op = sc.next();


        Oper opr = new Oper();
        int res = opr.oper(su1, su2, op);
        System.out.print("결과 : " + res);
    }//main
}