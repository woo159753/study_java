package ex6_work;

import java.util.Scanner;

public class Ex1_work {
    public static void main(String[] args) {
        
        //1부터 100까지 숫자중에서
        //키보드에서 입력받은 수 보다 큰 첫번째
        //3의 배수를 찾아 출력
        //--------------------------------
        //입력 : 55
        //55보다 큰 첫번째 3의 배수 : 57

        Scanner sc = new Scanner(System.in);

        System.out.print("입력 : ");
        int num1 = 0;
        int num2 = 0;

        do{
            num1 = sc.nextInt();
            if(num1 > 100)
                System.out.println("잘못된 값을 입력했습니다");
        }while(num1 > 100);

        for (int i = num1; i <= 100; i ++){//for을 이용한 자료를 하나씩 검사하는 메커니즘!
            
            if(num1 % 3 == 0){//이부분은 i를 num1 + 1로 선언하면 코드 줄일 수 있음
                num2 = num1 + 3;
                break;
            }else{
                num2 = num1 + (3 - (num1 % 3));
            }
        }


        /* 
        int num2 = 0;
        if(num1 % 3 == 0){
            num2 = num1+ 3;
        }else{
            num2 = num1 + (3 - (num1 % 3));
        }
        */
       if(num2 > 100){
            System.out.println("범위를 벗어났습니다");
       }else{
            System.out.printf("%d보다 큰 첫번째 3의 배수 : %d",num1,num2);
       }
       /*
       int numb = sc.nextInt();
       for( int i = numb + 1; i <= 100; i++){
            if(numb % 3 == 0){
                System.out.printf("%d보다 큰 첫번째 3의 배수 : %d",numb,i);
                break;
            }
       } 
        */// 이 코드가 훨씬 간단하다
    

    }
}
