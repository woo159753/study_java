package ex03_work;

import java.util.Scanner;

public class Account {
    public static void main(String[] args) {
        /*
        (공백은 tab키이다)
        1.입    금
        2.출    금
        3.잔액확인
        ect.종  료
        >> 1
        ---입   금---
        입금액 : 1000
        입금성공
        ------------
        다시 메뉴를 보여준다
        >> 3
        ---잔액확인---
        1000원
        ------------
        다시 메뉴를 보여준다
        >> 4
        atm 사용을 종료합니다
         */

        //강사님은 반복문안에 return을 써서 main을 강제종료 했다.
        //강사님은 main에 swich-case문을 넣어서 해결했다
        //또한 Atm class에서 메서드를 각각 입금, 출금등으로 나누어 작성
        //그냥 main에 적게 쓰는것도 중요하지만 가독성과 유지보수 측면을 생각해야한다
        Scanner sc = new Scanner(System.in);
        Atm atm = new Atm();
        boolean bool = true;
        while(bool){

            System.out.printf(
                "1.입\t금\n2.출\t금\n3.잔액확인\nect.종\t료\n>> ");
            String type = sc.next();

            bool = atm.op(type);
        }


    }//main
}
