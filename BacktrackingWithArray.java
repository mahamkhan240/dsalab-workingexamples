import java.util.*;

public class BacktrackingWithArray {

    public static void generateSubsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), result);


        for (List<Integer> subset : result) {
            System.out.println(subset);
        }
    }


    private static void backtrack(int[] nums, int start, List<Integer> current, List<List<Integer>> result) {

        result.add(new ArrayList<>(current));


        for (int i = start; i < nums.length; i++) {

            current.add(nums[i]);


            backtrack(nums, i + 1, current, result);


            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        generateSubsets(nums);
    }
}