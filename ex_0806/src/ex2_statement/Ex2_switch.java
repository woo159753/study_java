package ex2_statement;

public class Ex2_switch {

    public static void main(String[] args){
        
        String str = "A";
        String res = "";

        switch( str ){
            //비교값과 조건값의 자료형이 일치해야한다
            case "A":
                res = "90~100";
                break;//break가 없을경우 그 순간부터 조건값과 일치하지 않더라도 
                        // 바로 아래있는 case문부터 break를 만날 때까지 실행한다
            
            case "B":
                res = "80~89";
                break;
            
            case "C":
                res = "70~79";
                break;

            case "D":
                res = "60~69";
                break;
            
            case "F":
                res = "59점이하";
                break;

            default:
                res = "잘못된 값이 입력되었습니다";
                break;
        }//switch
        System.out.println(res);
    }//main
}
