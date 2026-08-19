package ex_work;//페키지 ex_work 안에 있는 파일이라는 뜻

import java.util.Scanner;
//import=가져와서 쓴다 java에 .=접근해서 util에 .=접근해서 Scanner(class)의 내용을
import java.util.Random;
//import=가져와서 쓴다 java에 .=접근해서 util에 .=접근해서 Random(class)의 내용을

public class Ex1_baseball {
//public=접근제어자(어디서든 접근가능하다는 의미) class Ex1_baseball를 선언한다?
    public static void main(String[] args){
    //public=접근제어자(어디서든 접근 가능하다는 의미)
    //static=정적이다 -> 객체를 생성하지 않아도 메서드를 사용할 수 있다는 의미
    //                  main은 코드의 시작점이기 때문에 객체를 생성하지 않아도 시작할수 있어야함
    //void=반환값이 없음을 의미
    //main=class코드의 시작점
    //(String[] args)=코드가 실행될 때 전달될 문자열(인수로 받는다)


        Scanner sc = new Scanner(System.in);
        //Scanner(class)의 객체 sc(참조변수)를 new(생성한다) 
        // Scanner class에 (System.in)을 인수로 보내서
        //System.in System이라는 class에 in이라는 필드가 있단다
        Random rnd = new Random();
        //Random class로 rnd 객체를 생성한다

        int[] com = new int[3];
        //rnd객체로 생성될 숫자를 받을 배열 생성하기

        //int(자료형) [] 배열 com을 선언하고
        // = new 생성한다 int(정수타입 자료형) [3]=배열을 3개
        //배열과 객체는 heap메모리에 생성된다 

        int[] user = new int[3];
        //내가 입력할 숫자를 배열로 선언한다
        //(배열 vs 배열)이 for문으로 비교하기 편하기 때문

        outer : for( int i = 0; i < com.length; ){
            //rnd객체를 이용하여 com배열에 1~9까지의 
            // 랜덤한 숫자를 겹쳐지지 않게 대입하는 for문

            com[i] = rnd.nextInt(9) + 1;
            //for문 돌리면서 순차적으로 com배열에 숫자를 대입한다
            for(int j = 0; j < i; j++){
                if(com[i] == com[j]){
                    continue outer;
                }//if
                //for문을 돌리다가 if(이전에 만들었던 배열과 지금 생성한 배열이 같은값이 나올경우)
                //밑에 있는 for문에 i 값을 증가시키지 않고 다시 바깥 for(lable:outer)문을 continue
                //증감식이 없으므로(밑에 빼놧음) i값을 증가시키지 않고(다시 만들기) 같은 i값의 인덱스의
                //배열에 rnd객체로 랜덤한 숫자를 대입한다

                //이과정을 계속 거치고 생성된 com배열의 값은 중복되지 않는다
            }//inner
            i++;
        }//outer

        System.out.println("정답 : " + com[0] + com[1] + com[2]);
        //중간점검으로 생성된 com배열 출력 -> 코드가 잘못되지 않은것을 확인하고
        //나중에 Strike와 Ball값이 잘 나오는지 확인할 수 있다


        int cnt = 0;//몇번만에 숫자를 맞췃는지 알기위한 cnt는 반복문 밖에 선언
        while(true){
            //게임 하는 동안에 돌아갈 반복문
            //필요한 기능들
            //1.계속해서 숫자를 입력받기
            //2.for문을 통해 배열을 비교하며 
            // Strike와 Ball을 알려주고 초기화 
            // if문을 통해 조건에 맞을 때마다 증가
            //3.결과 출력


            cnt++;//게임이 한바퀴 돌때마다 게임카운트 cnt가 하나씩 증가

            System.out.print("입력(예:123) : ");
            //입력받기 전에 알려줄 "입력 :"" 을 System 에 .접근 
            // out(필드?) .접근 print()메서드를통해 출력
            int number = sc.nextInt();
            //number이라는 변수에 내가 맞추는 수를 sc객체에 nextInt()메서드를 통해 대입
            user[0] = number / 100;
            //내가 맞추는 100의자리 숫자를 100으로 나눈 몫으로 값을 구해서
            //user[0]에 대입
            user[1] = number / 10 % 10;
            //10자리 수는 10으로 나눈 몫을 구하고 그 수를 다시 10으로 나눈 나머지이다
            //이를user[1]에 대입
            user[2] = number % 10;
            //1의 자리 수는 10으로 나눈 나머지다
            //이를user[2]에 대입

            //배열이 커지면 for문으로 대입 하면 될거같다

            int strike = 0;
            int ball = 0;
            //반복문 돌때마다 초기화 되는Strike와 Ball선언하기

            for(int i = 0; i < user.length; i++){
                //2중 for문으로 두 배열 비교하기
                for(int j = 0; j <user.length; j++){
                //com[i]값동안 반복문의 j값이 0부터 끝까지 돌면서 확인
                    if( i == j ){
                        if( com[i] == user[j] )
                            strike++;
                        //자리가 같은데 값까지 같으면 Strike하나 늘리기
                    }else{
                        if( com[i] == user[j] )
                            ball++;
                        //자리가 다른데 값이 같으면 Ball하나 늘리기
                    }
                }//inner
            }//outer
            if( strike == 3 ){
                System.out.println("정답!! - " + com[0] + com[1] + com[2]);
                System.out.println(cnt + "회 클리어");
                break;
            //3Strike -> 정답일 때 결과 출력하고 반복문 나가기
            }else{

                if( strike > 0 || ball > 0 ){
                    System.out.printf("%d Strike, %d Ball\n", strike, ball);
                }else{
                    System.out.println("OUT");
                }
            }//정답이 아닐 때 결과 출력하기
        }//while
        //반복문이 끝나면 게임 끝
    }//main
}
