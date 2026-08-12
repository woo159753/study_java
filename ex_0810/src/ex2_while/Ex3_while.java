package ex2_while;

import java.util.Random;
import java.util.Scanner;

public class Ex3_while {
    public static void main(String[] args){

        //1 ~ 100 사이의 난수를 만들고
        //키보드에서 입력받은 값이 정답일 때 게임을 종료
        //--------------------------------------
        //숫자 : 25
        //UP
        //숫자 : 70
        //DOWN
        //숫자 : 50
        //정답입니다

        int ran = new Random().nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        int num = 0;

        while (num != ran){
            System.out.print("숫자 : ");
            //num = new Scanner(System.in).nextInt();
            //지속적으로 사용할 코드면 객체는 반복문 밖에 생성하는게 좋다
            num = sc.nextInt();
            if( num > ran){
                System.out.println("DOWN");
            }else if( num < ran ){
                System.out.println("UP");
            }else{
                System.out.println("정답입니다");
            }
        }
        //System.out.println("정답입니다"); -> 안쪽에 넣는 방법도 있다
    }//main
}
