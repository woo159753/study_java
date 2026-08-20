package ex7_work;

public class UpdownSub {
    //강사님은 private으로 random수를 받았다(set,get도 안만들고 그냥 여기서만 쓰려고)
    //cnt(게임횟수)도 선언
    //boolean반환은 나와 같음
    //최대한 메인에서는 수행을 덜하게 만드는게 편한것 같음(코드가 길어지면 메인이 보기 쉬워야 하기 때문에)
    //do while문을 이용해 반복문을 구성했으며 선언한 boolean변수를 이용해 참거짓 판단
    
    int cnt = 0;

    public boolean upDown(int rnd, int inputNum){
        cnt++;
        if(inputNum > rnd){
            System.out.println("DOWN");
            return true;
        }else if(inputNum < rnd){
            System.out.println("UP");
            return true;
        }else{
            System.out.println(cnt + "회 만에 정답");
            return false;
        }
    }
}
