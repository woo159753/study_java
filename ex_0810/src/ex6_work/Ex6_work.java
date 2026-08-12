package ex6_work;

import java.util.Scanner;

public class Ex6_work {
    
    public static void main(String[] args){
        //키보드에서 출력될 수열의 갯수를 지정하고
        //피보나치수열대로 결과 보여주기
        //피보나치 수열 -> 수열의 앞 두개의 숫자를 더한 값을 수열 뒤에 이어붙이는 수열
        //-----------------------------------
        //입력 : 7
        //1 1 2 3 5 8 13

        Scanner sc = new Scanner(System.in);
        /* 
        String fibs = "";
        System.out.print("입력 : ");
        int num = sc.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 1;
        // 0(sum1) 0(sum2) 1(sum3) 로 생각하고
        // 값을 더하면서 교환하는 방법으로 코딩함

        for(int i = 1; i <= num; i++){//순서가 작성하는데 햇갈렷음
            fibs += sum3 + " ";
            sum1 = sum2;
            sum2 = sum3;
            sum3 = sum1 + sum2;
            
        }
        System.out.println(fibs);
        */
        //String타입으로 말고 그냥 출력해보기

        System.out.print("입력 : ");

        int cnt = sc.nextInt();
        int n1 = 0;
        int n2 = 0;
        int res = 1;

        for(int i = 0; i < cnt; i++){

            System.out.print(res + " ");
            n2 = n1;
            n1 = res;
            res = n1 + n2;
        }
        
    }//main
}
