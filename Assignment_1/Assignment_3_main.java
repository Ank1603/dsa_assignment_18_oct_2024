package New_Assignment;
import java.util.Scanner;

public class Assignment_3_main {
		 public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        Assignment_3 bst = new Assignment_3();
		        System.out.print("Enter the element to add into Binray Search Tree : ");
		        int n = sc.nextInt();
		        System.out.println("Enter " + n + " integer:");
		        for (int i = 0; i < n; i++) {
		            int value = sc.nextInt();
		            bst.insert(value);
	
		        }
		        System.out.println("Order traversal of the Binary Search Tree :");
		        bst.levelOrder();
		    }
		}


