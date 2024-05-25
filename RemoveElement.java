//Problem Link: https://rb.gy/e9wy57

//code
class Solution 
{
    public int removeElement(int[] nums, int val) 
    {
        int n = nums.length;
        boolean found = false;
        int index = 1;
        for(int i = 0; i < n ; i ++)
        {
            if(nums[i] == val && !found) 
            {
                index = i;
                found = true;
            }
            else if(nums[i] != val && found)
            {
                nums[index ++] = nums[i];
            }
        }    

        if(found) return index;
        return n;
    }
}
