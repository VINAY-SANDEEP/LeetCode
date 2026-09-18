class Solution {
    public int largestRectangleArea(int[] heights) {
        int[] left = new int[heights.length];
        int[] right = new int[heights.length];
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ; i < heights.length ; i++){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                left[i]=-1;
            }else{
                left[i]=st.peek();
            }
            st.push(i);
        }
        st.clear();
        for(int i = heights.length-1 ; i >=0 ; i--){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                right[i]=heights.length;
            }else{
                right[i]=st.peek();
            }
            st.push(i);
        }
        int max = 0;
        for (int i = 0; i < heights.length; i++) {
            int width = right[i] - left[i] - 1;

            int area = heights[i] * width;

            max = Math.max(max, area);
        }
        return max;
    }
}