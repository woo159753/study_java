package ex3_class_array;

public class PersonMain {
    public static void main(String[] args){

        Person[] p1 = new Person[2];
        //클래스를 배열로 만들었다면
        //반드시 각 index의 객체화를 해줘야 한다

        //p1[0] = new Person();
        //생성자로 배열 객체의 각 객체에 새로 메모리를 할당해야 한다
        //------------------

        //String 배열도 객체 배열이다
        //하지만 String은 암시적 객체 생성이 가능 하기 때문에 
        //생성자로 따로 메모리를 할당하지 않아도 된다

        for(int i = 0 ; i < p1.length; i++){
            p1[i] = new Person();
        }//for문으로 한번에 객체배열 메모리 할당 받을 수 있다.

        p1[0].setName("홍길동");
        p1[0].setAge(20);

        p1[1].setName("김길동");
        p1[1].setAge(25);
        //넣을 때는 불편하다 꺼낼 때는 편하다(for문 사용)
        //넣을 때 객체 배열에 입력값 배열을 순차적으로 넣는 방법도 있을것 같다

        for(int i = 0; i < p1.length; i++){
            System.out.printf("%s / %d\n",p1[i].getName(),p1[i].getAge());
        }//for
    }//main
}
