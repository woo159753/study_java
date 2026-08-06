package ex4_operator;

public class Ex5_oper {
    public static void main(String[] args){

        //삼항(조건)연산자 -> 하나의 조건식을 통해 발생하는 결과를
        //원하는 타입으로 반환할 수 있도록 하는 연산자
        int a = 10;
        int b = 15;
        int res = ++a >= b ? 100 : 200;//true : 100 (앞) , false : 200 (뒤)
        //비교연산자가 들어가 있는 것은 조건식이라고 부른다
        //삼항 연산자 뒤의 값은 자료형 타입이 무조건 같아야한다
        System.out.println("res : " + res);
        int n1 = 10;
        int n2 = 20;
        float res2 = (n1 += n1) == n2 ? 3.14F : 5.19F;
        System.out.println("res2 : " + res2);
        a = 10;
        b = 12;
        char res3 = ++a >= b || (a - 8) + 7 <= b && 13 - b >= 0 && 
                    (a+=b) - (a%b) > 10 ? '0' : 'x';
        //char res = (거짓 || 참 && 참 && 참) ? '0' : 'x' -> char res = '0'
        //식에 증감,대입 연산자가 있을경우 항상 변수 값이 변한다는 것을 생각하기
        //증감,대입 연산자는 비교연산자가 있을경우 처리 순서가 비교연산을 기준으로 나뉜다
        System.out.println("res3 : " + res3);
    }//main
}//class end
