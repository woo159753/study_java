package ex5_label;

public class Ex3_label {
    public static void main(String[] args) {
        
        outer :for( int i = 1; i<= 3; i++ ){
            for( int j = 1; j <= 5; j++ ){

                if( j % 2 == 0 ){
                    continue outer;
                }
                System.out.print(j + " ");
            }//inner
            System.out.println();//for가 정상적으로 끝난 후에야 개행이 된다
        }//outer

    }//main
}
