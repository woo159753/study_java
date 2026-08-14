package ex_work;

import java.util.Scanner;

public class Ex01_work {
    public static void main(String[] args){

        //입력 : 5
        //크기가 5개인 배열이 생성됨
        //배열에 ABCDE가 저장되고 출력 되어야 함
        //ABCDE

        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        int arrSize = sc.nextInt();
        char[] alpha;
        alpha = new char[arrSize];
        for(int i = 0; i < alpha.length; i++){

            alpha[i] = (char)('A' + i);//casting생각해야함!
            System.out.print(alpha[i]);
        }//for
        
        System.out.println();
        System.out.println("--------------------------");
        char[] cArr = new char[arrSize];
        char ch = 'A';

        for(int i = 0; i < arrSize; i++){
            System.out.print((cArr[i] = ch++));
            //후행 증감은 ;보다 뒤에 연산
        }
        //특성을 가진 배열을  for문을 이용하여 생성*
        }//main
}
