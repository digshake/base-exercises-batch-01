package module2._03elseif;

public class E02IfDebug {

	//Exercise 2: Use the debugger to see why this code isn't working
	//Fix the code by using else/if statements
	public static void main(String[] args) {
		int score = 93;
		String grade = "";

		if (score >= 90) {
			grade = "A";
		}
		if (score >= 80) {
			grade = "B";
		}
		if (score >= 70) {
			grade = "C";
		}
		if (score >= 60) {
			grade = "D";
		}
		else {
			grade = "F";
		}

		System.out.println(grade);
	}
}
