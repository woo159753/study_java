package ex_work;

public class Ex04_work {
    public static void main(String[] args) {

        //2차원 배열을 이용해 다음의 결과 출력하기
        //---------------------
        //0 1 2 3 
        //1 2 3 4 
        //2 3 4 5 
        //3 4 5 6

        int[][] num = new int[4][4];

        for(int i = 0; i < num.length; i++){
            int cnt = i;
            for(int j = 0; j < num[i].length; j++){

                num[i][j] = cnt;
                System.out.print(num[i][j] + " ");
                cnt++;
            }//inner
            System.out.println();
        }//outer

        
    }//main
}
