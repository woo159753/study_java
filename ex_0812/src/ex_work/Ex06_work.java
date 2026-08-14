package ex_work;

import java.util.Scanner;

public class Ex06_work {
    //못풀었다
    public static void main(String[] args){

        //키보드에서 정수를 10개 입력받아 배열에 담고
        //가장 많이 등장한 정수와 등장 횟수를 출력
        //----------------------------------
        //정수 : 
        //1
        //1
        //2
        //2
        //2
        //3
        //4
        //2
        //5
        //6
        //가장 많이 등장한 숫자 : 2
        //등장 횟수 : 4
        //가장 많이 등장한 정수가 하나가 아니라면 가장 많이 등장한 수중
        //가장 먼저 나온 숫자가 가장 많이 등장한 숫자로 나온다 -> gpt문제

        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        //int freCnt = 0;

        System.out.println("정수 : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }//arr[0~9]까지 값이 입력 된 상황

        int count = 0;
        int max = 0;
        for( int i = 0; i <arr.length; i++ ){
            int cnt = 0;//여기에 선언을 해야 계속 초기화가 된다
            for( int j = 0; j < arr.length; j++ ){
                //두값을 비교해야 하기때문에 이중 for문 사용

                if( arr[i] == arr[j] ){
                    cnt++;
                }//if
            }//inner
            if( cnt > count ){//for 안에 if를 이용하여 특정 배열의 특성을 알아낼수 있다!
                count = cnt;
                max = arr[i];
            }
        }//outer

        System.out.println("가장 많이 등장 : " + max);
        System.out.println("등장횟수 : " + count);

        //
        /* 
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    arr[i + 1] = arr[j];
                }
            }//inner
        }//outer
        */
       //두값을 비교하면서 배열의 특성을 분석하는 2중 for문 로직*
    }//main
}
