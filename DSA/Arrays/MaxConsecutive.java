import java.util.Scanner;
public class MaxConsecutive {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, count = 0;
        for (int num : nums) {
            if (num == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the array elements (only 0s and 1s):");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        MaxConsecutive mc = new MaxConsecutive();
        int result = mc.findMaxConsecutiveOnes(nums);
        System.out.println("Maximum number of consecutive 1s: " + result);
        scanner.close();
    }
}