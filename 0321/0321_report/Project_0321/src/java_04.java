import java.util.Scanner;

public class java_04 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int a,b,c;
		System.out.println("정수 3개 입력>>");
		a=scanner.nextInt();
		b=scanner.nextInt();
		c=scanner.nextInt();
		if(a<b && b<c ||c<b&&b<a) {
			System.out.print("중간 값은"+b);
		}
		if(b<a && a<c||c<a&&a<b) {
			System.out.print("중간 값은"+a);
		}
		else {
			System.out.print("중간 값은"+c);
		}
	}

}
