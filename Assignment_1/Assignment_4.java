//D)Write a program to accept names from the user and sort in alphabetical order using bubble sort 
//-	Accept n name									
//-	Bubble sort Function							
//-	Display	

package New_Assignment;

public class Assignment_4 {

	 public static void bubbleSort(String[] names) {
	        int n = names.length;
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {

	                if (names[j].compareTo(names[j + 1]) > 0) {

	                    String temp = names[j];
	                    names[j] = names[j + 1];
	                    names[j + 1] = temp;
	                }
	            }
	        }
	 }
}
