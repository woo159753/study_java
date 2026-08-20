package ex7_work;

import java.util.Scanner;
import java.util.Random;

public class UpdownMain {
    public static void main(String[] args){

        //1 ~ 50 사이의 난수를 발생시키고
        //키보드에서 입력받은 정수를 난수와 비교하기
        //-------------------------------
        //정수 : 30
        //DOWN
        //정수 : 15
        //UP
        //정수 : 25
        //3회만에 정답

        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        UpdownSub uds = new UpdownSub();

        int ans = rnd.nextInt(50) + 1;
        boolean bool = true;
        
        while(bool){

            System.out.print("정수 : ");
            int inputNum = sc.nextInt();

            //UpdownSub uds = new UpdownSub();
            //객체가 계속 새로 만들어지고 있어서 cnt값이 계속 증가가 안됏던 거였어
            //근데 어떻게 같은 이름으로 계속 만들지?
            //참조변수인 uds가 지역변수이기 때문에 반복문을 한번돌면 생명을 다함
            //그래서 같은 이름으로 새로 계속 만들수 있는거다
            //(첫번째 uds와 두번째 uds는 다르니까)
            //+반복문을 돌면서 만들어진 객체는 알아서 없어지는게 아니기 때문에
            //GC가 메모리를 해제 시켜준다
            bool = uds.upDown(ans,inputNum);
        }//while
    }//main
}
