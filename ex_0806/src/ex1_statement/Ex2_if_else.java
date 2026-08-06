package ex1_statement;

public class Ex2_if_else {
    public static void main(String[] args) {
        
        //if-else문 : 하나의 조건식에 대해서
        //참일때와 거짓일 때를 모두 판단할 수 있는 제어문

        int n = 40;
        String str = "";

        if( ++n >= 51 ){
            //조건식이 참일 때 실해되는 영역
            str = "n은 50이상의 수";
        }
        else{
            //조건식이 거짓일 때 실해되는 영역
            str = "n은 50미만의 수";
        }
        System.out.println(str);
        /*
        변수 age에 나이를 대입하고 30이상이면
        드실만큼 드셧군요를, 그렇지 않으면 조금더 드셔도 돼요를 출력하는 
        if문을 구현
         */

        int age = 28;
        str = "";
        if( age >= 30 ){
            str = "드실만큼 드셧군요";
        }else{
            str = "조금 더 드셔도 돼요";
        }

        System.out.println(str);
        //위의 30어쩌구 코드를
        //삼항 연산자로 구현하기

        age = 8;
        str = "";

        str = age >= 30 ? "드실만큼 드셧군요" : "조금 더 드셔도 돼요";
        str = age <30 && age >= 10 ? "조금 더 드셔도 돼요" : "밥을 더 먹어야 돼요";

        System.out.println(str);
    }//main
}
