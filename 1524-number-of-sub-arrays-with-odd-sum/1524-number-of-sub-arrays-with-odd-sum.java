class Solution {
    public int numOfSubarrays(int[] arr) {
     int sum = 0;
        int even = 1;
        int odd = 0;
        int ans = 0;
        int mod = 1000000007;
        for(int i = 0 ;  i < arr.length ; i++){
            sum+=arr[i];
            if(sum%2==0){
                even++;
                ans=(ans+odd)%mod;
            }else{
                odd++;
                ans=(ans+even)%mod;
            }
        }
        return ans;
    }
}