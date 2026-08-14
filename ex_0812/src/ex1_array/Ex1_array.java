package ex1_array;

public class Ex1_array {
    
    public static void main(String[] args){

        //배열은 '같은 자료형끼리 모아둔 하나의 묶음'
        //효율적인 자료관리를 위해 반드시 필요하다

        //+스택, 힙, 스태틱, 래지스토리 중 스택과 힙을 알아야함

        int su1 = 100;
        int su2 = 200;
        int su3 = 300;
        int su4 = 400;

        System.out.println(su1);
        System.out.println(su2);
        System.out.println(su3);
        System.out.println(su4);
        //변수 이름은 변수로 표현할 수가 없기 때문에 4줄이나 출력해야함
        //->
        //1) 배열 선언
        int[] arr;

        //2) 배열 생성
        arr = new int[4];

        //3) 배열 초기화
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;
        arr[3] = 400;

        //중간에 배열의 크기를 조정할 수 없다
        //존재하지 않는 index에 접근할 수 없다
        //arr[4] = 500;

        //배열의 모든 내용을 출력
        for( int i = 0; i < arr.length; i++ ){
            //arr.length를 사용하면 혹시 배열의 크기가 달라지더라도 유지보수가 편하다
            System.out.println(arr[i]);
        }
    }//main
}
