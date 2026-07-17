class Solution {
    public int reverse(int x) {
        boolean negative = x < 0;

        String s = String.valueOf(Math.abs((long) x));
        String reversed = new StringBuilder(s).reverse().toString();

        long result = Long.parseLong(reversed);

        if (negative) {
            result = -result;
        }

        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) result;
    }
}
