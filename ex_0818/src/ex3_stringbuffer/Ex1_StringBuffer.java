package ex3_stringbuffer;

public class Ex1_StringBuffer {
    public static void main(String[] args){

        String str = "안녕";
        //암시적으로 힙메모리에 공간을 할당받았고 
        //그안에 "안녕"이 있는 주소를 참조하는 str
        //(암시적으로 만들수 있는 유일한 class = String)
        str = "반갑습니다";
        str += "!";
        System.out.println(str);

        StringBuffer sb = new StringBuffer("안녕");
        sb.setLength(0);
        sb.append("반가워요");//이어붙이는 메서드 append(첨부하다)
        sb.append("!!!");
        System.out.println(sb.toString());

    }//main
}
