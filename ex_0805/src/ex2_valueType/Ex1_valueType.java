package ex2_valueType;

public class Ex1_valueType {
    public static void main(String[] args) {
        /*
        자바의 기본자료형.(무조건 소문자로만)(일종의 데이터의 그릇개념)
        1bit(2가지 경우의수 0과 1) -> 1byte(8bit 2^8 정보 저장가능)
        논리형:boolean...1bit  -> true, false
        문자형:char......2byte -> 0 ~ 65535
        정수형:
        byte............1byte -> -128 ~ 127
        short...........2byte -> -32768 ~ 32767
        int.............4byte -> -2147483648 ~ 2147483647 대략 -21억~21억 
        long............8byte -> -9223372036854775808 ~ 9223372036854775807 대략 -922경~922경
        실수형:
        float...........4.x byte -> 1.40129846432481707e-45 ~ 3.40282346638528860e+38
        double..........8.x byte -> 4.94065645841246544e-324 ~ 1.79769313486231570e+308
        ===============================================
        문자열형:String...무제한
        배열형:int[], String[]...무제한
        객체형:Object...무제한
        참조형:String, int[], Object...무제한
        *기본형:boolean, char, byte, short, int, long, float, double
        참조형:String, int[], Object...무제한
        ===============================================
        변수: 데이터를 저장하는 공간
        자료형 변수명;(선언) ex)int a;
        변수명 = 값;(대입) ex) a = 10;

        자료형 변수명 = 값;(초기화) ex)int a = 10;

        변수선언 규칙
        1. 숫자로 시작할 수 없다.
        2. _를 제외하고 특수문자를 사용할 수 없다.(공백도 x)
        3. 한글로 변수이름을 짓지 않는다.
        4. 반드시 소문자 알파벳으로 시작하도록 한다.
        */ 
    // 변수 이름을 작성할 때 사용할 수 있는 네이밍 규칙
    // 1. 카멜 표기법(Camel Case) : 첫 단어는 소문자로 시작하고, 그 이후의 단어는 첫 글자를 대문자로 작성한다.
    //    예시) myVariableName, studentScore, maxValue
    // 2. 파스칼 표기법(Pascal Case) : 모든 단어의 첫 글자를 대문자로 작성한다.
    //    예시) MyVariableName, StudentScore, MaxValue
    // 3. 헝가리안 표기법(Hungarian Notation) : 변수의 자료형 또는 용도를 접두어로 붙여서 작성한다.
    //    예시) strName(문자열), nCount(정수형), bChecked(불린형)
    // 4. 스네이크 표기법(Snake Case) : 단어와 단어 사이를 언더바(_)로 구분하며, 모든 문자를 소문자로 작성한다.
    //    예시) my_variable_name, student_score, max_value

        //논리형 : 참과 거짓(true, false)의 두 가지 값만을 저장할 수 있는 자료형
        boolean bChecked; //헝가리안 표기법으로 선언
        bChecked = true; //참 대입
        bChecked = false; //거짓 대입
        //bChecked = 10 <- 자료형 타입이 올바르지 않기 때문에 오류 발생
        System.out.println("bValue : " + bChecked);

        //정수형 : 소수점이 없는 정수값만 저장하는 자료형
        byte b = 127;//자료형과 대입하는 데이터크기가 알맞다
        short s = 32737;
        int n = 5000;
        long lo = 2200000000L;// 기본 정수형이 int이기 때문에 L을 써서 long인걸 알려줘야한다
        System.out.println("b : " + b);
        System.out.println("s : " + s);
        System.out.println("n : " + n);
        System.out.println("lo : " + lo);
    }
}
