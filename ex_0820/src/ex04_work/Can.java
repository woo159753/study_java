package ex04_work;

public class Can {

    //자판기 안에서 관리되고 있는can객체(설계도로 찍어내는)
    //vending class에서 관리(자판기도 설계도로 찍어낼수 있을듯)
    private String name;
    private int price;

    public Can(String name, int price){
        //생성자는 void쓰면 안됨(반환형이 존재할 수 없기 때문에 아예 반환형을 void로도 쓰면 안됨)
        this.name = name;
        this.price = price;
    }

    //private변수를 관리하기 위한 메서드
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
 
}
