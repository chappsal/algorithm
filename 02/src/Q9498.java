import java.util.Scanner;

public class Q9498 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		String grade=null;
		
		if(90<=num) grade="A";
		else if(80<=num) grade="B";
		else if(70<=num) grade="C";
		else if(60<=num) grade="D";
		else grade="F";
		
		System.out.println(grade);
		
	}
}