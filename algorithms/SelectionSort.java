package algorithms;

import java.util.Scanner;

public class SelectionSort {
    public static void selectionsort(){
        Scanner sc = new Scanner(System.in);
        int n;

        while (true){
            System.out.println("\nSelection Sort");
            System.out.println("Enter the number of elements: ");

            if (sc.hasNextInt()){
                n = sc.nextInt();
                if (n > 0) break;
                else System.out.println("Please enter a positive integer");
            } else {
                System.out.println("Invalid input. Please enter a positive integer: ");
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

        long startTime = System.nanoTime();
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (A[j] < A[min]) {
                    min = j;
                }
            }

            double temp = A[min];
            A[min] = A[i];
            A[i] = temp;
        }
        long endTime = System.nanoTime();

        System.out.println("\nSorted array: ");
        for (double value : A) {
            System.out.print(value + " ");
        }

        System.out.println("\nTime taken: " + (endTime - startTime) + " ns");
        System.out.println("Time complexity:");
        System.out.println("Best case: O(n^2)");
        System.out.println("Worst case: O(n^2)");
        System.out.println("Average case: O(n^2)");
    }
}
