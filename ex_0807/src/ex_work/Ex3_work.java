package ex_work;

import java.util.Random;

public class Ex3_work {
    public static void main(String[] args){

        // A ~ Z사이의 값중 하나를 랜덤으로 출력
        //int ranCharNum= new Random().nextInt( 90 - 65 + 1 ) + 65;
        int ranCharNum= new Random().nextInt( 'Z' - 'A' + 1 ) + 'A'; 
        // 'A'는 65로 알아서 바뀌어서 들어간다

        System.out.println( (char)ranCharNum );

        char ch = (char)ranCharNum;//ch를 계속 쓰는게 아니면 저장공간을 따로 또 만드는 것은 낭비
        System.out.println("A ~ Z사이의 값중 하나를 랜덤으로 출력 : " + ch);


    }
}
