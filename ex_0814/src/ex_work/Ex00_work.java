package ex_work;

import java.util.Random;
import java.util.Scanner;

public class Ex00_work {
    
    public static void main(String[] args){

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int[] rnd = new int[3];
        for(int i = 0; i < rnd.length; i++){
            rnd[i] = random.nextInt(9) + 1;

            for(int j = 0; j < i; j++){
                if(rnd[j] == rnd[i]){
                    i--;
                    break;
                }//if
            }//inner
        }//outer
         
        /*
        for(int i = 0; i < rnd.length; i++){
            System.out.print(rnd[i]+ " ");
        }//잘 생성됫는지 검증용 코드
        */
       int strike = 0;
       int ball = 0;
       int cnt = 0;
       int[] tmp = {0,0,0};

        while(true){

            System.out.print("세자리 수를 입력하세요(예 : 123)");
            int tmpNumber = scanner.nextInt();
            tmp[0] = tmpNumber / 100;
            tmp[1] = (tmpNumber % 100) / 10;
            tmp[2] = tmpNumber % 10;
            cnt++;

            for(int i = 0; i < rnd.length; i++){
                for(int j = 0; j < tmp.length; j++){
                    if(rnd[i] == tmp[j]){
                        if(i == j){
                            strike++;
                        }else{
                            ball++;
                        }//if-else
                    }//if
                }//inner
            }//outer
            if(strike == 3){
                System.out.print(cnt + "회 정답 !! - " + tmpNumber);
                break;
            }else if(strike == 0 && ball == 0){
                System.out.println("OUT!!");
            }else{
                System.out.printf("%dStrike, %d Ball\n",strike,ball);
            }
            strike = 0;
            ball = 0;
        }//while
    }//main
}
