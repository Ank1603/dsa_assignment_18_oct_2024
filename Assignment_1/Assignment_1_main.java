package New_Assignment;

import java.util.Scanner;

public class Assignment_1_main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Assignment_1 bst = new Assignment_1();
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Create a Binary Search Tree");
            System.out.println("2. Preorder Traversal");
            System.out.println("3. Postorder Traversal");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number to insert: ");
                    int value = sc.nextInt();
                    bst.insert(value);
                    System.out.println("Inserted " + value);
                    break;
                case 2:
                    System.out.println("Preorder Traversal:");
                    bst.postorder();
                    break;
                case 3:
                    System.out.println("Postorder Traversal:");
                    bst.preorder();
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


