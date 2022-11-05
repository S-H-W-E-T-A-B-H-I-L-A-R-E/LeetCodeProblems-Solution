// class Solution {
//     public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//          int n1 =  nums1.length;
//         int n2 = nums2.length;
//         int low = 0, high = n1;
        
//         if(n2 < n1)
//             return findMedianSortedArrays(nums2, nums1);
        
//         while(low<=high){
//             int cut1 = (low + high) >> 1;
//             int cut2 = (n1+n2+1)/2 - cut1;
            
//             int left1 = cut1 ==0 ? Integer.MIN_VALUE: nums1[cut1-1];
//             int left2 = cut2 ==0 ? Integer.MIN_VALUE: nums2[cut2-1];
            
//             int right1 = cut1 ==n1 ? Integer.MAX_VALUE: nums1[cut1];
//             int right2 = cut2 ==n2 ? Integer.MAX_VALUE: nums2[cut2];
         
//             if(left1<=right2 && left2<= right1){
//                 if((n1+n2)%2 ==0)
//                     return (Math.max(left1, left2)+Math.min(right1, right2))/2.0;
//                 else
//                     return Math.max(left1, left2);
//             }
//             else if(left1 > right2)
//                 high = cut1 - 1;
    
//             else
//                 low =  cut1 + 1;
            
//         }
//          return 0.0;
//     }


 class Solution{
     public double findMedianSortedArrays(int[] nums1, int[] nums2){
         //base condition
    //if nums1 length is greater than nums switch them so that nums1 is smaller than nums2
        if(nums1.length>nums2.length){
           return findMedianSortedArrays(nums2, nums1);
        }

        int x = nums1.length;
        int y = nums2.length;

        int low = 0;
        int high = x;

        while(low<=high){
        int partitionX = (low + high) / 2;
        int partitionY = (x + y + 1) / 2 - partitionX;  // +1 is for odd and even both

        //if partitionX is 0 means there is nothing on left side. So assign -infinity
        //if partitionX is x means then there is nothing on right side So assign +infinity

        int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE: nums1[partitionX-1];
        int minRightX = (partitionX == x) ? Integer.MAX_VALUE : nums1[partitionX];

        int maxLeftY = (partitionY==0) ? Integer.MIN_VALUE : nums2[partitionY-1];
        int minRightY = (partitionY == y) ? Integer.MAX_VALUE : nums2[partitionY];

        //Conditions to check if partition is correct
        if((maxLeftX <= minRightY) && (maxLeftY <= minRightX)){
        //we have partitioned the array correctly
        //now get max of left elements and min of right elements to get median in case of even  length of combained array
        
        if((x + y)%2 == 0)
         return((double )Math.max(maxLeftX, maxLeftY)+ Math.min(minRightX, minRightY))/2;
        else
         //else get max of left of add length combined array size
         return (double)Math.max(maxLeftX,maxLeftY);
        
        //If partition is not correct
        }else if(maxLeftX > minRightY)
        // we are too far on right right side for partitionX. Go on left side
         high = partitionX - 1;
        else 
        // we are too far on left side. Go on right side
         low = partitionX + 1;   
        }


        //if the input arrays are not sorted 
        throw new IllegalArgumentException();
     }
     }
 

   
}
