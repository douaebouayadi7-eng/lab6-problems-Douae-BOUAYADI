package problem3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scan.nextInt();
        scan.nextLine();
        Library lib = new Library(n);
        lib.add(new Novel("Germinal", "Zola", 500, 9.9));
        lib.add(new Magazine("Science", "May", 2026));
        int choice;
        do {
            System.out.println();
            System.out.println("1. Add a document");
            System.out.println("2. Display documents");
            System.out.println("3. Delete a document");
            System.out.println("4. Find a document");
            System.out.println("5. Display authors");
            System.out.println("0. Exit");
            System.out.print("Choice: ");
            choice = scan.nextInt();
            scan.nextLine();

            if (choice == 1) {
                System.out.println("Type: 1 Novel, 2 Textbook, 3 Magazine, 4 Dictionary");
                int type = scan.nextInt();
                scan.nextLine();
                System.out.print("Title: ");
                String title = scan.nextLine();
                Document doc = null;

                if (type == 1 || type == 2) {
                    System.out.print("Author: ");
                    String author = scan.nextLine();
                    System.out.print("Pages: ");
                    int pages = scan.nextInt();
                    scan.nextLine();
                    if (type == 1) {
                        System.out.print("Price: ");
                        double price = scan.nextDouble();
                        scan.nextLine();
                        doc = new Novel(title, author, pages, price);
                    } else {
                        System.out.print("Level: ");
                        String level = scan.nextLine();
                        doc = new Textbook(title, author, pages, level);
                    }
                } else if (type == 3) {
                    System.out.print("Month: ");
                    String month = scan.nextLine();
                    System.out.print("Year: ");
                    int year = scan.nextInt();
                    scan.nextLine();
                    doc = new Magazine(title, month, year);
                } else if (type == 4) {
                    System.out.print("Language: ");
                    String language = scan.nextLine();
                    doc = new Dictionary(title, language);
                }

                if (doc != null && lib.add(doc)) {
                    System.out.println("Document added.");
                } else {
                    System.out.println("Could not add the document.");
                }
            } else if (choice == 2) {
                lib.displayDocument();

            } else if (choice == 3) {
                System.out.print("Record number: ");
                int num = scan.nextInt();
                scan.nextLine();
                Document d = lib.document(num);
                if (d != null && lib.delete(d)) {
                    System.out.println("Document deleted.");
                } else {
                    System.out.println("Document not found.");
                }
            } else if (choice == 4) {
                System.out.print("Record number: ");
                int num = scan.nextInt();
                scan.nextLine();
                Document d = lib.document(num);
                if (d != null) {
                    System.out.println(d);
                } else {
                    System.out.println("Document not found.");
                }
            } else if (choice == 5) {
                lib.displayAuthors();
            } else if (choice != 0) {
                System.out.println("Invalid choice.");
            }
        } while (choice != 0);
        scan.close();
    }
}


