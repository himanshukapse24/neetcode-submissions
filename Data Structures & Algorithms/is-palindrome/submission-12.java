class Solution {
    public boolean isPalindrome(String s) {
        String temp = s.replaceAll("[^a-zA-Z0-9]", "");
        int left = 0, right = temp.length() - 1;

        System.out.print(s);
        while (left < right) {
            if (Character.toLowerCase(temp.charAt(left))
                == Character.toLowerCase(temp.charAt(right))) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }
}
