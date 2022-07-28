// class Solution {
//     public int finalValueAfterOperations(String[] operations) {
//     int x =0;
    
//     for(int i = 0; i<operations.length; i++){
//         if(operations[i]=="--X" || operations[i]=="X--")
//              x = x - 1 ;
//             else if(operations[i]=="X++" || operations[i]=="++X")
//                 x = x + 1;
//                     else 
//                         continue;
//         }
//             return x;
//     }
// }

class Solution {
  public int finalValueAfterOperations(String[] operations) {
    int ans = 0;

    for (final String op : operations)
      ans += op.charAt(1) == '+' ? 1 : -1;

    return ans;
  }
}