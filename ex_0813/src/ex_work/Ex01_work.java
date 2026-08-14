package ex_work;

public class Ex01_work {
    public static void main(String[] args){

        //배열 arr에 담긴 모든 값의 합과 평균 구하기
        //------------------------------
        //총합 : 119
        //평균 : 7.43

        int[][] arr = { {7, 8, 11, 6}, 
                        {20, 13, 9, 2, 5}, 
                        {7, 7, 10},
                        {2, 3, 4, 5} };
        int sum = 0;
        int cnt = 0;//for문을 도는 수 = 총 arr[][] 의 개수를 저장
        float average = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){//이런 이중 for문이 이중 배열의 모든 값에 접근하는 기본식
                sum += arr[i][j];
                cnt++;
            }//inner
        }//outer
        average = (float)sum / cnt;
        System.out.println("총합 : " + sum);
        System.out.printf("평균 : %.2f",average);
    }//main
}//class
