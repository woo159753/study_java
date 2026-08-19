package ex1_string;

public class Ex2_String {
    public static void main(String[] args){
        String str = "Hong Gil Dong";//암시적 객체생성
        int index = str.length();//*
        //String으로 생성된 객체(참조변수 str)에는 
        // String class에서 지원하는 length를 지원한다
        //leng만 써도 왼쪽 끝에 메서드의 반환형이 써져있다
        //배열의 length는 메서드가 아니라 속성이다
        System.out.println("str의 길이 : " + index);

        index = str.indexOf('o');//ch문자
        //먼저 발견한 값을 반환
        System.out.println("맨 처음 문자 o의 위치 : " + index);

        index = str.indexOf("Gil");
        //문자열 Gil이 시작하는 위치를 알수 있다.'
        System.out.println("문자열 Gil의 위치 : " + index);

        index = str.lastIndexOf('o');
        System.out.println("문자 'o'의 마지막 위치 : " + index);

        char res = str.charAt(6);
        System.out.println("6번째 문자 : " + res);

        String ss = str.substring(1,6);
        System.out.println("잘라낸 문장 : " + ss);

        String apple = "aPple";
        if(apple.equals("apple")){//*
            //apple == "apple" 은 참이지만 이것은 상수(비교할때 만든) 
            // "apple"이 String타입이어서 heap에 생성되고(다른 타입은 Stack에 생성)
            //암시적으로 생성되던중 "apple"이 있어 동일한 주소를 참조하게 된다
            //그래서 주소값이 같아 참인 것이다
            // String
            System.out.println("사과");
        }
        if(apple.equalsIgnoreCase("Apple")){//*
            System.out.println("대소문자 상관없이 사과");
        }

        String password = " 1234  ";
        String pwd2 = password.trim();//*
        //trim()을 통해 문자열 앞 뒤의 의미없는 공백을 제거
        System.out.println(pwd2 + "의 길이 : " + pwd2.length());

        //문자열로 작성된 숫자형태의 데이터를 실제 숫자로 바꿔주는 메서드
        String number = "100";
        int num = Integer.parseInt( number );//*
        //int의 wrapper class의 메서드 호출한것
        System.out.println(num + 1);
        //wrapper
        //기본자료형의 wrapper클래스
        //boolean -> Bollean
        //char -> Character
        //byte -> Byte
        //short -> Short
        //int -> Integer
        //long -> Long
        //float -> Float
        //double -> Double
        
    }//main
}
