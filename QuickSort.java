import java.util.Scanner;
// import java.util.Arrays;

public class QuickSort {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int s = input.nextInt();
        int[] arr = new int[s];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < s; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("The elements of the array are: ");
        for (int i = 0; i < s; i++) {
            System.out.print(arr[i] + " ");
        }

        quickSort(arr, 0, s - 1);

        System.out.println("\nSorted array is:");
        for (int i = 0; i < s; i++) {
            System.out.print(arr[i] + " ");
        }

        input.close();
    }

    // QuickSort function
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Partition function
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    // Swap function
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
