package ex6_work;

public class Ex3_work {
    public static void main(String[] args){

        //주사위 2개를 던졌을 때
        //합이 5, 6, 7이 되는 경우의 수를 찾아 출력
        //------------------------------------
        //5 : 14  23  32  41
        //6 : 15  24  33  42  51
        //7 : 16  52  43  34  25  61

        for(int i = 5; i <= 7; i++){
            System.out.print(i + " : ");
            for(int j = 1; j <= i - 1; j++){
                System.out.printf("%d%d  ",j,i - j);
            }
            System.out.println();
        }//outer

        String five = "";// = null은 five변수에 저장되는 주소값이 할당이 안되어있는 상태이다
                        //""로 초기화를 한 경우 주소값은 있지만 해당 메모리 공간에 아무것도 없는 상태이다
        String six = "";
        String seven = "";

        for(int i = 1; i <= 6; i++){//첫번째 주사위
            for(int j = 1; j <= 6; j++){
                int res = i + j;

                switch( res ){
                    case 5:
                        five += i + " " + j + "  ";//스트링 타입의 변수에 계속 더하는 건 메모리사용의 관점에서 별로 좋지 않다
                        break;

                    case 6:
                        six += i + " " + j + "  ";
                        break;

                    case 7:
                        seven += i + " " + j + "  ";
                        break;

                }//switch
            }//inner
        }//outer
        System.out.println("5 : " + five);
        System.out.println("6 : " + six);
        System.out.println("7 : " + seven);
    }//main
}
