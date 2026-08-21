package ex6_work;

public class WorkMain {
    public static void main(String[] args) {
        
        //정수 : 9
        //9은(는) 소수가 아닙니다

        //정수 : 7
        //7은(는) 소수입니다
        WorkSub ws = new WorkSub();

        System.out.print("정수 : ");
        int Number = ws.scan();

        ws.infoNumber(Number);
    }
}
