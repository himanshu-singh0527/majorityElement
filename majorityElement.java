import java.util.*;

class Solution {
    public int majorityElement(int nums[]) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > n / 2) {
                return nums[i];
            }
        }
        return -1;
    }
}

public class majorityElement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Solution solution = new Solution();
        int majorityElement = solution.majorityElement(nums);  // Fixed typo here
        System.out.println("Majority element is: " + majorityElement);  // Fixed typo here
    }
}
