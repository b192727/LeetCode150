//Problem Link: https://rb.gy/yec9q9
//code
class Solution 
{
    public int majorityElement(int[] nums) 
    {
        int ele = nums[0];
        int ct = 0;
        for(int i = 0 ; i < nums.length ; i ++)
        {
            if(ele == nums[i]) ct ++;
            else if(ct > 0) ct --;
            else 
            {
                ct ++;
                ele = nums[i];
            }
        }
        return ele;
    }
}
