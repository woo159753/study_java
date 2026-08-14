package ex1_array;

public class Ex2_array {
    public static void main(String[] args){

        //배열의 선언 + 생성 + 초기화
        int[] ar = {1, 2, 3, 4, 5};

        //1 2 3 4 5
        for( int i = 0; i < ar.length; i++ ){
            ar[i] = (i + 1) * 100;
            System.out.print(ar[i]+ " ");
        }//for
        System.out.println();
        System.out.println("-----------------------");

        //개선된 루프 ( -> 간소화 )
        //배열의 모든 데이터를 모두 사용하고 싶을 때 사용
        //알고는 있되 위의 방법을 우선 많이 사용해봐라
        for( int n : ar ){
            System.out.println(n);
        }//for
    }//main
}
