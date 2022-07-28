class Solution {
    public int maximumWealth(int[][] accounts) {
        int size = accounts.length;
        if(size == 0) return 0;
        int[] sum =  new int[size];
        int max=0;
        for(int i = 0; i<size; i++ ){
            for(int j= 0; j<accounts[i].length; j++){
            sum[i] = sum[i] + accounts[i][j];
            }
            for(int k=0; k< sum.length; k++){ 
                if(sum[k]>max){
                max = sum[k];
                }
            }
        }
        return max;
    }
    
}