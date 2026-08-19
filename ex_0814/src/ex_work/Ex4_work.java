package ex_work;

import java.util.Scanner;

public class Ex4_work {
    public static void main(String[] args){

        //키보드에서 입력받은 OX값을 계산하여 출력
        //-------------------------
        //입력 : ooxxo
        //결과 : 4

        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        String str = sc.next();
        int res = 0;
        int cnt = 0;

        for(int i = 0; i < str.length(); i++){

            if(str.charAt(i) == 'o'){
                cnt++;
            }else{
                cnt = 0;
            }
            res += cnt;
        }//for
        System.out.println("결과 : " + res);

    }//main
}
