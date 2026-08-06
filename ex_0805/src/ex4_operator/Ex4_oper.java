package ex4_operator;

//페키지의 영역
public class Ex4_oper {
    // 클래스의 영역
    public static void main(String[] args) {
        // main메서드의 영역
        //art + shift + f 로 선택한 영역 정렬 가능
        
        //증감연산자
        //1씩 증가시키거나 1씩 감소시키는 연산자
        //선행증감과 후행증감의 차이를 알고 있다
        int a = 10;
        System.out.println("a : " + ++a);
        //선행증감자는 ()만큼 연산순위가 우위이다
        //system class에 접근하기도 전에 a가 증가한다
        int b = 10;
        System.out.println("b : " + b++);
        //;보다도 늦게 연산한다
        System.out.println(b);

        b++;
        ++b;
        --b;
        b--;
        --b;
        b++;
        --b;
        b++;
        System.out.println(++b);
    }
}
