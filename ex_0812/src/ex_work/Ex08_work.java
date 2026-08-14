package ex_work;

import java.util.Random;

public class Ex08_work {
    
    public static void main(String[] args){

        //변수 money의 10 ~ 5000 사이의 난수를 발생시킨다
        //단, 발생한 난수 money는 1의 자리가 반드시 0이 되도록 한다
        //money를 최소한의 동전으로 몇 개씩 거슬러 지는지 출력
        //--------------------------------------
        //금액 : 2590
        //500원 : 5개
        //50원 : 1개
        //10원 : 4개

        //if 여러번 쓸수도 있지만 코드 유지보수 측면에서 좋지 않음
        int[] coin = { 500, 100, 50, 10 };//정렬을 배웠기 때문에 정렬을 해서 쓸 수도 있다(정렬이 안되어 있을경우)
        Random random = new Random();
        int money = 10 * (random.nextInt(500) + 1);
        System.out.println("금액 : " + money);
        //중간에 코드를 완성했을 때 잘 되나 찍어보는 것도 중요함
        //검사 할 수 있을 때 안하고 길어지면 어디서 잘못되었는지 찾기 힘듬
        
        for(int i = 0; i < coin.length; i++){

            int res = money / coin[i];//이 부분이 중요하다고 강조하심!
            if(res != 0){
                System.out.printf(
                    "%d원 : %d개\n",coin[i],res);
                money -= res * coin[i];//강사님은 money %= coin[i] 로 처리 했다
            }
        }
        //동전개수 출력하는 문제 : 반복문을 통해 변수를 /,%로 변화시키면서 활용로직*
    }//main
}//class
