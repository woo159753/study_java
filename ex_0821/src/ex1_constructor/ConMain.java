package ex1_constructor;

public class ConMain {
    public static void main(String[] args){
        
        ConSub cs = new ConSub();
        //대입기호 앞의 ConSub은 sc의 객체 타입(참조변수 자료형)
        // 이며 뒤의 ConSub이 생성자이다
        //new는 heap에 빈자리가 있는지 찾는 명령어이다
        //ConSub()이 생성자다
        //원래는 가려져 있다(맨날 쓰는거니까)
        //딱한번 호출이 가능하지만 다시 호출할 수 없다
        //ex) cs.ConSub() -> x
        //+생성자도 오버로딩이 가능하다

        //생성자 :
        //객체가 생성될 때 메모리 할당을 위해 딱 한번 반드시 호출되는 것

        ConSub[] sc = new ConSub[2];

        sc[0] = new ConSub();
        sc[1] = new ConSub();
    }//main
    
}
