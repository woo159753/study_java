package ex5_work;

public class Oper {
    
    public int oper(int su1, int su2, String oper){
        switch(oper){
            case "+":
                return (su1 + su2);

            case "-":
                return(su1 - su2);

            case "*":
                return(su1 * su2);

            case "/":
                return(su1 / su2);
                
            default :
                System.out.println("연산기호가 올바르지 않습니다");
                return -1;
                
        }
    }
}
