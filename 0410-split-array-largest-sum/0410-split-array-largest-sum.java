class Solution {
    public int splitArray(int[] nums, int k) {
        int low = Arrays.stream(nums).max().getAsInt();
        int high = Arrays.stream(nums).sum();
        int ans = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(fun(nums,mid,k)){
              low = mid+1;
            }else{
             high = mid-1;
            }
        }
        return low;
    }
     public static boolean fun(int[] nums,int mid,int k){
        int pages = 0;
        int c = 1;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i]+pages<=mid){
                pages+=nums[i];

            }else{
                pages=nums[i];
                c++;
            }
        }
        return c>k;
     }
}