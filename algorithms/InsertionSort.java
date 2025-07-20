package algorithms;

import java.util.Scanner;

public class InsertionSort {
    public static void insertionsort() {
        Scanner sc = new Scanner(System.in);
        int n;

        while (true) {
            System.out.println("\nInsertion Sort");
            System.out.println("Enter the number of elements: ");

            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n > 0) break;
                else System.out.println("Please enter a positive integer: ");
            } else {
                System.out.println("Invalid input. Please enter a positive integer: ");
                sc.next();
            }
        }

        double [] A = new double [n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            while(true){
                System.out.println("Element " + (i+1) + ": ");
                if (sc.hasNextDouble()) {
                    A[i] = sc.nextDouble();
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a number: ");
                    sc.next();
                }
            }
        }

        long startTime = System.nanoTime();
        for (int i = 0; i < n; i++) {
            double key = A[i];
            int j = i - 1;
            while (j >= 0 && A[j] > key) {
                A[j+1] = A[j];
                j = j - 1;
            }
            A[j+1] = key;
        }
        long endTime = System.nanoTime();

        System.out.println("\nSorted array:");
        for (double val : A) {
            System.out.print(val + " ");
        }
        System.out.println("\nTime taken: " + (endTime - startTime) + " ns");
        System.out.println("Time complexity:");
        System.out.println("Best case: O(n)");
        System.out.println("Worst case: O(n^2)");
        System.out.println("Average case: O(n^2)");
    }
}
