package ex3_casting;

public class Ex2_casting {
    public static void main(String[] args){

        //2. 디모션 - 작은 자료형에 큰 자료형이 대입되는 것 (자동x)
        char c1 = 'D'; // 2byte
        int n1 = c1 + 1; // 4byte

        c1 = (char)n1; // 데이터 손실을 감안하고 자료형을 바꿔주기
        System.out.println("c1 : " + c1);

        float f1 = 5.5F; // 4.xbyte
        int n2 = 0; //4byte

        n2 = (int)f1; // 데이터 손실을 감안한 캐스팅(소수점 뒷자리는 날아감)
        System.out.println("n2 : " + n2);

        /*int cast = 1;
        boolean castAc;
        castAc = (boolean) cast;
        System.out.println(castAc);*/ 
        //자바에서는 int형을 boolean형으로 바꾸는 것을 지원하지 않음


    }
}
