package ex9_work;

import java.util.Random;

public class WorkSub {
    
    public void lottoGen(int[] lotto){
        Random rnd = new Random();
        //앞의 Random과 뒤의Random의 역할이 다름
        //앞의 Random은 자료형(type) 뒤의 Random은 생성자이다
        for(int i = 0; i < lotto.length; i++){
            lotto[i] = rnd.nextInt(6) + 1;
            for(int j = 0; j < i; j++){
                if(lotto[i] == lotto[j]){
                    i--;
                    break;
                }//if
            }//inner
        }//outer
    }//lottoGen()

    public void info(int[] lotto){
        for(int i = 0; i < lotto.length; i++){
            System.out.print(lotto[i] + " ");
        }//for
    }//info
}
