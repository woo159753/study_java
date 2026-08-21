package ex7_work;

public class WorkSub {

    public int resb(int[] arr){
        int bnum = arr[0];
        for(int i = 0; i < arr.length; i++){
            
            if(arr[i] > bnum )
                bnum = arr[i];  

        }//for
        return bnum;
        
    }//resb

}//WorkSub
