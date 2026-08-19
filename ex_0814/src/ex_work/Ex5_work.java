package ex_work;

import java.util.Scanner;

public class Ex5_work {
    public static void main(String[] args){

        //문장 : HelloWorld
        //결과 : Hlool

        Scanner sc = new Scanner(System.in);
        System.out.print("문장 : ");
        String str = sc.next();
        String resString = "";

        for(int i = 0; i < str.length(); i++){//i += 2로하면 밑에 if문이 필요없음
            if(i % 2 == 0){
                resString += str.charAt(i);
            }//if
        }//for
        System.out.println(resString);

    }//main
}
