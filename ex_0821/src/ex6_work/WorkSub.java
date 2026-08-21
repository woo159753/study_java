package ex6_work;

import java.util.Scanner;

public class WorkSub {
    
    public int scan(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }//scan
    
    public void infoNumber(int number){
        int i = 2;
        for(; i < number; i++){
            if(number % i == 0){
                break;
            }//if
        }//for
        if(i == number){
            System.out.println(number + "은(는) 소수입니다");
        }else{
            System.out.println(number + "은(는) 소수가 아닙니다");
        }//if
    }//infoNumber()
}
