package ex01_work;

import java.util.Scanner;

public class NumberMain {
    public static void main(String[] args){

        //값 : 100
        //100은(는) 숫자입니까? : true

        //값 : abc123
        //abc123은(는) 숫자입니까? : false

        Scanner sc = new Scanner(System.in);
        System.out.print("값 : ");
        String str = sc.next();
        NumberSub nb = new NumberSub();

        System.out.println( str + "은(는) 숫자입니까? : " + nb.res(str));
        //객체메서드 호출하는 것 보다 res에 저장해서 보여주는게 가독성이 좋을듯
        // (근데 변수하나를 main에 더 선언하는거여서 장단점이 있음)
        
    }//main
}
