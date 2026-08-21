package ex04_work;

public class Vending {
    //다른 클래스에서 메서드를 호출하면 메서드 {}안의 내용만 실행되는 것임을 인지하자

    //자판기 역할
    private Can[] cans = new Can[5];
    //이런 형태로 코드를 생각 할 수 있어야됨 이게 가장 중요!
    //(실제 역할분담이랑 비슷하게 그래야 가독성과 유지보수를 높일수 있으니까)
    //자판기 안에서 관리되고있는 cans객체는 접근 맘대로 x
    private int money;
    //돈도 맘대로 가져가면 안되니까 마찬가지

    //자판기에서 관리할 음료수 준비

    public Vending(){
        cans[0] = new Can("환타",1000);
        cans[1] = new Can("콜라",1100);
        cans[2] = new Can("사이다",1200);
        cans[3] = new Can("몬스터",1300);
        cans[4] = new Can("맥콜",1400);
    }
    /*
    public void init(){

        for( int i = 0; i < cans.length; i++ ){
            cans[i] = new Can();
        }//for -> 객체 배열 인덱스당 객체의 메모리 할당
        cans[0].setName("환타");
        cans[0].setPrice(1000);

        cans[1].setName("사이다");
        cans[1].setPrice(1200);

        cans[2].setName("핫식스");
        cans[2].setPrice(1300);

        cans[3].setName("콜라");
        cans[3].setPrice(1400);

        cans[4].setName("오랜지");
        cans[4].setPrice(1500);
    }//init()
    */

    //사용자의 돈을 받는다 
    //이 돈으로 먹을수 있는 음료 목록만 보여주기
    public void showDrink( int money ){

        for(int i = 0; i < cans.length; i++){
            if(cans[i].getPrice() <= money){
                System.out.printf(
                    "%s - %d원\n",
                    cans[i].getName(),cans[i].getPrice());
            }//if
        }//for

        this.money = money;
        
        System.out.print(">> ");

    }//showDrink

    //사용자가 음료수를 선택하면
    //해당 음료수를 제공하고 잔돈을 돌려준다
    public void dispense( String name ){
        for(int i = 0; i < cans.length; i++){
            if(cans[i].getName().equals( name )){
                System.out.println(name + "을(를) 선택함");
                money -= cans[i].getPrice();//잔돈계산

                System.out.println("잔액 : " + money);
            }//if
        }//for
    }//dispense
    
}
