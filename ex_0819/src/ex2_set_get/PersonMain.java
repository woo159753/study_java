package ex2_set_get;

public class PersonMain {
    public static void main(String[] args){

        Person p1 = new Person();
        p1.setGender("여자");
        System.out.println("성별 : " + p1.getGender());

        p1.setName("홍길동");
        System.out.println("이름 : " + p1.getName());

        p1.setAge(30);
        System.out.println("나이 : " + p1.getAge());
        //나중에 프로젝트를 할때 보안 문제가 발생할 아이디 비밀번호등
        //보호해야할 데이터를 따로 분리해야하는 문제가 발생
        //이를 해결하기 위해서는 class와 package를 적절하게 나눠야 한다
        System.out.println("------------------------------------");

        Person2 p2 = new Person2();
        p2.setInfo("홍길동", 30);//메서드에 파라미터 이름이 뜨기 때문에 인수의 파라미터를 잘 설정해야한다.

        System.out.println("이름 : " + p2.getName());
        System.out.println("나이 : " + p2.getAge());



        /*
        p1.gender = "남자";
        p1.name = "홍길동";
        p1.age = 20;

        System.out.println("이름 : " + p1.name);
        System.out.println("나이 : " + p1.age);
        //의도하지 않은 실수를 줄이자
        //접근이 너무 쉬우니까 보안문제가 발생한다
        //->get,set 사용
        */
    }//main
}
