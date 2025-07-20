package algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void mergesort(){
        Scanner sc = new Scanner(System.in);
        int n;

        while (true){
            System.out.println("\nMerge Sort");
            System.out.println("Enter the number of elements: ");
            if (sc.hasNextInt()){
                n = sc.nextInt();
                if (n > 0)  break;
                else System.out.println("Please enter a positive integer");
            } else {
                System.out.println("Invalid input. Please enter a positive integer: ");
                sc.next();
            }
        }

        double[] arr = new double[n];
        System.out.println("Enter the elements: ");

        for (int i = 0; i < n; i++) {
            while(true) {
                System.out.println("Element " + (i+1) + ": ");
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
        mergeSortRecFunc(arr, 0, n - 1);
        long endTime = System.nanoTime();

        System.out.println("\nSorted Array: " + Arrays.toString(arr));
        System.out.println("\nTime Taken: " + (endTime - startTime) + " nanoseconds");
        System.out.println("Time Complexities:");
        System.out.println("Best Case: O(n log n)");
        System.out.println("Average Case: O(n log n)");
        System.out.println("Worst Case: O(n log n)");
    }

    private static void mergeSortRecFunc(double[] arr, int left, int right){
        if (left < right){
            int mid = (left + right) / 2;
            mergeSortRecFunc(arr, left, mid);
            mergeSortRecFunc(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(double[] arr, int left, int mid, int right){
        int n1 = mid - left + 1;
        int n2 = right - mid;

        double[] L = new double[n1];
        double[] R = new double[n2];

        for (int i = 0; i < n1; i++) L[i] = arr[left + i];
        for (int j = 0; j < n2; j++) R[j] = arr[mid + 1 + j];

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }
}
