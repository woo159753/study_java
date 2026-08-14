package ex_work;

import java.util.Scanner;

public class Ex05_work {
    public static void main(String[] args) {
        /* 
        *학생 수를 입력하세요 : 3
        *학생1의 성적 : 90
        *학생2의 성적 : 73
        *학생3의 성적 : 84
        *--------------------------
        *평균성적 : 82.333336
        *------평균성적 이상인 학생들------
        *학생1 : 90
        *학생3 : 84
        *평균이상인 학생 수 : 2
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("학생 수를 입력하세요 : ");
        int studentNum = sc.nextInt();//stuCnt로 하는게 더 명료
        int[] studentScore = new int[studentNum];//stuGrade도 있음
        int goodStu = 0;//강사님은 avgCnt라고 설정
        int sum = 0;
        float avg = 0;

        for(int i =0; i < studentScore.length; i++){
            System.out.printf("학생%d 의 성적 : ",i + 1);
            studentScore[i] = sc.nextInt();
            sum += studentScore[i];
        }
        avg = (float)sum / studentNum;
        System.out.printf("평균 성적 : %.2f\n", avg);
        System.out.println("---평균 이상인 학생들---");
        
        for(int i = 0; i < studentNum; i++){
            if(studentScore[i] >= avg){
                System.out.printf(
                    "=> 학생%d : %d\n", i + 1, studentScore[i]);
                goodStu++;
            }//if
        }//for
        System.out.println("평균 이상인 학생 수 : " + goodStu);

    //다양한 변수값을 설정할 수 있어야 함을 배우기*
    }//main
}//class
