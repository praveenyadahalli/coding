package basicProblems;

// A number should be equals to sum of cubes of it's digits called Armstrong number.
// Ex. 153,371
public class ArmStrongNumber {

	public static void main(String[] args) {
		System.out.println(checkNumber(12));
	}

	static boolean checkNumber(int n) {
		int temp = n, r;
		int sum = 0;
		while (n > 0) {
			r = n % 10;
			sum += r * r * r;
			n = n / 10;
		}
		if (temp == sum) {
			return true;
		}
		return false;
	}

}
