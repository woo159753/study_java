package ex11_work;

import java.util.Random;
import java.util.Scanner;

public class WorkSub {

    Random rnd = new Random();
    Scanner sc = new Scanner(System.in);
    
    public int rndBox(int len){
        return rnd.nextInt(len);
    }//rndBox()

    public String rndBox(String str){
        int[] rndNum = new int [str.length()];
        outer : for(int i = 0; i < str.length();){
            rndNum[i] = rnd.nextInt(str.length());
            for(int j = 0; j < i; j++){
                if(rndNum[i] == rndNum[j]){
                    continue outer;
                }//if
            }//inner
            i++;
        }//outer
        
        StringBuffer tmpStr = new StringBuffer();

        for(int i = 0; i < str.length(); i++){

            char tmp = str.charAt(rndNum[i]);
            tmpStr.append(tmp);

        }//for
        return tmpStr.toString();
    }//rndBox()

    public boolean game(String strArr){

        System.out.print(">> ");
        String inputString = sc.next();
        return !inputString.equalsIgnoreCase(strArr);

    }//game()
    

   //아니 원래 단어를 맞춰야지 뭔놈의 rnd단어를 맞추고 있냐
}
