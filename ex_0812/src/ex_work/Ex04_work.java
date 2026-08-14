package ex_work;

import java.util.Scanner;
//import java.util.Random;

public class Ex04_work {
    public static void main(String[] args) {
        
        /*
        배열의 크기를 입력하세요 : 5
        정수1 : 6
        정수2 : 7
        정수3 : 11
        정수4 : 20
        정수5 : 31
        ----------------------------
        홀수 개수 : 3
        짝수 개수 : 2
         */
        //Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 크기를 입력하세요 :");
        int arrSize = sc.nextInt();

        int[] arr = new int[arrSize];

        for(int i = 0; i < arrSize; i++){
            //arr[i] = rnd.nextInt(100)+ 0;
            System.out.printf("정수 %d : ", i + 1);
            arr[i] = sc.nextInt();
        }
        int oddCount = 0;
        int evenCount = 0;

        for(int i = 0; i < arrSize; i++){//이부분은 배여을 만들면서 판단해도 됨!
            if(arr[i] % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }
        System.out.println("홀수의 개수 : " + oddCount);
        System.out.println("짝수의 개수 : " + evenCount);
        /*
        for(int n : arr){
            System.out.println(n);
        }
        */
    //특정 페턴을 가진 배열생성을 for문을 통해 할수 있다*
    }//main
}
