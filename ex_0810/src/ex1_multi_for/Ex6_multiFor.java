package ex1_multi_for;

public class Ex6_multiFor {
    public static void main(String[] args){
        // *
        // * *
        // * * *
        // * * * *
        // * * * * *


        for(int i = 1; i <= 5; i++){
            int j = 1;
            for(; j <= i; j++){
                System.out.print("* ");
            }
            for(; j <= 10; j++){
                System.out.print(" ");
            }//inner
            System.out.println();
        }//outer

        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }//inner
            System.out.println();
        }//outer
        //밑의 코드가 훨씬 효율적이다

    }//main
}
