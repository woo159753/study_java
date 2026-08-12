package ex1_multi_for;

public class Ex1_multiFor {
    public static void main(String[] args) {
        
        //1 2 3 4 5
        //1 2 3 4 5
        //1 2 3 4 5
        for( int i = 1; i <= 3; i++){ //y (행)

            for(int j = 1; j <= 5; j++){//x (열)

                System.out.print( j + " ");

            }//inner

            System.out.println();

        }//outer
        System.out.println("---------------------------");
        //5 4 3 2 1
        //5 4 3 2 1
        //5 4 3 2 1
        for(int i = 1; i <= 3; i++){
            for(int j = 5; j >= 1; j--){
                System.out.printf("%d ",j);
            }//in
            System.out.println();
        }//out
        //나는 for문에서 조건문을 설정할때 실수가 자주나옴
    }//main
}//class
