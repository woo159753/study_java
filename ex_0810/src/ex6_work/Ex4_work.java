package ex6_work;

import java.util.Scanner;

public class Ex4_work {
    public static void main(String[] args){
        //키보드에서 입력받은 두 개의 수의 최대공약수 출력
        //-----------------------------------------
        //수1 : 18
        //수2 : 12
        //최대 공약수 : 6

        Scanner sc = new Scanner(System.in);
        System.out.print("수1 :");
        int numb = sc.nextInt();
        System.out.print("수2 : ");
        int nums = sc.nextInt();

        if(numb < nums){
            int num = numb;
            numb = nums;
            nums = num;
        }//값을 교환 -> 최소 공배수는 입력 받은 값 두개중 작은 수 
        // 보다는 무조건 작기 때문에 값을 특정 짓기 위한 것

        for( int gdiv = nums; gdiv > 0; gdiv-- ){
            //gdiv를 전역변수로 선언해도됨
            //그러면 for문 밖에서도 쓸 수 있음 -> 강사님 방법
            if( numb % gdiv == 0 && nums % gdiv == 0 ){
                System.out.println("최대 공약수 : " + gdiv);
                break;
            }//if
        }//for
        //유클리드 호제법을 이용한 최대공약수 구하기
        while( nums != 0 ){
            int tmp = numb % nums;
            numb = nums;
            nums = tmp;
        }
        System.out.println(numb);
        //이 방법은 시간복잡도?: 매운 빠른 속도를 자랑한다

    }//main
}//class
