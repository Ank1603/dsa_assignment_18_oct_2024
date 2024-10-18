package New_Assignment;

import java.util.Scanner;

public class Assignment_2_main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Assignment_2 a = new Assignment_2();
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Create a Binary Search Tree");
            System.out.println("2. Display BST");
            System.out.println("3. Delete an element from BST");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number to insert: ");
                    int value = sc.nextInt();
                    a.insert(value);
                    System.out.println("Inserted " + value);
                    break;
                case 2:
                    System.out.println("BST Inorder Traversal:");
                    a.display();
                    break;
                case 3:
                    System.out.print("Enter a number to delete: ");
                    int deleteValue = sc.nextInt();
                    a.delete(deleteValue);
                    System.out.println("Deleted " + deleteValue);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);
    }
}

