package algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
    public static void quicksort(){
        Scanner sc = new Scanner(System.in);
        int n;

        while (true){
            System.out.println("\nQuick Sort");
            System.out.println("Enter the number of elements: ");
            if (sc.hasNextInt()){
                n = sc.nextInt();
                if (n > 0) break;
                else System.out.println("Please enter a positive integer: ");
            } else {
                System.out.println("Invalid input. Please enter a positive integer: ");
                sc.next();
            }
        }

        double[] arr = new double[n];
        System.out.println("Enter the elements: ");

        for (int i = 0; i < n; i++) {
            while(true) {
                System.out.println("Element " + (i + 1) + ": ");
                if (sc.hasNextDouble()) {
                    arr[i] = sc.nextDouble();
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a number: ");
                    sc.next();
                }
            }
        }

        long startTime = System.nanoTime();
        quickSortRecFunc(arr, 0, n - 1);
        long endTime = System.nanoTime();

        System.out.println("\nSorted Array: " + Arrays.toString(arr));
        System.out.println("\nTime Taken: " + (endTime - startTime) + " nanoseconds");
        System.out.println("Time Complexities:");
        System.out.println("Best Case: O(n log n)");
        System.out.println("Average Case: O(n log n)");
        System.out.println("Worst Case: O(n^2)");
    }

    private static void quickSortRecFunc(double[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSortRecFunc(arr, low, pi - 1);
            quickSortRecFunc(arr, pi + 1, high);
        }
    }

    private static int partition(double[] arr, int low, int high) {
        double pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                double temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        double temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}
