package ex_work;

public class Ex03_work {
    public static void main(String[] args){

        //배열 arr에 담긴 값 중 가장 큰 값을 출력
        //-----------------------
        //가장 큰 값 : 19

        int[] arr = {4, 13, 7, 19, 1, 15};

        int bnum = 0;
        int forCount = 0;//바깥 포문을 나갈 수가 없어서 c를 사용함
        for(int i = 0; i < arr.length; ){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] > arr[i]){
                    i = j;
                    bnum = arr[j];
                    break;
                }
            }//inner
            forCount++;
            if( forCount > arr.length ){
                break;
            }
        }//outer
        System.out.print("가장 큰 값 : " + bnum);


        //--------------------------------------

        
        System.out.println();

        int max = arr[0];

        for( int i = 1; i < arr.length; i++ ){
            if( arr[i] > max ){
                max = arr[i];
            }
        }//for
        System.out.println("가장 큰 값 : " + max);
        //훨씬 간단하고 보기 좋음
    //이중 for문을 쓰지 않아도 풀 수 있다.(변수만 잘 설정해서 넣으면)*
    }//main
}
