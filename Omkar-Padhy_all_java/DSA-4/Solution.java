class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x;

        int left = 2, right = x / 2;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid * mid == x) return mid;
            if (mid * mid < x) left = mid + 1;
            else right = mid - 1;
        }
        return right;
    }
    public static void main(String[] args) {
        int x= 8;
        Solution sol = new Solution();
        System.out.println(sol.mySqrt(x));
    }
}
