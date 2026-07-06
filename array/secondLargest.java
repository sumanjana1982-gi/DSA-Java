//Second Largest Element


//{Hints
//Company
//Given an array of integers nums, return the second-largest element in the array. If the second-largest element does not exist, return -1.}


//Example 1

//Input: nums = [8, 8, 7, 6, 5]
//Output: 7

//Explanation:

//The largest value in nums is 8, the second largest is 7

//Example 2

//Input: nums = [10, 10, 10, 10, 10]

//Output: -1

//Explanation:

//The only value in nums is 10, so there is no second largest value, thus -1 is returned
class Solution {
    public int secondLargestElement(int[] nums) {
       int larg=nums[0];int SL=Integer.MIN_VALUE;
       for(int i=1;i<nums.length;i++){
        if(nums[i]>larg){
            larg=nums[i];
        }
       }
       for(int i=0;i<nums.length;i++){
        if(nums[i]>SL&&nums[i]<larg){
            SL=nums[i];
        }
       }
       if(SL==Integer.MIN_VALUE){
        return -1;
       }
       return SL;
    }
}
