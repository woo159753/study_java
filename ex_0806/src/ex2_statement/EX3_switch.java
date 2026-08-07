package ex2_statement;

public class EX3_switch {

    public static void main(String[] args) {
        
        char name = '박';

        switch( name ){//비교값

            case '김'://조건값
                System.out.println("1000만");
                break;

            case '이':
                System.out.println("730만");
                break;

            case '박':
                System.out.println("419만");
                break;
            
            default:
                System.out.println("데이터가 없습니다");
                break;
        }//switch
        //break를 의도적으로 빼서 조건값에의해 실행되는 영역을 조정할 수 있다
    }//main
    
}
