package ex2_method;

public class TestMain {
    public static void main(String[] args){

        //문제가 발생했을 때 class를 나뉘어져 있는게 유지 보수가 쉽다
        Test t1 = new Test();
        String res = t1.average(100, 80, 70);
        System.out.println("결과 : " + res);

    }//main
}
