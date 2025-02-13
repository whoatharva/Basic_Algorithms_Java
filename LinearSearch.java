import java.util.Scanner;

public class LinearSearch{
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

        int index = linearSearch(arr,value);

        if(index!= -1){
            System.out.println("Element Found at index:"+index);
        }
        else{
            System.err.println("Elements not found");
        }
    }
}
private static int linearSearch(int[] array,int value){
    for (int i = 0; i < array.length; i++) {
        if(array[i]==value){
            return i;
        }
    }
    return -1;

}
}