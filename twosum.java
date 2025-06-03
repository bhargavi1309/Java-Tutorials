import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if (numToIndex.containsKey(complement)) {
                return new int[] { numToIndex.get(complement), i };
            }
            
            numToIndex.put(nums[i], i);
        }
        
        throw new IllegalArgumentException("No two sum solution");
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();
        
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array separated by spaces:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        System.out.println("Enter the target value:");
        int target = scanner.nextInt();
        
        try {
            int[] result = twoSum(nums, target);
            System.out.println("Indices of the two numbers that add up to target:");
            System.out.println("[" + result[0] + ", " + result[1] + "]");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        scanner.close();
    }
}
