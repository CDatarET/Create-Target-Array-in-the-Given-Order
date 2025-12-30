class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int t = 0;
        for(int i = 0; i < nums.length; i++){
            list.add(index[t++], nums[i]);
        }

        int[] ret = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            ret[i] = list.get(i);
        }
        
        return(ret);
    }
}
