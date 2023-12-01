
public class Lab11Prob01 {
	
	public static int recursiveAbstract(int n) {
		if (n == 0) {
			return 1;
		} if (n == 1) {
			return 3;
		} if (n == 2) {
			return 4;
		} else {
			return recursiveAbstract(n - 3) * (recursiveAbstract(n - 2) - recursiveAbstract(n - 1));
		}
	}
	
	public static void main(String[] args) {
		System.out.print(recursiveAbstract(6));
	}
}
