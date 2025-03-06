import java.util.Scanner;

public class InsertionSort {
    
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
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
            
            sort(arr);
            
            System.out.println("\nSorted array is:");
            for (int i = 0; i < s; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    static void sort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i], j = i - 1;
            while (j >= 0 && arr[j] > key) arr[j + 1] = arr[j--];
            arr[j + 1] = key;
        }
    }
}
