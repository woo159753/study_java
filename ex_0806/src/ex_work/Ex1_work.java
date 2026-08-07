package ex_work;

public class Ex1_work {
    public static void main(String[] args){

        //나이가 15세 이상이거나, 키가 150cm이상이면 탑승가능
        //그렇지 않으면 탑승불가를 출력
        int age = 16;
        int height = 148;
        String str = "";

        if( age >= 15 || height >= 150 ){
            str = "탑승가능";

        }else{
            str = "탑승불가";

        }
        System.out.println(str);

        str = age >= 15 || height >= 150 ? "탑승가능" : "탑승불가";
        System.out.println(str);

        for( int i = 0; i < 10; i++){
            System.out.println(++i);
        }
        System.out.println(i);
    }//main
}
