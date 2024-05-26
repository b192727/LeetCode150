//Problem Link: https://rb.gy/ex3wb1

//code
class Solution 
{
    public int removeDuplicates(int[] nums) 
    {
        int n = nums.length;
        if(n == 0) return 0;
        int index = 1;
        for(int i = 1 ; i < n ; i ++)
        {
            if(nums[i] == nums[i-1]) continue;
            else 
            {
                nums[index ++] = nums[i];
            }
        }

        return index;
    }
}
