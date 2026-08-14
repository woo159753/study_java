package ex1_array;

public class Ex3_array {
    public static void main(String[] args){

        //선언 + 생성
        char[] ch = new char[4];
        //초기화
        ch[0] = 'J';
        ch[1] = 'A';
        ch[2] = 'V';
        ch[3] = 'A';
        for (int n = 0; n < ch.length; n++){
            System.out.print(ch[n]);//그냥 ch = "JAVA"(문자열)이다
        }
        System.out.println();
        System.out.println("----------------------");

        char[] ch2 = {'j','a','v','a'};
        //ch2 = {'J','A','V','A'}; 이렇게 넣으려면 선언과 동시에 해야함
        //heap메모리에 크기가 할당이 안되어 있어서? -> 배열을 생성하는 문법의 문제

        for(int i = 0; i < ch2.length; i++){
            System.out.println(ch2[i]);
        }
    }//main
}
