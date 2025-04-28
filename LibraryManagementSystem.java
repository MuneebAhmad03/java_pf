import java.util.Scanner;

public class LibraryManagementSystem {
    
    static String[] books = new String[100];
    static boolean[] isBorrowed = new boolean[100];
    static int bookCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add a Book");
            System.out.println("2. Search for a Book");
            System.out.println("3. Borrow a Book");
            System.out.println("4. View All Books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    addBook(scanner);
                    break;
                case 2:
                    searchBook(scanner);
                    break;
                case 3:
                    borrowBook(scanner);
                    break;
                case 4:
                    viewBooks();
                    break;
                case 5:
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }

    // ........ add a book..................
    public static void addBook(Scanner scanner) {
        if (bookCount >= books.length) {
            System.out.println("Library is full. Cannot add more books.");
            return;
        }

        System.out.print("Enter book title: ");
        String title = scanner.nextLine();

        for (int i = 0; i < bookCount; i++) {
            if (books[i].equalsIgnoreCase(title)) {
                System.out.println("This book already exists in the library.");
                return;
            }
        }

        books[bookCount] = title;
        isBorrowed[bookCount] = false;
        bookCount++;
        System.out.println("Book added successfully!");
    }

    // .......... search for a book..............
    public static void searchBook(Scanner scanner) {
        System.out.print("Enter book title to search: ");
        String title = scanner.nextLine();
        boolean found = false;

        for (int i = 0; i < bookCount; i++) {
            if (books[i].equalsIgnoreCase(title)) {
                System.out.println("Book found: " + books[i] + (isBorrowed[i] ? " (Borrowed)" : " (Available)"));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book not found.");
        }
    }

    // ................ borrow a book...........
    public static void borrowBook(Scanner scanner) {
        System.out.print("Enter book title to borrow: ");
        String title = scanner.nextLine();
        boolean found = false;

        for (int i = 0; i < bookCount; i++) {
            if (books[i].equalsIgnoreCase(title)) {
                if (!isBorrowed[i]) {
                    isBorrowed[i] = true;
                    System.out.println("You have borrowed: " + books[i]);
                } else {
                    System.out.println("Sorry, this book is already borrowed.");
                }
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book not found.");
        }
    }

    // ..........view all books.......
    public static void viewBooks() {
        if (bookCount == 0) {
            System.out.println("No books available in the library.");
            return;
        }

        System.out.println("\nBooks in Library:");
        for (int i = 0; i < bookCount; i++) {
            System.out.println((i + 1) + ". " + books[i] + (isBorrowed[i] ? " (Borrowed)" : " (Available)"));
        }
    }
}

