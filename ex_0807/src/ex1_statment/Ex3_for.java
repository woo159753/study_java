package ex1_statment;

import java.util.Scanner;

public class Ex3_for {
    
    public static void main(String[] args){

        //은행 이자가 하루에 1원씩 추가된다
        //원금과 예치일수를 키보드에서 입력받고
        //예치기한이 끝났을 때 나의 원금이 얼마가 되어있는지 출력
        //----------------------------------------
        //원금 : 1000
        //예치일 : 5
        //5일 후의 잔액은 1005원 입니다
        //for문을 써서 만들면 좋겟다

        int interest = 1;
        int day = 0;
        int sum = 0;

        Scanner num = new Scanner(System.in);
        System.out.print("원금 : ");
        sum = num.nextInt();
        System.out.print("예치일 : ");
        day = num.nextInt();

        for(;day >= 1; day--){
            sum += interest;
        }//for
        // -> 이 경우 변수 day가 변한다
        // -> day를 여러 곳에서 사용해야 할 때 좋지 않음
        System.out.println(day + "일 후의 잔액은 " + sum + "원 입니다");
        /*for( int i = 0; i < day; i++){
            sum++;//컴퓨터 효율성 측면과 가독성 면에서 += 1보다 좋다
        }//for
        System.out.println(day + "일 후의 잔액은 " + sum + "원 입니다");
        */
    }//main
}//class
