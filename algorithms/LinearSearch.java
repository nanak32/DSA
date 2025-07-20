package algorithms;

import java.util.Scanner;

public class LinearSearch{
    public static void linearsearch(){

        Scanner sc = new Scanner(System.in);

        int n;
        while (true){
            System.out.println("\nLinear Search");
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

        double[] A = new double[n];
        System.out.println("Enter the elements: ");

        for (int i = 0; i < n; i++) {
            while (true){
                System.out.print("Element " + (i + 1) + ": ");
                if (sc.hasNextDouble()){
                    A[i] = sc.nextDouble();
                    break;
                } else {
                    System.out.println("Invalid input. Please enter an integer: ");

                    sc.next();
                }
            }
        }

        double K;
        while (true){
            System.out.println("Enter the search key: ");
            if (sc.hasNextDouble()){
                K = sc.nextDouble();
                break;
            } else {
                System.out.println("Invalid input. Please enter an integer: ");
                sc.next();
            }
        }

        //Start Time
        long startTime = System.nanoTime();

        int i = 0;
        while (i < A.length && A[i] != K){
            i = i + 1;
        }

        //End Time
        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        if (i < A.length) {
            System.out.println("The index is " + i);
        }else{
            System.out.println(-1);
        }

        //Time Complexity of Linear Search
        System.out.println("\nTime taken (ns): " + duration);
        System.out.println("Time Complexity: ");
        System.out.println("Best Case: O(1)");
        System.out.println("Worst Case: O(n)");
        System.out.println("Average Case: O(n)");
    }
}

