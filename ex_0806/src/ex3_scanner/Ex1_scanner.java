package ex3_scanner; // ex3_scanner라는 패키지(폴더)에 속해있음을 의미함

import java.util.Scanner; // java.util 패키지에서 Scanner 클래스를 가져옴(입력 기능 사용 가능)

public class Ex1_scanner { // Ex1_scanner라는 이름의 클래스를 선언(파일 이름과 같음)
    
    public static void main(String[] args) { // 자바 프로그램이 실행될 때 가장 먼저 시작되는 main 메소드(함수)
        
        Scanner sc = new Scanner( System.in ); // Scanner라는 클래스를 이용하여, System.in(키보드를 통해) 입력값을 받을 수 있는 sc라는 이름의 객체 생성
        System.out.print("정수 : "); // 화면에 "정수 :"라는 글자를 출력(입력 안내)
        int n = sc.nextInt(); // sc객체의 nextInt()메서드를 호출하여 사용자가 입력한 정수를 n에 저장
        System.out.println("값 : " + n); // "값 :" + n(입력받은 정수값)을 화면에 출력

        System.out.print("문자열 : "); // 화면에 "문자열 :"라는 글자를 출력(문자열 입력 안내)
        String s = sc.next(); // sc 객체의 next()메서드를 호출하여 사용자가 입력한 문자열을 s라는 변수에 저장
        System.out.println("값 : " + s); // "값 :" + s(입력받은 문자열값)을 화면에 출력
    }//main
}
