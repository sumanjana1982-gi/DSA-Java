// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

// *********
//  *******
//   *****
//    ***
//     *
// Print the pattern in the function given to you.

// Example 1:
class Solution {
    public void pattern8(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){  
                System.out.print(" ");  
               
            }
            for(int k=1;k<=((2*n)-(2*i)-1);k++){
                System.out.print("*");

            }
            System.out.println();
        }

    }
}