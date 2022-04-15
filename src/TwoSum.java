import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {
    //The best I could try: Time complexity => O(n^2) 😥😥😥
    private int[] twoSumVersion1(List<Integer> nums, int target) {
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) == target) return new int[]{i, j};
            }
        }
        return new int[]{};
    }

    //There we go: Time complexity => O(n)
    private int[] twoSumVersion2(List<Integer> nums, int target) {
        Map<Integer, Integer> occurrences = new HashMap<>();
        for (int i = 0; i < nums.size(); i++) {
            if (occurrences.containsKey(target - nums.get(i))) {
                return new int[]{occurrences.get(target - nums.get(i)), i};
            }
            occurrences.put(nums.get(i), i);
        }
        return new int[]{};
    }

    /*
    * For those who don't like HashMap.containsKey()...
    * Well generally containsKey() is O(1) BUT it can reach O(n) in worst case
     */
    private int[] twoSumVersion3(List<Integer> nums, int target) {
        Map<Integer, Integer> occurrences = new HashMap<>();
        for (int i = 0; i < nums.size(); i++) {
            if (occurrences.get(target - nums.get(i)) != null) {
                return new int[]{occurrences.get(target - nums.get(i)), i};
            }
            occurrences.put(nums.get(i), i);
        }
        return new int[]{};
    }
}
