package ex2_while;

import java.util.Random;

public class Ex5_do_while {
    public static void main(String[] args) {
        
        //자바, jsp, 안드로이드의 시험을 봤다.
        //각 과목별 점수는 랜덤하게 0 ~ 130점이 대입
        //각 과목별 점수를 검사하여
        //100점을 넘어가는 점수가 하나도 없을 때
        //최종 결과를 화면에 출력
        //--------------------------------------------
        //자바 : 37
        //jsp : 100
        //안드로이드 : 13

        Random random = new Random();

        int java = 0;
        int jsp = 0;
        int android = 0;

        do{
            java = random.nextInt(131) + 0;
            jsp = random.nextInt(131);
            android = random.nextInt(131);
        }while(java > 100 || jsp > 100 || android > 100);

        System.out.println("자바 : " + java);
        System.out.println("jsp : " + jsp);
        System.out.println("android : " + android);
    }//main
}
