class Solution {

    public static void swap(int nums[],  int str, int end) {

        while(str < end) {
            int temp = nums[str];
            nums[str] = nums[end];
            nums[end] = temp;
            str++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        
        int n = nums.length;
        k = k%n;

       swap(nums, 0, n-1);
       swap(nums, 0, k-1);
       swap(nums,k, n-1);

    }
}