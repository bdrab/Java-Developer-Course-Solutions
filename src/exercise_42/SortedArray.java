package exercise_42;
import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    public static int[] getIntegers(int size){
        int[] arr = new int[size];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < size; i++){
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println("Element "+ i + " contents " + arr[i]);
        }
    }

    public static int[] sortIntegers(int[] arr){
        Arrays.sort(arr);
        int[] newArr = new int[arr.length];
        for(int i = 0; i < arr.length; i ++){
            newArr[i] = arr[arr.length- i - 1];
        }
        return  newArr;
    }
}
