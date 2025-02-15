import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter the size of the array: ");
            int s = 0;
            if (input.hasNextInt()) {
                s = input.nextInt();
            }
            int[] arr = new int[s];

            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < s; i++) {
                if (input.hasNextInt()) {
                    arr[i] = input.nextInt();
                }
            }

            System.out.println("The elements of the array are: ");
            for (int i = 0; i < s; i++) {
                System.out.print(arr[i] + " ");
            }

            arr = sort(arr);

            System.out.println("\nSorted array is:");
            for (int i = 0; i < s; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static int[] sort(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size - 1; i++) {
            // Start by assuming the current index is the minimum
            int minIndex = i;
            // Check the rest of the array for a smaller element
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the element at index i
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }
}
