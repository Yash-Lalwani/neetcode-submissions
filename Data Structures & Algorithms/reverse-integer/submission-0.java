public class Solution {
    public int reverse(int x) {
        final int MIN = -2147483648;
        final int MAX = 2147483647;

        int res = 0;
        while (x != 0) {
            int rem = x % 10;
            x = x / 10;

            if (res > MAX / 10 || (res == MAX / 10 && rem > MAX % 10)) {
                return 0;
            }
            if (res < MIN / 10 || (res == MIN / 10 && rem < MIN % 10)) {
                return 0;
            }
            res = (res * 10) + rem; 
        }
        return res;
    }
}