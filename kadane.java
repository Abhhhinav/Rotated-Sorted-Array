class kadane
{
    public static int maxSubArray(int[] nums) 
    {
      int ms = Integer.MIN_VALUE;
      int cs = 0;
      for(int i=0;i<nums.length;i++)
      {
          cs = cs + nums[i];
          ms = Math.max(ms,cs);
          if(cs<0)
          {
              cs = 0;
          }
      }
      return ms;
    }
    public static void main(String args[])
    {
        int nums[] = {-1,-4,-3};
        System.out.println(maxSubArray(nums));
    }
}