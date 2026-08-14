package ex_work;

public class Ex07_work {
    public static void main(String[] args){

        //배열 arr을 오름차순으로 출력
        //-------------------------
        //11 7 9 20 15 3
        //3 7 9 11 15 20
        int[] arr = {11, 7, 9, 20, 15, 3};
        //int arrNum = 0;

        System.out.print("원본배열 : ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n오름차순 : ");
        for(int i = 0; i < arr.length ; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[i]){//숫자 교환 메커니즘 이용
                    int ch = arr[j];//tmp로 변수이름 사용(temporary variable : 임시변수)
                    arr[j] = arr[i];
                    arr[i] = ch;
                }//if
            }//inner
            System.out.print(arr[i] + " ");
        }//outer
        //오름차순 메커니즘 배우기 <- 2중 for문(배열에서 비교할 값이 두개일 때)
        //2중 for문으로 비교하는 로직 + 변수값 교환로직 합한것*
    }//main
}
