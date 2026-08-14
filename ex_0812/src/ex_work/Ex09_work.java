package ex_work;

import java.util.Random;

public class Ex09_work {
    public static void main(String[] args) {

        // 1~45사이의 중복되지 않는 난수 6개를 출력하는 -> 처음에는 1~6으로 범위를 설정해보자
        // 로또번호 생성기
        // ------------------------
        // 17 2 45 27 9 11
        int[] lotto = new int[6];
        Random rnd = new Random();
        boolean res = true;

        while (res) {

            for (int i = 0; i < lotto.length; i++) {
                lotto[i] = rnd.nextInt(45) + 1;
            }

            for (int i = 0; i < lotto.length; i++) {
                for (int j = i + 1; j < lotto.length; j++) {
                    if (lotto[i] == lotto[j]) {
                        res = false;
                        break;
                    } // if
                } // inner
                if (res == false){
                    break;
                }
            } // outer
            if (res == false){
                res = true;
            }else{//else로 묶었어야 됏네 if를 두개 쓰니까 자꾸 결과가 이상했어
                res = false;
            }
        } // while
        for(int i = 0; i < lotto.length; i++){
            System.out.print(lotto[i] + " ");
        }//for
        //로또 난수를 생성 할 때 지금까지 생성했던 로또 번호와 같은게 있는지 비교하고 
        //같은게 있으면 다시 생성하는 코드가 더 효율적이다.

        System.out.println();
        outer : for(int i = 0; i < lotto.length; ){

            lotto[i] = rnd.nextInt(45) + 1;
            //중복값 비교
            for( int j = 0; j < i; j++ ){
                if(lotto[i] == lotto[j]){
                    continue outer;
                }
            }//inner
            System.out.print(lotto[i] + " ");
            i++;
        }//outer

        //로또문제 -> 같은 수가 없게 숫자를 생성하는 코드짜는 로직(continue 사용)*
    }//main
}
