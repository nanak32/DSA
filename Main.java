import java.util.Scanner;
import algorithms.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose one of the following: ");
            System.out.println("1.Searching Algorithms");
            System.out.println("2.Sorting Algorithms");
            System.out.println("Enter your choice(1 or 2) or Press 'E' to exit the application: ");

            String input = sc.next();

            if (input.equalsIgnoreCase("e")) {
                System.out.println("Exiting the program...");
                break;
            }

            try{
                int choice = Integer.parseInt(input);

                switch (choice) {
                    case 1:


                        int n1;

                        while (true) {
                            System.out.println("\nWhich type of Searching Algorithm?");
                            System.out.println("1.Linear Search");
                            System.out.println("2.Binary Search");

                            if (sc.hasNextInt()) {
                                n1 = sc.nextInt();
                                if (n1 > 0 && n1 < 3) break;
                                else System.out.println("Please enter either 1 or 2: ");
                            } else {
                                System.out.println("Invalid input. Please enter either 1 or 2: ");
                                sc.next();
                            }
                        }

                        if (n1 == 1){
                            //Linear Search Implementation
                            LinearSearch.linearsearch();
                        } else {
                            //Binary Search Implementation
                            BinarySearch.binarysearch();
                        }

                        break;

                    case 2:

                        int n2;

                        while (true) {
                            System.out.println("\nWhich type of Sorting Algorithm?");
                            System.out.println("1. Bubble Sort");
                            System.out.println("2. Quick Sort");
                            System.out.println("3. Selection Sort");
                            System.out.println("4. Merge Sort");
                            System.out.println("5. Insertion Sort");
                            System.out.println("6. Shell Sort");

                            if (sc.hasNextInt()) {
                                n2 = sc.nextInt();
                                if (n2 > 0 && n2 <= 6) break;
                                else System.out.println("Please enter a positive integer between 1 and 6: ");
                            } else {
                                System.out.println("Invalid input. Please enter a positive integer between 1 and 6: ");
                                sc.next();
                            }
                        }

                        if (n2 == 1) {
                            //Bubble Sort Implementation
                            BubbleSort.bubblesort();
                        } else if (n2 == 2) {
                            //Quick Sort Implementation
                            QuickSort.quicksort();
                        } else if (n2 == 3) {
                            SelectionSort.selectionsort();
                        } else if (n2 == 4) {
                            MergeSort.mergesort();
                        } else if (n2 == 5) {
                            InsertionSort.insertionsort();
                        } else {
                            ShellSort.shellsort();
                        }

                        break;


                    default:
                        System.out.println("Please enter a valid choice.");


                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter either 1 or 2 or 'E' to exit the program.");
            }

        }
    }
}
