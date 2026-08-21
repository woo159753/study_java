package ex8_work;

import java.util.Random;

public class WorkSub {
    
    public int rndCreate(){
        return (new Random().nextInt(500) + 1)*10;
        
    }//rndCreate

    public void cal(int rnd,int[] coin){
        System.out.println("금액 : " + rnd);
        for(int i = 0; i < coin.length; i++){
            int res = rnd / coin[i];
            if( res > 0){
                System.out.printf("%d원 : %d개\n",coin[i],res);
            }//if
            rnd %= coin[i];//기억하자!
        }//for  
    }//cal
}
