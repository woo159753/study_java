package ex03_work;

import java.util.Scanner;

public class Atm {

    //입금

    //출금

    //잔액확인
    //기능 나누기

    Scanner scanner = new Scanner(System.in);
    private int money = 0;
    //private로 선언하면 기능 분리가 더 확실해짐
    //건들일 필요가 없고 건드려서도 안댐(private)
    //건들이긴 해야하는데 위험하거나 중요한 정보여서 보안이 중요함(private + get&set메서드 활용)

    public boolean op(String type){
        switch(type){
            case "1":
                System.out.printf("---입\t금---\n입금액 : ");
                int inp = scanner.nextInt();
                money += inp;
                System.out.printf("입금성공\n------------\n");
                return true;
            case "2":
                System.out.printf("---출\t금---\n출금액 : ");
                int outp = scanner.nextInt();
                money -= outp;
                if(money < 0){
                    System.out.printf(
                        "출금액보다 계좌에 남아있는 돈이 적습니다\n-----------\n");
                        money += outp;
                        return true;
                }
                System.out.printf("출금성공\n------------\n");
                return true;
            case "3":
                System.out.println("---잔액확인---");
                System.out.println(money + "원");
                System.out.println("----------------");
                return true;
            default:
                System.out.println("atm 사용을 종료합니다");
                return false;
        }//switch-case
    }
}
