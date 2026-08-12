package ex6_work;

import java.util.Scanner;

public class Ex5_work {

    public static void main(String[] args){

        //입력받은 두 수의 최소공배수
        //------------------------
        //수1 : 6
        //수2 : 10
        //최소공배수 : 30

        Scanner sc = new Scanner(System.in);

        System.out.print("수1 : ");
        int numb = sc.nextInt();
        System.out.print("수2 : ");
        int nums = sc.nextInt();

        if( numb < nums ){
            int num = numb;
            numb = nums;
            nums = num;
        }

        for(int lmul = numb; ; lmul++){
            //조건식에 lmul <=nums * numb를 넣어도 됨
            //lmul을 1부터 검사해서 시작해면 위의
            //숫자 교환을 하지 않아도됨
            if( lmul % numb == 0 && lmul % nums == 0 ){
                System.out.print("최소 공배수 : " + lmul);
                break;
            }
        }
        System.out.println("-------------------");
        //최소공배수 (유클리드 호제법)

        int x = numb;
        int y = nums;

        while( y!= 0){
            int tmp = x % y;
            x = y;
            y =tmp; 
        }

        int gcd = x;//최대공약수

        //최소공배수

        int lcm = (numb * nums) / gcd;
        System.out.println(lcm);

    }
}
