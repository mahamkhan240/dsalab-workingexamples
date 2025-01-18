class Solution {
    public String intToRoman(int num) {
        int[] n = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] s = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int i = 0;
        String str = new String();
        while (num > 0) {
            if (num >= n[i]) {
                str = str + s[i];
                num -= n[i];
            } else {
                i++;
            }
        }
        return str;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        int num1 = 58;
        System.out.println("Roman numeral for " + num1 + " is: " + solution.intToRoman(num1)); // Expected: LVIII

        int num2 = 1994;
        System.out.println("Roman numeral for " + num2 + " is: " + solution.intToRoman(num2)); // Expected: MCMXCIV

        int num3 = 9;
        System.out.println("Roman numeral for " + num3 + " is: " + solution.intToRoman(num3)); // Expected: IX

        int num4 = 2024;
        System.out.println("Roman numeral for " + num4 + " is: " + solution.intToRoman(num4)); // Expected: MMXXIV

        int num5 = 3999;
        System.out.println("Roman numeral for " + num5 + " is: " + solution.intToRoman(num5)); // Expected: MMMCMXCIX
    }
}
