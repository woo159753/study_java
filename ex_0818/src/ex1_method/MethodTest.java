package ex1_method;

public class MethodTest {
    
    public void test1(){
        System.out.println("test1 메서드 호출");
    }
    public int test2( int n ){
        n += 100;
        System.out.println("결과 : " + n);

        return n;
        //나를 호출한 곳으로 return값을 딱 한개만 가지고 돌아간다
        //+다시 메인메서드로 값을 보내는 방법은 거의  return이 유일하고
        //  반환값은 한개이다.
        //return 밑에 있는 코드는 실행이 불가하기 때문에 오류가 난다.
    }
}
