// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

// *****

// ****

// ***

// **

// *
class Solution {
    public void pattern5(int n) {
     for (int i=0;i<n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print("*");

        }
        System.out.println();

     }
    }
}