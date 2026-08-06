package ex4_operator;

public class Ex3_oper {

    public static void main(String[] args) {
    //논리 연산자 - 비교연산자를 통한 연산이 2개 이상일때 연결해주는 연산자
    int age = 30;
    int limit = 35;
    //&&(and)연산자 -> true && true = true(참)
    //true && false = false
    //false && true = false
    //false && false = false
    boolean res = (limit - age) > 5 && (age += 2) > 30; 
    //앞에가 거짓이면 && 뒤에 코드를 실행 안함
    System.out.println("&& 연산 : " + res);
    System.out.println("age : " + age);

    //||(or) 연산자
    int i1 = 10;
    int i2 = 20;
    boolean res1 = (i1 += 10) >= 20 || (i2 -= 10) == 11; 
    //">" 는 무조건 "크다"라고 읽기 나중에 gt(grater than으로 바꾼다)
    //비교연산자의 값 중 하나만 참이어도 참
    //먼저 진행되는 비교 연산자의 값이 참이기 때문에 후에 진행되는 연산을 하지 않음
    // -> 일종의 조건문 처럼 사용 가능
    System.out.println("res1 : " + res1);
    System.out.println("i2 : " + i2);

    //! -> not연산자
    //참을 거짓으로, 거짓을 참으로 변경하는 연산자
    System.out.println("!연산 : " + !res1);
    System.out.println(res1);//값이 대입되는 것이 아니다
    System.out.println(res1 = !res1);// -> 대입하는 방법
    }
}
