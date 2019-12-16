//Time Complexity: O(n)
//Space Complexity: O(1)
//Did it run on Leetcode: Yes
class Solution {
    public int removeDuplicates(int[] nums) {
        int low=0;
        int high=1;
        boolean flag=false;
        while(high<nums.length)
        {
        if(nums[high]==nums[low])
        {
            if(!flag){
                flag=true;
                low++;
                nums[low]=nums[high];
                high++;
            }
            else{
                    high++;
            }
        }
       else
       {
            flag=false;
            low++;
            nums[low]=nums[high];
            high++;
        } 

        }
        return low+1;
    }
}