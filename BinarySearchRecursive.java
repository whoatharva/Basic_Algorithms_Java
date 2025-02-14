import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchRecursive {
    
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter the size of the array: ");
            int s = input.nextInt();
            int[] arr = new int[s];

            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < s; i++) {
                arr[i] = input.nextInt();
            }

            // Sorting array before binary search
            Arrays.sort(arr);

            System.out.println("The elements of the array are: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println("\nEnter element to search: ");
            int value = input.nextInt();

            int index = Search(arr, 0, s - 1, value);

            if (index != -1) {
                System.out.println("Element found at index: " + index);
            } else {
                System.err.println("Element not found");
            }
        }
    }

    private static int Search(int[] arr, int left, int right, int target) {
        if (right >= left && left < arr.length) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target)
                return mid;
            
            if (arr[mid] > target)
                return Search(arr, left, mid - 1, target);
            
            return Search(arr, mid + 1, right, target);
        }
        return -1; // Element not found
    }
}
