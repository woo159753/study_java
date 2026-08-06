package ex5_work;

public class Ex1_work {
    public static void main(String[] args) {

        /*
         * 과수원이 있다.
         * 배, 사과, 오랜지를 키우고 있는데, 하루에 생산되는 양이
         * 각각 5, 7, 5 개.
         * 
         * 1.과수원에서 하루에 생산되는 과일의 총 갯수를 출력
         * 2.시간당 전채 과일의 평균 생산 갯수
         * 단, 과일의 갯수를 담는 변수는 int, 평균을 계산할 변수는 float
         */

        int pCount = 5;
        int aCount = 7;
        int oCount = 5;
        int i = 10000;

        int fruitCount = pCount + aCount + oCount;
        float fruitAverage0 = (fruitCount * i / 24);
        float fruitAverage = fruitAverage0 / i;

        System.out.println(i);
        System.out.println("하루에 생산되는 총 과일의 개수 : " + fruitCount);
        System.out.println("시간당 전채 과일의 평균 생산 개수 : " + fruitAverage);

        int pear = 5;// 배
        int apple = 7;// 사과
        int orange = 5;// 오랜지
        int total = pear + apple + orange;// 평균
        // float avg = (float)total / 24;
        float avg = total / 24f;
        System.out.println("하루생산량 : " + total);
        System.out.println("시간당 평균 : " + avg);
        // *자료형 변환하면 /가 몫을 계산하는 것이 아닌 진짜 나눗셈을 계산할 수 있다*

        /*
         * 문제 8. 난이도 ★★★
         * 
         * 한 학원의 학생 수는 다음과 같다.
         * 
         * 자바반 : 18명
         * 파이썬반 : 22명
         * 웹반 : 15명
         * 데이터반 : 25명
         * 요구사항
         * 1.전체 학생 수를 출력하시오.
         * 2.반당 평균 학생 수를 출력하시오.
         * 3.학생 수의 절반이 오후 수업을 듣는다고 할 때, 오후 수업 학생 수를 출력하시오.
         * 4.평균은 float형 변수에 저장하시오.
         */
        int javaStuCnt = 18;
        int pythonStuCnt = 22;
        int webStuCnt = 15;
        int dataStuCnt = 24;
        int totalStu = javaStuCnt + pythonStuCnt + webStuCnt+ dataStuCnt;
        float stuAvg = totalStu / 4f;

        System.out.println("반당 평균 학생 수는 : " + stuAvg);
        System.out.println("오후 수업을 듣는 학생의 수는 : " + (int)totalStu/2 + "명");


    }
}
