package ex_work;

import java.util.Scanner;

public class Ex07_work {
    public static void main(String[] args) {
        
        //홀수 : 3
        //08 01 06
        //03 05 07
        //04 09 02
        //----------
        //3행3열짜리 마방진이 화면에 출력되면 된다
        //다음주 금요일날 문제
        Scanner scanner = new Scanner(System.in);
        System.out.print("홀수 : ");
        int arrSize = scanner.nextInt();
        int[][] arr = new int[arrSize][arrSize];

        //0으로 초기화(강사님 처럼 if문을 구성하면 초기화 필요x)
        for(int i = 0; i <arrSize; i++){
            for(int j = 0; j < arrSize; j++){
                arr[i][j] = 0;
            }//inner
        }//outer
        //시작점 정하기 + 행과 열을 관리할 변수 설정(*중요*)
        // (for문 안에 지역변수로는 관리가 너무 힘들다 <- 증감식과 조건식에 연관이 있기 때문)
        int row = arrSize / 2;
        int line = 0;
        int cnt = 1;
        //System.out.println(row); ->확인해서 오류나는 구간 특정
        while( cnt <= arrSize * arrSize ){//다썻으면 나가는 로직

            arr[line][row] = cnt;

            cnt++;

            if(cnt % arrSize != 0){//*배열의 범위를 벗어나지 못하게 하는 로직(배열 관련해서는 굉장히 중요)*
                //이걸 생각하는게 중요한듯
                line--;
                row++;
            }else{
                line++;
            }

            if(line < 0){
                line = arrSize - 1;
            }
            if (line > arrSize - 1){
                //이부분을 생각을 못해서 자꾸 배열 범위 밖으로 나감
                line = 0;
            }
            if(row > arrSize - 1){
                row = 0;
            }
        }//while
        //다썻으면 나가는 로직
        //배열의 범위를 넘어가지 못하게 하는 로직
        //커서가 움직이면서 값을 입력하는 로직

        //출력
        for(int i = 0; i < arrSize; i++){
            for(int j = 0; j < arrSize; j++){
                System.out.printf("%02d ",arr[i][j]);
            }//inner
            System.out.println();
        }//outer
        //강사님 코드가 가독성이 더 좋다(if문 밖에 대입하는게 있어서 보기 편함)

        //*정해진 규칙에 따라 2중 배열에 값을 넣을 수 있다*(중요 로직)

    }//main
}
