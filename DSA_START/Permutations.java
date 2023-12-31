import java.util.ArrayList;
import java.util.List;

public class Permutations{
    public static void main(String[] args) {
        int[] nums = {1, 2, 3}; // Example input
        Permutations permutation = new Permutations();
        List<List<Integer>> result = permutation.permute(nums);
        System.out.println(result);
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> finalList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        helper(0, list, finalList, nums);
        return finalList;
    }

    public void helper(int index, List<Integer> list, List<List<Integer>> finalList, int[] nums) {
        if (index == nums.length) {
            for (int i = 0; i < nums.length; i++) {
                list.add(nums[i]);
            }
            finalList.add(new ArrayList<>(list));
            list.clear();
            return;
        }
        for (int i = index; i < nums.length; i++) {
            swap(i, index, nums);
            helper(index + 1, list, finalList, nums);
            swap(i, index, nums);
        }
    }

    public void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}