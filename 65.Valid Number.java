class Solution {
    public boolean isNumber(String s) {
        try {
            Double.parseDouble(s);

            char last = s.charAt(s.length() - 1);
            if (last == 'd' || last == 'D' || last == 'f' || last == 'F') {
                return false;
            }

            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
