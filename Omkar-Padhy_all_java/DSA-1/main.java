class Solution {
    public int numberOfChild(int n, int k) {
        int direction = 1; // 1 for right, -1 for left
        int position = 0;

        for (int i = 0; i < k; i++) {
            position += direction;

            if (position == n - 1 || position == 0) {
                direction *= -1;
            }
        }

        return position;
    }
}
class main{
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.numberOfChild(3, 5));
    }
}
