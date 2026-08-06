package ex4_operator;

public class Ex1_oper {
    public static void main(String[] args){

        //연산자(operater)
        //1.최고 연산자 : . , ()
        //2.증감 연산자 : ++ , --
        //3.산술 연산자 : + , - , * , / , %
        //4.시프트 연산자 : >> , << , >>>
        //5.비교 연산자 : > , < , >= , <= , == , !=
        //6.비트 연산자 : & , |(shift+\) , ^ , ~
        //7.논리 연산자 : && || , !
        //8.삼항(조건) 연산자 : ? , :
        //9.대입 연산자 : = , *= , /= , %= , += , -=

        //1.산술 연산자
        int n1 = 20;
        int n2 = 7;
        int n3 = n1 + n2;
        System.out.println("+연산 : " + n3);

        //나누기 연산자 : 몫
        n3 = n1 / n2;
        System.out.println("/연산 : " + n3);
        //나머지 연산자 : 나머지
        n3 = n1 % n2;
        System.out.println("%연산 : " + n3);

        /*n1 = 40;
        System.out.println(n3); = 6 -> 코드의 진행에 따라 값이 대입되는 
        것이기 때문에 나중에 n1값을 바꾸더라도 n3의 값은 바뀌지 않는다.
        */
       
    }
}
