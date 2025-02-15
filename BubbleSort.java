import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
         try (Scanner input = new Scanner(System.in)) {
        System.out.println("Enter the size of the array: ");
        int s = 0;
        if (input.hasNextInt()) {
            s = input.nextInt();
        }
        int[] arr = new int[s];

        System.out.println(
            "Enter the elements of the array: ");
        for (int i = 0; i < s; i++) {
            if (input.hasNextInt()) {
                arr[i] = input.nextInt();
            }
        }

        System.out.println(
            "The elements of the array are: ");
        for (int i = 0; i < s; i++) {
           
            System.out.print(arr[i] + " ");
        
    }
    arr=Sort(arr);
    System.out.println("Sorted array is");
    for (int i = 0; i < s; i++) {
       
        System.out.print(arr[i] + " ");
    
}
}
}
public static int[] Sort(int []arr){

    int size= arr.length;
    for (int i = 0; i < size -1 ; i++) {
        for (int j = 0; j < size-1 ; j++) {
            if (arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
        
    }
    return arr;
}
}
