package module2._09analysis;

public class E03NestedLoops {

	//Exercise 3: How many stars will print? Figure it out on
	//paper before running the code.
	public static void main(String[] args) {
		for (int row = 0; row < 5; row++) {
			for (int col = 0; col < 10; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

