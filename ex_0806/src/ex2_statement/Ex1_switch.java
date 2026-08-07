package ex2_statement;

public class Ex1_switch {
    public static void main(String[] args){

        //switch-case문
        //비교값과 조건값을 통해서 원하는 결과를 얻어내기 위한 제어문

        //switch-case문의 비교값으로는
        //1. 정수( byte, short, int )
        //2. 문자열( String )
        //3. 문자( char )
        //만 가능하다

        //switch( 비교값 ){
        //  case 조건값:
        //      비교값과 조건값이 일치할 때 실행되는 영역
        //  break;
        //}

        int n = 5;

        switch( n ){ //비교값
            case 1: //조건값
                System.out.println("게임시작");
                break;

            case 2:
                System.out.println("설정");
                break;

            case 3:
                System.out.println("종료");
                break;

            default:
                //비교값과 일치하는 조건값이 하나도 없을 때
                //반드시 호출되는 영역
                System.out.println("올바른 값을 입력하세요");
                break;
        }//switch
        //중복되는 조건값은 없어야함
        //switch case문은 비교값이 여러 조건값들과 한번에 비교된다
        //else if 문은 위에서부터 조건식이 참인 결과를 찾기 때문에 처리 속도는 switch case문이 빠르다
    }// main

}// class
