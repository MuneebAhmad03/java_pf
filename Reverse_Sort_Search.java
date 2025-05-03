import java.util.Scanner;

public class Reverse_Sort_Search {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of Integers: ");
        int size = input.nextInt();
        int [] arr = new int [size];

        System.out.println("Enter " + size + " of integers. ");
        for (int i = 0; i < size ; i++){
            arr[i] = input.nextInt();
        }


        int choice;
        do {
            System.out.println("\nChoose an option:");
            System.out.println("1. Reverse the Array");
            System.out.println("2. Sort Ascending");
            System.out.println("3. Sort Descending");
            System.out.println("4. Search for an element");
            System.out.println("5. EXIT");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            if (choice == 1) {
                System.out.println("Reversed array:");
                for (int i = size - 1; i >= 0; i--) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();

            } else if (choice == 2) {

                for (int i = 0; i < size - 1; i++) {
                    for (int j = 0; j < size - 1 - i; j++) {
                        if (arr[j] > arr[j + 1]) {
                            int temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                        }
                    }
                }
                System.out.println("Array sorted in ascending order:");
                for (int num : arr) {
                    System.out.print(num + " ");
                }
                System.out.println();

            } else if (choice == 3) {

                for (int i = 0; i < size - 1; i++) {
                    for (int j = 0; j < size - 1 - i; j++) {
                        if (arr[j] < arr[j + 1]) {
                            int temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                        }
                    }
                }
                System.out.println("Array sorted in descending order:");
                for (int num : arr) {
                    System.out.print(num + " ");
                }
                System.out.println();

            } else if (choice == 4) {
                System.out.print("Enter number to search: ");
                int search = input.nextInt();
                boolean found = false;

                for (int i = 0; i < size; i++) {
                    if (arr[i] == search) {
                        System.out.println("Found at index " + i);
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Element not found.");
                }

            } else if (choice == 5) {
                System.out.println("Goodbye!..Exiting");
            } else {
                System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 5);

    }

}
