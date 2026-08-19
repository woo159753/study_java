package ex4_work;

import java.util.Scanner;

public class Word {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("입력");
        String str = sc.next();

        CheckWord cw = new CheckWord();
        //CheckWord 클래스가 메모리 할당이 되어 있어야 사용할 수 있다.
        String rev = cw.check( str );
        //원본을 다른 sub클래스로 보내서 
        // 다른 클래스에서 뒤집어서 반환

        if(str.equals(rev)){
            System.out.println(str + "은 회문");
        }else{
            System.out.println(str + "은 안회문");
        }
    }//for
}
