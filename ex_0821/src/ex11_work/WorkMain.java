package ex11_work;

public class WorkMain {
    public static void main(String[] args) {
        
        //문제 : PEALP (랜덤으로 골라서 랜덤으로 섞기)
        //>> ealpp
        //ealpp오답
        //>> apple
        //apple정답!!

        String[] strArr = {"APPLE", "ORANGE", "HOPE", "VIEW"};

        WorkSub ws = new WorkSub();

        int index = ws.rndBox(strArr.length);
        System.out.println(index);

        String rndStr = ws.rndBox(strArr[index]);
        System.out.println("문제 : " + rndStr);

        boolean bool = true;

        while(bool){

            bool = ws.game(strArr[index]);

        }
        System.out.print(strArr[index] + "정답!!");
    }//main
}
