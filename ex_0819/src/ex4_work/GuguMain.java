package ex4_work;

import java.util.Scanner;

public class GuguMain {
    public static void main(String[] args) {
        
        //단 : 5
        //5단
        //5 x 1 = 5
        //...
        //5 x 9 = 45

        //처음에는 한곳에 코드를 작성하고 
        // 기능 별로 다른 클래스로 옮겨도 된다
        
        Scanner sc = new Scanner(System.in);
        System.out.print("단 : ");
        int dan = sc.nextInt();

        Gugudan gd = new Gugudan();
        //Gugudan이라는 class가 메모리에 할당이 되어있어야 danInfo를 호출 할 수 있다
        gd.danInfo(dan);
    }//main
}
