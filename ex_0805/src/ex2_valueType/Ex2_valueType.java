package ex2_valueType;

public class Ex2_valueType {
    public static void main(String[] args) {
        //문자형 : 홑따움표 안에 딱 한글자만 저장할 수 있는 자료형
        char ch = 'A';
        char b = 'B'; // 다른클래스에 b라는 변수가 있어도 클래스가 다르면 클래스 내의 변수는 이름이 같아도 됨
        char ch2 = 65 + 1;
        System.out.println("ch : " + ch);
        System.out.println("B : " + b);
        System.out.println("ch2 : " + ch2);

       /*  for (char i = 32; i < 127; i++){
            System.out.println(i);
        } -> 아스키 코드 문자열중에 출력 가능한 문자들을 출력
        */ 
        //실수형 : 소수점을 포함하는 값을 저장하기 위한 자료형
        float f1 = 100;
        f1 = 3.14F; // 실수타입의 기본형이 double이기 때문에 값뒤에 F를 넣어 표시해야한다

        double d1 = 3.14;
        
        System.out.println("f1 : " + f1);
        System.out.println("d1 : " + d1);
    }
}
