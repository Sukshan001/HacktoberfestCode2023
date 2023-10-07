class Solution {
    public int mySqrt(int x) {

       
        if (x <= 1) {
            return x;
        }

        int low = 1;
        int high = x;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Use this to avoid integer overflow

            if (mid <= x / mid) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return high; // Return high because we are rounding down
    }
}
