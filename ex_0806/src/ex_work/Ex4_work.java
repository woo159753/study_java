package ex_work;

import java.util.Scanner;

public class Ex4_work {
    public static void main(String[] args) {
        
        //수1 : 10
        //수2 : 20
        //연산자 : +
        //10 + 20 = 30
        //수1과 수2는 키보드를 통해 입력

        int num1 = 0;
        int num2 = 0;
        String operator = "";
        Scanner num = new Scanner( System.in );

        System.out.print("수1 : ");
        num1 = num.nextInt();
        System.out.print("수2 : ");
        num2 = num.nextInt();
        System.out.print("연산자 : ");
        operator = num.next();

        switch( operator ){
            case "+":
                System.out.print( num1 + operator + num2 + "=" );
                System.out.println( num1 + num2 );
            break;

            case "-":
                System.out.print( num1 + operator + num2 + "=" );
                System.out.println( num1 - num2 );
                break;

            case "*":
                System.out.println( num1 + operator + num2 + "=" + num1 * num2 );// *연산은 먼저계산되는구나
                break;

            case "/":
                System.out.println( num1 + operator + num2 + "=" + ((float)num1 / num2) );//()로 묶어주면 됨
                break;

            default:
                System.out.println("연산자 오류");
                break;
            
        }//switch-case
    }//main
}
