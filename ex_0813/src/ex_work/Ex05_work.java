package ex_work;

import java.util.Scanner;

public class Ex05_work {
    public static void main(String[] args) {
        //찾을 값 :6
        //6보다 큰 첫번째 요소 : 7
        //해당 행의 모든 요소
        //5 6 7 8

        int[][] array = { {1, 2, 3, 4},
                          {5, 6, 7, 8},
                          {9, 10, 11, 12},
                          {13, 14, 15, 16} };

        System.out.print("찾을값 : ");
        int inum = new Scanner(System.in).nextInt();

        outer : for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if(array[i][j] > inum){
                    System.out.printf(
                        "%d보다 큰 첫번째 요소 : %d\n",inum,array[i][j]);
                    System.out.println("해당 행의 모든 요소");
                        for(int t = 0; t < array[i].length; t++){
                            //i를 밖에 선언하고 for문 밖에서 출력하는 방법도 있다
                            System.out.print(array[i][t] + " ");
                        }
                    break outer;
                }//if
            }//inner
        }//outer
    }//main
}
