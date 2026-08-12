package ex4_continue;

public class Ex2_continue {
    public static void main(String[] args){
        for( int i = 1; i <= 5; i++ ){

            switch( i ){
                case 1:
                    System.out.println("case 1");
                    break;
                case 2:
                    System.out.println("case 2");
                    continue;

            }
            System.out.println("결과 : " + i);

        }//for
        //코드 진행이 어떤 식으로 되는지 잘 파악해야함
    }//main
}
