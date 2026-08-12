package ex3_break;

public class Ex1_break {
    
    public static void main(String[] args) {
        
        //break : 반목문 내에서 강제적으로 (분기문에서 사용하는건 굉장히 예외적인 것이다)
        //가장 가까운 반복문을 빠져나갈 때 사용

        //중요 단어 -> 강제적, 가장 까까운 반복문

        for(int i = 1; i <= 3; i++){

            for(int j = 1; j <= 10; j++){

                if(j % 2 == 0){
                    break;//break 바로 밑에 코드 작성시 오류발생
                }
                System.out.print(j+ " ");
            }//inner
            System.out.println();
        }//outer

    }
}
