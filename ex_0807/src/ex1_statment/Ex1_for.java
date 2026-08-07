package ex1_statment;

public class Ex1_for {
    public static void main(String[] args){

        //for문 : 특정 코드를 원하는 만큼 반복하고자 할 때
        //for( 초기식; 조건식; 증감식 ){
        //  조건식이 참일 때 수행되는 영역
        //}
        //int a = 10;
        int i = 0;//전역변수

        //for (int a = 0; a <= 2; a++){}
        for(; i <= 2; i++ ){//전역변수 i를 그대로 사용
            //i는 for문에서만 사용 가능한 지역변수
            //전역변수와 같은 이름의 지역변수를 선언할 수 없다
            System.out.println(i);
            //a = 15;
        };//for
        // System.out.println(i); i는 for문 안에서만 쓸 수 있는 지역변수이기 때문에 오류
        // a는 전역변수이기 때문에 for문에서 사용가능
        // 초기식 -> 조건식 -> 참 -> 수행영역 -> 증감식 -> 2번
        //                -> 거짓 ->for문을 빠져나감
        //조건식이 거짓이 될 때까지 for문안에 실행문을 실행함
        System.out.println("-----------------------------");

        //10부터 ~ 1까지 반복하는 for문
        for( int j = 10; j >= 1; j-- ){
            System.out.println(j);
        }//for

        System.out.println("------------------------");
        //1 ~ 100까지 반복하는 for문을 만들되
        //5의 배수만 출력
        for( int j = 1; j <= 100; j++ ){
            if( j % 5 == 0 ){
                System.out.println(j);
            }
        }//for

        System.out.println("----------------------");

        for( int j = 1; j <= 100; j += 5 ){
            System.out.println( j+4 );
        }//for

        System.out.println("----------------------");

        for( int j = 1; j <= 100; ){
            System.out.println( j+4 );
            j += 5;
        }//for

    }//main
}//class
