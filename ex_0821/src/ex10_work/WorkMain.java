package ex10_work;

import java.util.Scanner;

public class WorkMain {
    public static void main(String[] args){
        //키보드에서 받은 홀수값에 대응하는 마방진 만들기
        //---------------------
        //홀수 : 3
        //08 01 06
        //03 05 07
        //04 09 02

        System.out.print("홀수 : ");
        int num = new Scanner(System.in).nextInt();//익명클래스
        int[][] arr = new int[num][num];

        WorkSub ws = new WorkSub();

        ws.mabang(arr);

    }
}
