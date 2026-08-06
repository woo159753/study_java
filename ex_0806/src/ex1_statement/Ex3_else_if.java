package ex1_statement;

public class Ex3_else_if {
    public static void main(String[] args){

        //다중if문( else if )
        //여러개의 조건 비교가 필요한 경우 사용하는 if문

        //if( 조건식1 ){
        //  조건식1이 참일 때 실행되는 영역
        //}
        //else if( 조건식2 ){
        //  조건식2가 참일 때 실행되는 영역
        //}

        int num = 50;
        String str = "";

        if( num >= 90 ){
            str = "A";
        }else if( num >= 80 ){
            str = "B";
        }else if( num >= 70 ){
            str = "C";
        }else if( num >= 60){
            str = "D";
        }else{
            //else는 위의 조건식들이 전부 거짓일 때 반드시 실행되어야 하는 영역
            str = "F";
        }
        System.out.println(str);
        //나이가 20이상 -> 성인요금
        //14이상 20미만 -> 청소년 요금
        //8이상 14미만 -> 어린이 요금
        //8미만 -> 유아 요금
        int ageNum = 28;
        str = "";

        if( ageNum >= 20 ){
            str = "성인 요금";

        }else if( ageNum < 20 && ageNum >= 14 ){
            //굳이 이렇게 하지 않아도됨 -> 위에 if가 실행되면 끝나기 때문
            str = "청소년 요금";

        }else if( ageNum >= 8 ){
            str = "어린이 요금";

        }else{
            str = "유아 요금";
            
        }
        System.out.println(str);
    }//main
}
