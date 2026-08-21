package ex05_overload;

public class OverMain {
    public static void main(String[] args){

        OverSub os = new OverSub();
        os.result();
        os.result(100);
        //메서드 이름은 같은데 호출되는 메서드가 다르다.(파라미터를 다르게 만들어서)
        os.result('A');
        os.result("");
        os.result(1,"a");
        os.result("s", 1);

        System.out.println();//ctlr + spacebar로 메서드 파라미터를 보면 오버로드된 메서드란걸 알 수 있다
    }//main
}
