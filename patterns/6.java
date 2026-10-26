// Pattern 10
// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

// *

// **

// ***

// ****

// *****

// ****

// ***

// **

// *
class Solution {
    public void pattern10(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int k=1;k<n;k++){
            for(int g=1;g<=n-k;g++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}