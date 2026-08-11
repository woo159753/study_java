package ex_work;

import java.util.Scanner;

public class Ex5_work {
    public static void main(String[] args){
        //정수 n1, n2를 입력받고
        //n1 ~ n2 사이의 합을 출력
        //------------------------
        //수1 : 2
        //수2 : 5
        //결과 : 14

        //수1 : 5
        //수2 : 2
        //결과 : 14

        Scanner sc = new Scanner(System.in);
        System.out.print("수1 : ");
        int n1 = sc.nextInt();
        System.out.print("수2 : ");
        int n2 = sc.nextInt();
        int result = 0;
    

        //n1과 n2의 값을 교환
        if( n1 > n2 ){
            int n3 = n1;
            n1 = n2;
            n2 = n3;
        }//변수를 스왑하는 방법
        for(int i = n1; i <= n2; i++){
            result += i;
        }//기존에 만들어 놓은 것을 건드리지 않고 함
        System.out.println("결과 : " + result);
        //훨씬 좋은 방법인듯

        //2번째 방법
        /* 
        for(;n1 != n2;){
            if(n1 >= n2){
                result += n2;
                n2++;
            }else{
                result += n1;
                n1++;
            }
        }
        System.out.println("결과 : " + (result + n1));
        */
        //1번째 방법
        /*
        if(n1 >= n2){
            for(;n2 <= n1; n2++){
                result += n2;
            }
        }else{
            for(;n1 <= n2; n1++){
                result += n1;
            }
        }//if
        System.out.println("결과 : " + result);
        */
    }//main
}
