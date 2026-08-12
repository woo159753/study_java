package ex1_multi_for;

public class Ex10_multiFor {
    public static void main(String[] args) {
        
        /*

        1 3 5 7 9
        3 5 7 9 1
        5 7 9 1 3
        7 9 1 3 5
        9 1 3 5 7

        */
        //for(int i = 1; i < 10; i += 2) 강사님 방법
        //강사님이 하신 두번째 방법 = 내 방법 -> 가독성이 더 좋다
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                //int num = i + 2 * j;
                int num = 1 + (2 * i) + (2 * j);
                if (num > 10){
                    num -= 10;
                }
                System.out.print(num + " ");
            }//inner
            System.out.println();
        }//outer
        System.out.println("-------------------------");
        //강사님이 하신 첫번째 방법
        for(int i = 1; i < 10; i += 2){
            for(int j = 0; j < 10; j += 2){
                int num = i + j;
                if(num > 10)
                    num -= 10;
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}