class Solution {
    public int minEatingSpeed(int[] nums, int h) {
       int low = 1;
       int high = Arrays.stream(nums).max().getAsInt();
       int ans = -1;
       while(low<=high){
        int mid = low+(high-low)/2;
         if(fun(nums,mid,h)){
           ans = mid;
            high = mid-1;
         }else{
            low=mid+1;
         }
       }
       return ans;
    }
    public static boolean fun(int[] nums,int mid,int h){
        int sum = 0;
        for(int i = 0; i < nums.length ; i++){
           sum+=(int)Math.ceil((double)nums[i]/mid);
           if(sum > h) {
           return false;
         }
        }
        return sum<=h;
    }
}