import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch{
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
        System.out.println("Enter element to search");
        int value = input.nextInt();

        int index = Search(arr,value);

        if(index!= -1){
            System.out.println("Element Found at index:"+index);
        }
        else{
            System.err.println("Elements not found");
        }
    }
}
private static int Search(int[] array,int target){
    Arrays.sort(array);
    
    int left=0;
    int right=array.length-1;

    while(left<=right){
        int mid =left+(right-left)/2;

        if(array[mid]==target){
            return mid;
        }
        else if( array[mid]<target){
            left=mid+1;
        }
        else{
            right=mid-1;
        }
    }
    return -1;
}
}