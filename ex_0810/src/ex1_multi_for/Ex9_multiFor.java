package ex1_multi_for;

public class Ex9_multiFor {

    public static void main(String[] args) {
        /*

            *    
           ***  
          *****
         *******
        *********

        */
       //i = 1 -> 4
       //i = 2 -> 3
       //i = 3 -> 2
       //i = 4 -> 1
       //i = 5 -> 0
        for (int i = 0; i < 5; i++){

            for(int j = 5 - i; j > 1; j--){
                System.out.print(" ");
            }
            for(int j = 1; j <= 1 + (2 * i); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //--------------------------------
        
        //for(for()+for())가 아닌 for(for()) + if 문으로 만들수 있다

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5 + i; j++){
                if(i + j > 3){//i+j가 3이 넘어가는 부분부터만 *을 출력하면 된다(일단 if 없이 까지 찍어보고)
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }//if
            }//inner
            System.out.println();
        }//outer
    }
}
