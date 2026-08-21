package ex5_static;

public class BankMain {
    public static void main(String[] args){

        Bank b1 = new Bank( "신촌점", "02-111-1111" );
        Bank b2 = new Bank("강남점","02-222-2222");
        Bank b3 = new Bank("역삼점","02-333-3333");
        
        //static은 클래스명. 형식으로 접근가능하다
        Bank.interest = 0.1f;// == b1.interest = 0.1f;
        //클래스 이름으로 접근하는게 권장사항(private로 만들지 않는다)
        //왜냐하면 객체.으로 접근하면 스태틱 변수라고 한번에 알아볼 수 없는데
        //클래스명으로 접근하면 그 변수가 한번에 static변수인지 알 수 있다
        //interest가 static변수여서 한번에 바꿀수 있다

        b1.info();
        b2.info();
        b3.info();

    }//main
}
