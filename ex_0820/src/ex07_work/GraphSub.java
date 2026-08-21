package ex07_work;

import java.util.Random;

public class GraphSub {
    
    Random rnd = new Random();


    //랜덤하게 ranArr의 0번째 인덱스부터100번째인덱스까지 값을 넣는 코드
    public void genNum(int[] ranArr){//주소값을 받으니까는 얕은복사로 실제 메인원본 배열에 값 입력
        for(int i = 0; i < ranArr.length; i++){
            ranArr[i] = rnd.nextInt(10);
        }//for
    }//genNum()


    //ranArr의 인덱스값에 0~9가 얼마나 있는지 분석하는 코드
    public int[] testRandom(int[] ranArr){
        int[] numCount = new int[10];
        for(int i = 0; i < ranArr.length; i++){
                numCount[ranArr[i]]++;
            }//for
        return numCount;
    }//testRandom


    //ranArr배열의 정보를 저장하고 있는numCount배열을 조건에 맞게 출력하는 코드
    public void infoRandom(int[] numCount){
        for(int i = 0; i < numCount.length; i++){
            System.out.print(i + "의 갯수 : ");
            for(int j = 0; j < numCount[i]; j++){
                System.out.print("#");
            }//inner
            System.out.println(" " + numCount[i]);
        }//outer
    }//infoRandom


    //---------------------------
    //강사님 풀이
    /*
    public void print(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(i + "의 갯수 : ");
            for(int j = 0; j < arr[i]; j++){
                System.out.print("#");
            }//inner
            System.out.println(" " + arr[i]);
        }//outer
    }
    */
}
