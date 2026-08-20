package ex6_work;

public class GradeSub {
    
    public int oper(int pay, String rating){
        if(rating.equalsIgnoreCase("vip")){
            return (pay / 10);//(pay * (10 / 100))으로 써도 됨

        }else if(rating.equalsIgnoreCase("gold")){
            return (pay / 20);

        }else if(rating.equalsIgnoreCase("silver")){
            return (pay * 3 / 100);

        }else{
            System.out.println("회원등급이 올바르지 않습니다");
            return 0;

        }//if-else
    }//oper()
}
