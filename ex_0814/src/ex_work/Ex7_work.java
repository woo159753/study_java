package ex_work;

import java.util.Scanner;

public class Ex7_work {
    public static void main(String[] args){

        //키보드에서 아무값이나 입력받고
        //숫자인지 아닌지 판단하기
        //-------------------------
        //값 : 123 (next()로 받기)
        //123은 숫자입니까? true

        //값 : a12
        //a12은(는) 숫자입니까? false

        Scanner sc = new Scanner(System.in);
        System.out.print("값 : ");
        String str = sc.next();
        char ch = '0';
        boolean bool = true;


        out : for(int i = 0; i < str.length(); i++){
            for(int j = 0; j < 10; j++){
                if( str.indexOf(i) == ch ){
                    continue out;
                }//if
                if(j == 9){
                    bool = false;
                    break out;
                }
                ch++;
            }//inner
        }
        if(bool){
            System.out.println(str + "은(는) 숫자입니까? true");
        }else{
            System.out.println(str + "은(는) 숫자입니까? false");
        }

        //--------------------------------------

        int i1 = 0;//밖에 빼서 선언가능
        for( ; i1 < str.length(); i1++){

            char ch1 = str.charAt(i1);

            if( ch1 < '0' || ch1 > '9'){
                break;
            }
        }
        
        if( i1 == str.length()){
            System.out.println(str + "은(는) 숫자입니까? true");
        }else{
            System.out.println(str + "은(는) 숫자입니까? false");
        }

    }//main
}
