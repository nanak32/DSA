package algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class ShellSort {
    public static void shellsort(){
        Scanner sc = new Scanner(System.in);
        int n;

        while (true){
            System.out.println("\nShell Sort");
            System.out.println("Enter the number of elements: ");
            if (sc.hasNextInt()){
                n = sc.nextInt();
                if(n > 0) break;
                else System.out.println("Please enter a positive integer: ");
            } else {
                System.out.println("Invalid input. Please enter a positive integer: ");
                sc.next();
            }
        }

        double[] arr = new double[n];
        System.out.println("Enter the elements: ");

        for (int i = 0; i < n; i++) {
            while(true){
                System.out.println("Element " + (i+1) + ": ");
                if (sc.hasNextDouble()){
                    arr[i] = sc.nextDouble();
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a number: ");
                    sc.next();
                }
            }
        }

        long startTime = System.nanoTime();

        for (int gap = n/2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                double temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = temp;
            }
        }
        long endTime = System.nanoTime();

        System.out.println("\nSorted Array: " + Arrays.toString(arr));
        System.out.println("\nTime Taken: " + (endTime - startTime) + " nanoseconds");
        System.out.println("Time Complexities:");
        System.out.println("Best Case: O(n log n)");
        System.out.println("Average Case: O(n^1.5)");
        System.out.println("Worst Case: O(n^2)");
    }
}
