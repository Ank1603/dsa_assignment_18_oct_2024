package New_Assignment;

import java.util.Scanner;

public class Assignment_4_main {
public static void main(String args[]) {
	  Scanner sc = new Scanner(System.in);

      System.out.print("Enter the number of names: ");
      int n = sc.nextInt();
      sc.nextLine();
      String[] name = new String[n];

      System.out.println("Enter " + n + " names:");
      for (int i = 0; i < n; i++) {
          name[i] = sc.nextLine();
      }
      System.out.println("Sorted names:");
      for (String name1 : name) {
          System.out.println(name1);
      }

  }


}
