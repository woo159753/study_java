package ex07_work;

import java.util.Random;

public class Graph {
    public static void main(String[] args){

        //0 ~ 9사이의 난수를 100개씩 발생시키고
        //각 숫자가 몇개씩 만들어졌는지 그래프화 하시오
        //---------------------------
        //0의 갯수 : ############ 12
        //1의 갯수 : ####### 7
        //  ...
        //9의 갯수 : ########## 10

        int[] ranArr = new int[100];
        int[] numCount = new int[10];

        GraphSub gs = new GraphSub();
        
        gs.genNum(ranArr);
        //얕은복사를 이용

        /*
        for(int i = 0; i < ranArr.length; i++){
            System.out.println(ranArr[i]);
        }//for
        */

        numCount = gs.testRandom(ranArr);
        //이것도 얕은 복사를 이용
        //주소값 복사를 이용했다

        /*
        for(int i = 0; i < numCount.length; i++){
            System.out.println(numCount[i]);
        }
        */

        gs.infoRandom(numCount);
        /*
        //--------------------------------------
        //강사님 풀이
        
        new Random().nextInt();
        //익명클래스
        int[] arr = new int[10];

        for(int i = 0; i < 100; i++){
            int r = new Random().nextInt(10);
            arr[r]++;
        }//for
        //익명클래스 반복문에서 일어나는일 Random() 메모리할당 되고 
        // 다음 반복문에서 heap메모리에서 gc가 수거해간다
        //2번정도면 메모리 할당된게 사라지니까 좋다 반복문 끝나면 익명클래스의 메모리가 없어지니까
        //근데 100번 돌아가는 과정이 메모리를 쓸대없이 많이 사용함 -> 컴퓨터 입장에서 생각하기

        gs.print(arr);
        */
    }//main
}
