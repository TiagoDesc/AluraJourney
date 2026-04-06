package OOP_Java.Library;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the title of the book: ");
        String title = sc.nextLine();
        System.out.println("Enter the author of the book: ");
        String author = sc.nextLine();
        System.out.println("Enter the number of pages: ");
        int pages = sc.nextInt();

        Library library = new Library(title, author, pages);
        System.out.println(library);

    }

}
