class Solution {
    public int[] productExceptSelf(int[] nums) {
        int index = 0;
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        int[] res = new int[nums.length];

        prefix[0] = 1;
        suffix[suffix.length - 1] = 1;

        for(int i = 1 ; i < prefix.length; i++){
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }

        for(int j = suffix.length - 2; j >= 0; j--){
            suffix[j] = suffix[j + 1] * nums[j + 1]; 
        }

        // for(int l : suffix){
        //     System.out.print(l + " ");
        // }

        for(int k = 0; k < res.length; k++){
            res[k] = prefix[k] * suffix[k];
        }
        
        return res;

    }
}
