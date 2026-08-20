package ex1_copyarray;

public class ArrMain {
    public static void main(String[] args){
        int[] array = {1, 2, 3, 4, 5};

        Arrsub as = new Arrsub();
        as.param(array);//주소값을 넘김

        System.out.println( "main : " + array[0] );//얕은 복사
    }//main
}
