class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
       for(int i=0;i<n-1;i++){
           for(int j=i+1;j<n;j++){
               if(nums[i]+nums[j]==target){
                   int []p=new int[2];
                   p[0]=i;
                   p[1]=j;
                   return p;
               }
           }
       }
        return null;
    }
}