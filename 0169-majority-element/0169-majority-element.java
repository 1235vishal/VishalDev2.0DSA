class Solution {
    public int majorityElement(int[] nums) {
        
        int con = 0;
        int count = 0;

        for(int x : nums) {

            if(count == 0) {
                con = x;
            }

            if(con == x) {
                count++;
            }
            else {
                count--;
            }
        }

        return con;
    }
}