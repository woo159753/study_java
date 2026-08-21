package ex04_work;

import java.util.Scanner;

public class Vmain {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("금액 : ");
        int money = sc.nextInt();

        Vending ven = new Vending();
        //ven.init();
        //먼저 처리를 해야댐

        ven.showDrink(money);
        String name = sc.next();
        ven.dispense(name);


    }//main
}
