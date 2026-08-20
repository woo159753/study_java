package ex1_copyarray;

public class Ex1_CopyArray {
    public static void main(String[] args){

        //얕은 복사
        int[] arr1 = {1, 2, 3};
        int[] arr2 = arr1;//주소를 넘겨 받는것(->얕은복사)

        arr2[0] = 100;
        System.out.println( arr1[0] );
        System.out.println( arr2[0] );
        //원본까지 값이 바뀔수 있다
        //메서드의 파라미터로 배열을 넘기면 기본적으로 주소를 넘기기
        //때문에 메인 메서드의 값이 바뀐다

        //깊은복사
        int[] arr3 = {1, 2, 3};
        int[] arr4 = new int[ arr3.length ];
        for(int i = 0; i < arr3.length; i++){
            arr4[i] = arr3[i];
        }
        arr3[0] = 100;
        System.out.println(arr3[0]);
        System.out.println(arr4[0]);
        //주소가 다르기 때문에 원본은 안바뀐다
    }//main
}
