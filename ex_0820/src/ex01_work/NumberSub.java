package ex01_work;

public class NumberSub {
    public boolean res(String str){
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) < '0' ||
             str.charAt(i) > '9'){//char변수 하나 선언해서 charAt(i) 넣고 쓰면 쓰기 편함
                return false;
            }
        }//for
        return true;
    }//res
}
