package ex1_multi_for;

public class Ex4_multiFor {
    public static void main(String[] args){
        //*****
        //12345
        //*****
        //12345
        //*****
        //을 찍는 코드 구현하라

        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5; j++){
                if(i % 2 == 0){
                    System.out.print(j + " ");
                }else{
                    System.out.print("* ");
                }//if
            }//inner
            System.out.println();
            
        }//outer
    }//main
}
