//Problem Link: https://rb.gy/8ywsen

//code
class Solution 
{
    public int removeDuplicates(int[] nums) 
    {
        if(nums.length == 0) return 0;
        int index = 1;
        int ct = 1;
        for(int i = 1 ; i < nums.length ; i ++)
        {
            if(nums[i] == nums[i-1] && ct < 2)
            {
                nums[index ++] = nums[i];
                ct ++;
            }
            else if(nums[i] != nums[i-1])
            {
                ct = 1;
                nums[index ++] = nums[i];
            } 
        }     
        return index;   
    }
}
