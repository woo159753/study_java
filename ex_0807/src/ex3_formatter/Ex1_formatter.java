package ex3_formatter;

public class Ex1_formatter {
    
    public static void main(String[] args){

        //저의 나이는 20살 입니다
        int age = 20;
        System.out.printf("저의 나이는 %d살 입니다\n", age);//f는 formetter의 줄임말
        //System.out.println(); -> \n == enter이다.

        //저는 20살이고 3층에 살아요
        System.out.printf(
            "저는 %d살이고 %02d층에 살아요\n",age,3);
            //%02d -> 한자리 숫자가 들어오면 0을 넣어서 2자리 수로 만들어준다

        //나는 (박)씨야
        System.out.printf("나는 %c씨야\n",'박');

        //나는 a형이야
        System.out.printf("나는 %C형이야\n",'a');
        //%C : 소문자를 대문자로 바꿔줌

        //원주율 : 3.141592
        System.out.printf("원주율 : %.2f\n",3.141592);
        //.2 -> 소수점뒤로 2자리 수까지로 바꿔줌

        //저는 홍길동 입니다
        System.out.printf("저는 %s 입니다\n","홍길동");

        System.out.printf("%s\t %d\t %d\n","김윤",100,95);
        System.out.printf("%s\t %d\t %d\n","김길동",100,7);

        //오늘 강수량은 15%입니다
        System.out.printf(
            "오늘 강수량은 %d%%입니다\n",15);
            //%f라는 문자를 쓰고 싶다면 %앞에 %를 하나 더 써야한다
    }//main
    /*

    formetter의 문법

    \n : 강제개행
    %d : 정수
    %c : 문자
    %f : 실수
    %s : 문자열
    \t : tab키만큼의 공간을 확보
    %% : %(특수문자)

    */
}//class
