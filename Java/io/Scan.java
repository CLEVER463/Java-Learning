import java.util.Scanner;
class Scan{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String a = scanner.next(); //String
		int b = scanner.nextInt(); //int
		double c = scanner.nextDouble(); //double
		System.out.printf("\n%s\n%d\n%f",a,b,c);
	}
}