package ex_work;

import java.util.Scanner;

public class Ex2_work {
    
    public static void main(String[] args){

        //키보드에서 입력받은 2 ~ 9 사이의 값에 해당하는
        //구구단을 출력
        //----------------------------------------
        //단 : 10
        //2 ~ 9 사이의 값을 입력하세요

        //단 : 5
        //5 * 1 = 5
        //5 * 2 = 10
        // ....
        //5 * 9 = 45
        
        int dan = 0;

        Scanner danNumber = new Scanner(System.in);
        System.out.print("2 ~ 9 사이의 값을 입력하세요 : ");
        dan = danNumber.nextInt();
        for(;dan < 2 || dan > 9;){
            System.out.println("2 ~ 9 사이의 값을 입력하세요");
            dan = danNumber.nextInt();
        }
        for(int mul = 1; mul <= 9; mul++){
            System.out.println(dan + " * " + mul + " = " + (dan * mul) );
        }

        if(dan <= 1 || dan >= 10){
            System.out.println("2 ~ 9 사이의 값을 입력하세요");//if로 처리하고 다시 실행하는 방법
        }else{
            for(int i = 1; i <= 9; i++){
                System.out.printf(
                    "%d*%d = %02d\n",dan,i,(dan*i));
            }
        }
        
        //resource leak : 'danNumber' if never closed java -> 객체를 만들었는데, 
        // 사용이 끝난 후 자원을 해제하는 close()가 없다는  IDE의 경고
        
        //그리고 System.in을 사용하는 Scanner에서 close()를 무조건 넣으면 
        // 오히려 이후의 키보드 입력에 문제가 생길수 있다는 점을 기억해야함
    }//main
}
