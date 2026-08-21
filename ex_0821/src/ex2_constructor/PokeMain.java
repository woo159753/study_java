package ex2_constructor;

public class PokeMain {
    public static void main(String[] args){

        //이름과 타입을 반드시 입력해야만 객체가 생성되도록 강제
        //필수정보가 빠진 포켓몬이 만들어지는 것을 방지할 수 있다
        Pokemon p1 = new Pokemon("피카츄","전기");
        //명시적으로 생성자 메서드를 넣으면 
        // 안보이던 기본 생성자가 지워진다
        p1.setName("라이츄");
        //p1.setType("풀");
        //이미 태어난 포켓몬의 타입이 바뀌는 경우는 없으므로set메서드 삭제
        //생성자가 처음 만들때 setter역할을 한번 한다

        p1.info();
    }
}
