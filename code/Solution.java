import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public static void topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numCount = new HashMap<>();
        List<Integer>[] freq = new List[nums.length + 1];

        for (int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }

        for (int n: nums) {
            if (!numCount.containsKey(n)) {
                numCount.put(n, 0);
            }
            numCount.put(n, numCount.get(n) + 1);
        }

        for (Map.Entry<Integer, Integer> entry: numCount.entrySet()) {
            freq[entry.getValue()].add(entry.getKey());
        }

    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 100};
        int k = 2;

        topKFrequent(nums, k);
    }
}
