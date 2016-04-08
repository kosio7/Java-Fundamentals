import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] nums = new Integer[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+ " ");
        }
    }
}
