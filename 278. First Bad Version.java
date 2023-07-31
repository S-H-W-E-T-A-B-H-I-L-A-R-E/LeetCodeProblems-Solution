/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start =1;
        int end =  n;
        
        if((n == 1)||(n == 0)){
            return n;
        }
        
        while(start < end){
            int mid = start + (end - start)/2;
        
            if(isBadVersion(mid))
               end = mid; 
            else
               start = mid +1;
        }
        return start;   
    }
}