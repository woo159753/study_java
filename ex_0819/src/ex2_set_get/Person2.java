package ex2_set_get;

public class Person2 {
    private String name;
    private int age;

    public void setInfo( String name, int age ){
        this.name = name;
        //메서드 내에 변수는 같으면 가장 가까운 변수(파라미터)를 참조한다
        //따라서 같은 변수이름을 사용하고 싶으면 
        // this : 현재 클래스 자신
        //을 사용한다
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}
