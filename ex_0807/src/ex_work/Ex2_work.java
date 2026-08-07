package ex_work;

import java.util.Scanner;

public class Ex2_work {
    
    public static void main(String[] args){

        //키보드에서 입력받은 2 ~ 9 사이의 값에 해당하는
        //구구단을 출력
        //----------------------------------------
        //단 : 10
        //2 ~ 9 사이의 값을 입력하세요

        //단 : 5
        //5 * 1 = 5
        //5 * 2 = 10
        // ....
        //5 * 9 = 45
        
        int dan = 0;

        Scanner danNumber = new Scanner(System.in);
        System.out.print("2 ~ 9 사이의 값을 입력하세요 : ");
        dan = danNumber.nextInt();
        for(;dan < 2 || dan > 9;){
            System.out.println("2 ~ 9 사이의 값을 입력하세요");
            dan = danNumber.nextInt();
        }
        for(int mul = 1; mul <= 9; mul++){
            System.out.println(dan + "*" + mul + "=" + (dan * mul) );
        }

        
    }//main
}
