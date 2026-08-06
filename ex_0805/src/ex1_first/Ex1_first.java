package ex1_first;

public class Ex1_first {
    //main 메서드 : 프로그램의 시작점 aaaaaa
    //String[] args : 메서드의 매개변수
    //args : arguments의 약자
    //String : 문자열을 저장하는 자료형
    //[] : 배열을 나타내는 기호
    //public : 접근제어자
    //static : 정적 메서드
    //void : 반환값이 없음을 나타내는 키워드
    //main : 메서드의 이름
    //System.out.println : 콘솔에 문자열을 출력하는 메서드
    public static void main(String[] args) {
        //주석 : 컴파일시에 ivm이 인식하지 못하는
        //개발자들간의 소통을 위한 코드
        System.out.println("Hello World");
        System.out.println(1+1);//System의 S가 대문자니까 class라고 추측가능.(out은 method라고 추측가능.)
        System.out.println("1 + 1 = " + 1 + 1);//문자열이 먼저 나와서 뒤에"1+1"이 숫자로 인식되지 않고 문자열로 인식됨.
        System.out.println("1+1="+(1+1));
        System.out.println(1+1+"=1+1");
        System.out.println(1 + 1 + "안녕" + 1 + 1);
    }
}
