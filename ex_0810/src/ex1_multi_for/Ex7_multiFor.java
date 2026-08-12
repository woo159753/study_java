package ex1_multi_for;

public class Ex7_multiFor {
    public static void main(String[] args){

        //2 x 1 = 2     3 x 1 = 3   4 x 1 = 4 ... 9 x 1 = 9
        //...
        //2 x 9 = 18    3 x 9 = 27  ..............9 x 9 = 81

        for(int i = 1; i <= 9; i++){
            for(int j = 2; j <= 9; j++){
                System.out.printf("%d x %d = %d\t",j,i,( j * i));
            }//inner
            System.out.println();
        }//outer
    }//main
    //이번 결과에는 바깥 for문은 가로축 x를 담당하고 안쪽 for문은 세로축 y를 담당한다(사고의 전환)
    //결과값을 생각 할 때 고정되는 값과 고정되지 않는 값을 생각하며 프로그램을 짜야한다
    //금요일날 다시한번 문제 나옴 -> 복습
}
