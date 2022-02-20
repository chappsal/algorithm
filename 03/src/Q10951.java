import java.util.Scanner;

public class Q10951 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String tmp = sc.next();
		int sum=0;
		
		for(int i=0; i<n; i++) {
			sum += tmp.charAt(i)-'0';
		}
		System.out.println(sum);
	}

}
