public class Solution {
    public int[] CreateTargetArray(int[] nums, int[] index) {
        List<int> list = new List<int>();
        int t = 0;
        for(int i = 0; i < nums.Length; i++){
            list.Insert(index[t++], nums[i]);
        }

        return(list.ToArray());
    }
}
