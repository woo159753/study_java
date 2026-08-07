package ex1_statment;

public class Ex2_for {
    public static void main(String[] args) {
        //1 ~ 10까지의 정수들 중에서 홀수의 합만 계산하여 출력
        //-----------------------
        //결과 25

        int total = 0;
        for( int i = 1; i <= 10; i++ ){

            if( i % 2 != 0 ){
                total += i;
            }//if

        }//for
        System.out.println("결과 : " + total);
    }//main
}
