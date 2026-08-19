package ex_work;

public class Ex2_work1 {

    public int comparison(String act){
        if(act.equals("[송강호]")){
            return 0;
        }else if(act.equals("[조인성]")){
            return 1;
        }else if(act.equals("[이병헌]")){
            return 2;
        }else{
            return 5;
        }
    }
}
