package ex10_work;

public class WorkSub {
    
    public void mabang(int[][] arr){
        int start = arr.length / 2;
        int num = arr.length;
        int row = 0;
        for(int i = 1; i <= num * num; i++){

            arr[row][start] = i;
            if(i % num == 0){
                start++;
            }else{
                row--;
                start++;
            }

            if(row > num - 1 ){
                row = 0;
            }
            if(start > num - 1){
                start = 0;
            }
            if(row < 0){
                row = num - 1;
            }
        }
        this.info(arr);
    }//mabang

    public void info(int[][] arr){
        int num = arr.length;
        for(int i = 0; i < num; i++){
            for(int j = 0; j < num; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
