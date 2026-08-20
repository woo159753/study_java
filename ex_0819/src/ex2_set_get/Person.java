package ex2_set_get;

public class Person {
 

    private String gender;
    public void setGender(String s){//set메서드
        gender = s;
    }
    public String getGender(){
        return gender;
    }

    private String name;
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }

    int age;
    public void setAge( int a ){
        age = a;
    }
    public int getAge(){
        return age;
    }//근데 어차피 public메서드로 접근 가능하면 쓰나 안쓰나 보안 상으로는 똑같은거 아니야? 
    // -> 메서드에 접근제한자를 바꾸는건가?



}
