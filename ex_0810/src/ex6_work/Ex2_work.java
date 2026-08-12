package ex6_work;

import java.util.Scanner;

public class Ex2_work {
    public static void main(String[] args) {
        
        //1부터 사용자가 입력한 숫자까지
        //3의 배수의 갯수, 5의 배수의 갯수를 출력
        //----------------------------------
        //정수 : 70
        //3의 배수 : 23
        //5의 배수 : 14

        Scanner scanner =new Scanner(System.in);
        System.out.print("정수 : ");

        int inputNumber = scanner.nextInt();
        int mult3 = 0;
        int mult5 = 0;

        for(int i = 1; i <= inputNumber; i++){
            if(i % 3 == 0){
                mult3++;
            }
            if(i % 5 == 0){
                mult5++;
            }
        }//for
        System.out.println("3의 배수의 개수 : " + mult3);
        System.out.println("5의 배수의 개수 :" + mult5);
    }//main
}//class
