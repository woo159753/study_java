package ex1_multi_for;

public class Ex2_multiFor {
    public static void main(String[] args) {
        
        //01 02 03 04
        //05 06 07 08
        //09 10 11 12

        int num = 1;
        for( int i = 1; i <= 3; i++ ){
            for(int j = 1; j <= 4; j++){
                System.out.printf("%02d ",num++);
            }//inner
            System.out.println();
        }//outer
        //for문안의 지역변수는 보통 cycle이 돌면서 값이 변하는데
        //print되는 숫자는 1씩증가해 12까지 가기 때문에 for문 밖에 전역변수로 선언

        //num을 선언하기 싫다면 4*i를 안쪽 for문의 j에 더해서 값을 출력해도 같은 결과를 얻을 수 있다
    }//main
}
