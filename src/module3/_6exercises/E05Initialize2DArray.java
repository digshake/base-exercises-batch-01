package module3._6exercises;

public class E05Initialize2DArray {
	//Exercise 5: Add code below to declare and initialize
	//a 2D array of Strings called students with
	//"Brice, Marvin, Anna" in the first row and 
	//"Kamal, Maria, Elissa" in the second.
	public static void main(String[] args) {
		// ADD CODE HERE //


		// Should print the values in students in order
		for (int row = 0; row < students.length; row++) {
			for (int col = 0; col < students[0].length; col++) {
				System.out.print(students[row][col] + " ");
			}
		}
	}
}

