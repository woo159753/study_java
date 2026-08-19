package computer;

public class ComMain {
    
    public static void main(String[] args){

        Computer c1 = new Computer();
        //c1참조변수는 스택에 저장되어 있음
        //생성된 객체와 객체의 데이터는 힙메모리에 저장되어 있음
        c1.ssd = 1024;
        // .은 접근한다는 뜻이기 때문에 접근제어자와 관계있음
        c1.cpu = 3.5f;
        c1.color = "black";
        //private 변수 brand로는 접근이 불가
        //c1.brand = "apple";
        c1.info();
    
        Computer c2 = new Computer();
        c2.info();



    }//main
}
