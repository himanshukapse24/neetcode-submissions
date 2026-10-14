class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (flowerbed.length == 1 && n == 1){
            if(flowerbed[0] == 0) return true;
            else return false;
        }
           

        int prev = 0, left = 0, right = 0, next = right + 1;

        while (right < flowerbed.length - 1) {
            if (flowerbed[right] == 0) {
                if (flowerbed[prev] == 0 && flowerbed[next] == 0) {
                    flowerbed[right] = 1;
                    n--;
                }

                if (flowerbed[next] == 0 && right == flowerbed.length - 2) {
                    n--;
                }
            }
            prev = right;
            right++;
            next++;
        }

        System.out.print(n + " ");

        return n <= 0;
    }
}