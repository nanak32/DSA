package algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void binarysearch(){
        Scanner sc = new Scanner(System.in);
        int n;

        while (true){
            System.out.println("\nBinary Search");
            System.out.println("Enter the number of elements: ");

            if (sc.hasNextInt()){
                n = sc.nextInt();
                if (n > 0) break;
                else System.out.println("Please enter a positive integer: ");
            } else {
                System.out.println("Invalid input. Please enter a positive integer");
                sc.next();
            }
        }

        double[] A = new double[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            while (true){
                System.out.println("Element " + (i + 1) + ": ");
                if (sc.hasNextDouble()){
                    A[i] = sc.nextDouble();
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a number: ");
                    sc.next();
                }
            }
        }

        Arrays.sort(A);

        System.out.println("Sorted Array: " + Arrays.toString(A));

        double K;
        while (true){
            System.out.println("\nEnter the search key: ");
            if (sc.hasNextDouble()){
                K = sc.nextDouble();
                break;
            } else {
                System.out.println("Invalid input. Please enter a number: ");
                sc.next();
            }
        }

        long startTime = System.nanoTime();
        int low = 0;
        int high = n - 1;
        int index = -1;

        while (low <= high){
            int mid = (low + high) / 2;
            if (A[mid] == K){
                index = mid;
                break;
            } else if (K < A[mid]){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        long endTime = System.nanoTime();

        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found");
        }

        //Time Complexity
        System.out.println("\nTime taken: " + (endTime - startTime) + " ns");
        System.out.println("\nTime Complexity: ");
        System.out.println("Best Case: O(1)");
        System.out.println("Worst Case: O(log n)");
        System.out.println("Average Case: O(log n)");
    }
}
