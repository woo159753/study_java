package ex2_random;

import java.util.Random;

public class Ex1_ramdom {
    public static void main(String[] args) {
        // 216 ~ 1378 사이의 난수
        // new Random().nextInt( 난수의 개수 ) + 시작 수;
        //난수의 개수 = 큰수 - 작은수 + 1
        int num = new Random().nextInt( 1378 - 216 + 1 ) + 216;

        System.out.println( num );

        // 2 ~ 9 사이의 난수에 해당하는 구구단을 출력해보시오

        int dan = new Random().nextInt( 9 - 2 + 1 ) + 2;
        System.out.println("난수" + dan + "단의 구구단은 :");
        for(int mult = 1; mult <= 9; mult++){
            System.out.println(dan + "*" + mult + "=" + (dan * mult));
        }
        //난수로 a~z 또는 A~Z까지 생성하여 프린트하는 class만들기

        int dif = 'a' - 'A';
        //int alphabet = new Random().nextInt( 'Z' - 'A' + 1 ) + 'A';
        Random ran = new Random();
        int alpha = ran.nextInt('Z' - 'A' + 1) + 'A';   
        int bool = new Random().nextInt( 2 ) + 0;

        if (bool == 0){
            System.out.println((char)alpha);
        }else{
            System.out.println((char)(alpha + dif));
        }
        //int bool = new Random().nextInt(2)+0과
        //Random random = new Random;
        //bool = random.nextInt(2)+0;
        //은 같은 의미이다


        //. 은 객체가 가지고 있는걸 사용한다는 의미이다 -> .은 왼쪽에 있는 대상이 가지고있는 member에 접근한다
        //따라서 new Random().nextInt() 의 의미는
        //new random()으로 생성한 객체의 매서드 nextInt()를 사용한다는 의미이다
        //생성하고 생성된 객체의 매서드를 쓰는구조
    }
}
