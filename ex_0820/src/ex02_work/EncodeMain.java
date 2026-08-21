package ex02_work;

import java.util.Scanner;

public class EncodeMain {
    public static void main(String[] args){

        //입력 : abc123
        //결과 : `~!wer

        //강사님은 배열 두개도 sub하나에 몰아넣고 for문을 sub에서돌리고 마지막에 암호화 코드 반환
        // (나는 거의 main에서 작성함..)
        //StringBuffer을 이용해서 할 수 있다.
        //append메서드를 활용해서
        //코드 처음부터 다시 짜보기
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        String ps = sc.next();
        EnAlpha enAlpha = new EnAlpha();
        EnNum  enNum = new EnNum();
        String res = "";

        for(int i = 0; i < ps.length(); i++){
            char ch = ps.charAt(i);
            if( ch >= 'a' && ch <= 'z' ){
                res += enAlpha.resAlpha(ch - 'a');
            }else if( ch >= '0' && ch <= '9'){
                res += enNum.resNum(ch - '0');
            }
        }
        System.out.println("결과 : " + res.toString());


    }//main
}
