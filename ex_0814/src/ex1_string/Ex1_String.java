package ex1_string;

import java.util.Scanner;

public class Ex1_String {
    public static void main(String[] args){

        //String클래스의 두가지 특징
        //1) 객체 생성방법이 2가지( 암시적, 명시적 )
        //2) 한 번 생성된 문자열의 내용은 변하지 않는다

        String s1 = "abc";
        //String(class)로 만들어진 변수s1은 
        // 객체 "abc"의 주소를 가르는 참조변수이다
        String s2 = "abc";
        //위와 같이 같은 값을 가지고자 할때는 heap메모리에서 같은 값이 있는지 확인하고
        // 같은값이 있으면 s1과 s2는 heap메모리의 객체 "abc"의 주소값을 공유한다
        //->암시적 객체생성
        String s3 = new String("abc");
        //new는 명시적으로 객체를 생성한다는 말이다
        //명시적으로 객체를 생성하면 heap메모리에 같은 값이 있는지 
        // 확인하지 않고 바로 새로운 주소를 할당해 객체를 생성한다.
        String s4 = new String("abc");

        String s5 = new String("kkk");

        if(s5 == "kkk"){
            System.out.println("같은값인가요?");
            //명시적으로 객체를 생성할 경우 암시적으로 생성한 상수 "kkk"와 주소가 다르다
        }

        if(s1 == s3){
        //System.out.print()로 뽑으면 그 주소로 접근해서 출력하라는 것이어서 같은데 
        //주소값만 비교하면 다르다(객체들 끼리의 비교는 주소를 비교한다)
        //"=="은 객체간 비교에서는 주소값을 비교한다
            System.out.println("주소가 같습니다");
        }else{
            System.out.println("주소가 다릅니다");
        }
        //String 클래스의 불변의 법칙
        //이미 생성된 배열의 크기는 중간에 변경할 수 없다는 것 ->아니란다
        String greet = "안녕";
        greet += "하세요";
        //"안녕"이라는 객체 주소를 버리고
        // (객체가 자기 자신의 주소를 참조하는 변수가 없을경우 
        // 쓰레기가 되는데 그 쓰레기들을 garbage collertor가 제거한다)
        //"안녕하세요"객체를 만들고 그 주소를 대입한다
        System.out.println(greet);

        Scanner sc = new Scanner(System.in);
        System.out.print("연산자 : ");
        String op = sc.next();

        if(op.equals("+")){
            //상수나 문자등("+")은(는) heap에 따로 메모리에 할당되어있다.
            System.out.println("+연산 할게요");
        }
        // -> 비교할 값같은 것도 heap에 만들어진다.
        String string = "aaa";
        if(string == "aaa"){
            //여기에 생성된 비교 해야하는 값 "aaa"도 
            // 힙메모리에 암시적으로 형성되기 때문에
            //string과 주소가 같다
            System.out.println("aaa");
        }

    }//main
}