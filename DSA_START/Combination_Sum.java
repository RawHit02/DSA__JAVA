import java.util.ArrayList;
import java.util.List;

public class Combination_Sum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> combinations = solution.combinationSum(candidates, target);
        System.out.println(combinations);
    }
}

class Solution {
    public void findCombinations(int index, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds) {
        if (index == arr.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if (arr[index] <= target) {
            ds.add(arr[index]);
            findCombinations(index, arr, target - arr[index], ans, ds);
            ds.remove(ds.size() - 1);
        }
        findCombinations(index + 1, arr, target, ans, ds);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }
}
