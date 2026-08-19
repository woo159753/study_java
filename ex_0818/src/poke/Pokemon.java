package poke;

public class Pokemon {
    
    //초기화는 하지 않는 편이다
    String name;
    int hp;
    String type;
    
    public void info(){
        System.out.println("야생의 " +  name + "이(가) 튀어나왔다");
        System.out.printf("hp : %d / type : %s\n", hp, type);
            
        System.out.println("----------------------------");
    }    
}
    

