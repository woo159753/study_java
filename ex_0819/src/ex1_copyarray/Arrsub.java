package ex1_copyarray;

public class Arrsub {
    
    public void param( int[] arr ){
        //참조변수 arr은 stack에 생긴다(객체는 heap메모리에 할당되긴하는데 참조변수는 stack에 다시 잡힌다 <- 복잡하기 작동한단다)
        //객체를 인자로 넘길 때는 다르게 작용
        arr[0] = 100;
        System.out.println("sub : " + arr[0]);

    }//param()
}
