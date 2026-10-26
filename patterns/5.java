// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

//     * 
//    ***
//   *****
//  *******
// *********
// *********
//  *******
//   *****
//    ***
//     *

class Solution {
    public void pattern9(int n) {
        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
                System.out.print(" ");
            }
            for(int k =0;k<2*i+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        for(int a=0;a<n;a++){
            for(int b=0;b<a;b++){
                System.out.print(" ");
            }
            for(int g=0;g<2*n-2*a-1;g++){
                System.out.print("*");
            }
             System.out.println();
        }
       

    }
}