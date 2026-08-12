package ex4_continue;

public class Ex1_continue {
    public static void main(String[] args){

        //continue문 :
        //반복문 내에서 특정 코드를 건너 뛰고자 할 때 사용
        
        for( int i = 1; i <= 2; i++ ){
            for( int j = 1; j <= 5; j++ ){

                if( j % 2 == 0 ){
                    continue;//break와 마찬가지로 바로 밑에 코드를 작성하는 것은 오류이다
                    //for 문안에서 continue를 만나면 증감식
                    //가까운 for문의 증감식으로 넘어간다
                    //for문에 증감식이 없다면 조건식으로 간다
                }
                System.out.print(j + " ");

            }//inner
            System.out.println();
        }//outer

    }//main
}
