package ex_work;

import java.util.Scanner;

public class Ex06_work {
    public static void main(String[] args){

        //등록할 인원수 : 2
        //이름 : 홍길동
        //수학 : 99
        //영어 : 100
        //국어 : 75
        //-------------------
        //이름 : 김길순
        //수학 : 70
        //영어 : 89
        //국어 : 99
        //-------------------
        //총 2명의 학생 정보가 등록됨
        // [학생 등록정보 ]
        //홍길동    99  100 75
        //김길순    70  89  99
        Scanner scanner = new Scanner(System.in);
        System.out.print("등록할 인원수 : ");
        int studentCnt = scanner.nextInt();
        
        String[] info = {"이름 : ","수학 : ","영어 : ","국어 : "};
        String[][] str = new String[studentCnt][info.length];

        //학생정보 등록
        //유지보수가 편하다
        for(int i = 0; i < str.length; i++){
            for(int j = 0; j < str[i].length; j++){
                System.out.print(info[j]);
                str[i][j] = scanner.next();

            }//inner
        }//outer

        /* 
        for(int i = 0; i < str.length; i++){
            for(int j = 0; j < str[i].length;){
                //j값을 직접입력하는 게 낫다 + 이런 방법이 있다는 것을 숙지
                System.out.print("이름 : ");
                str[i][j] = scanner.next();
                j++;
                System.out.print("수학 : ");
                str[i][j] = scanner.next();
                j++;
                System.out.print("영어 : ");
                str[i][j] = scanner.next();
                j++;
                System.out.print("국어 : ");
                str[i][j] =scanner.next();
                j++;
            }//inner
            System.out.println("-------------------");
        }//outer
        */
        System.out.printf(
            "총 %d명의 학생 정보가 등록됨\n[ 학생 등록정보 ]\n", studentCnt);
        for(int i = 0; i <str.length; i++){
            for(int j = 0; j < str[i].length; j++){
                System.out.printf("%s\t",str[i][j]);
            }
            System.out.println();
        }
    }//main
}
