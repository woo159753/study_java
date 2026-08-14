package ex_work;

public class Ex02_work {
    public static void main(String[] args){

        //배열 arr에 담긴 모든 값의 합을 출력
        //-------------------------
        //결과 : 121
        int[] arr = {10, 11, 37, 61, 2};
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    //for문을 이용하여 배열을 특성 알수 있다*
    }//main
}
