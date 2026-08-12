package ex1_multi_for;

public class Ex8_multiFor {
    public static void main(String[] args){

        /*
        1 2 3 4 5 6 7 8 9 10
        2 3 4 5 6 7 8 9 10 1
        3 4 5 6 7 8 9 10 1 2
        ...
        10 1 2 3 4 5 6 7 8 9
         */

        //생각 -> 맨 앞줄이 바깥 for문의 증감식으로 증가하는 변수로 하면 좋겟다
        //    -> 증가하면서 한줄 출력하면 되는데 10넘으면 그때부터 다시 한자리수로 돌아간다
        //    -> -= 10으로 해결
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= 10; j++){
                System.out.print(i + " ");
                i++;
                if(i > 10){
                    i -= 10;
                }//if
            }//inner
            System.out.println();
        }//outer

        for(int i = 1; i <= 10; i++){
            for(int j = 0; j < 10; j++){
                int num = i + j;//지역변수 num값을 사용했다
                if(num > 10)
                    num -= 10;
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }//main
}
