package LibraryCatlog;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class SearchBooks {
    public void showBooks() {
        if (LibraryCatlogSystem.listofbooks.isEmpty()) {
            System.out.println("No Books...!!!");
        } else {
            for (String[] books : LibraryCatlogSystem.listofbooks) {
                System.out.println("BOOK: " + books[0] + " AUTHOR: " + books[1]);
            }
        }
    }
}

class AddBooks {
    
    public void addBook(Scanner reads) {
        System.out.println("\nENTER NUMBER OF BOOKS TO ADD:");
        int number = reads.nextInt();
        reads.nextLine(); 

        for (int i = 0; i < number; i++) {
            System.out.println("\nENTER BOOK NAME:");
            String bookName = reads.nextLine();
            System.out.println("\nENTER AUTHOR NAME:");
            String authorName = reads.nextLine();

            LibraryCatlogSystem.listofbooks.add(new String[] { bookName, authorName });
            System.out.println("\nSUCCESSFULLY ADDED BOOK " + (i + 1));
        }
    }
}

class Searching {
   
    public void searchAuthor(Scanner reads) {
        System.out.println("\nENTER AUTHOR NAME:");
        String authorName = reads.nextLine();
        boolean found = false;

        for (String[] books : LibraryCatlogSystem.listofbooks) {
            if (books[1].equalsIgnoreCase(authorName)) { 
                System.out.println("BOOK: " + books[0] + " AUTHOR: " + books[1]);
                found = true;
            }
        }
        if (found) {
            System.out.println("Successfully found...!!!");
        } else {
            System.out.println("Author " + authorName + " Is Not Found...");
        }
    }

    
    public void searchBook(Scanner reads) {
        System.out.println("\nENTER BOOK NAME:");
        String bookName = reads.nextLine();
        boolean found = false;

        for (String[] books : LibraryCatlogSystem.listofbooks) {
            if (books[0].equalsIgnoreCase(bookName)) { 
                System.out.println("BOOK: " + books[0] + " AUTHOR: " + books[1]);
                found = true;
            }
        }
        if (found) {
            System.out.println("Successfully found...!!!");
        } else {
            System.out.println("Book " + bookName + " Is Not Found...");
        }
    }
}

public class LibraryCatlogSystem {
    public static List<String[]> listofbooks = new ArrayList<>();

    public static void main(String[] args) {
        Scanner reads = new Scanner(System.in);
        boolean cond = true;
        System.out.println("---------------------------------------------------");
        System.out.println("\nWELCOME TO LIBRARY CATALOG SYSTEM");

        while (cond) {
            System.out.println("\n1: Show Books");
            System.out.println("2: Add Books");
            System.out.println("3: Search Book By Author Name");
            System.out.println("4: Search Book By Book Name");
            System.out.println("5: Exit");
            System.out.print("\nPLEASE ENTER YOUR CHOICE-->");

            int choice = reads.nextInt();
            reads.nextLine(); 
            System.out.println("---------------------------------------------------");

            switch (choice) {
                case 1:
                    SearchBooks obj = new SearchBooks();
                    System.out.println("\nTHE LIST OF BOOKS WE HAVE:");
                    obj.showBooks();
                    break;
                case 2:
                    AddBooks obj1 = new AddBooks();
                    obj1.addBook(reads);
                    break;
                case 3:
                    Searching obj2 = new Searching();
                    obj2.searchAuthor(reads);
                    break;
                case 4:
                    Searching obj3 = new Searching();
                    obj3.searchBook(reads);
                    break;
                case 5:
                    cond = false;
                    System.out.println("\nExiting the system. Goodbye!");
                    break;
                default:
                    System.out.println("\nINVALID CHOICE, PLEASE ENTER A VALID OPTION...");
                    break;
            }
            System.out.println("-------------------------------------------------------");
        }

        reads.close(); 
    }
}
