import java.util.Scanner;

public class java_12_2 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("연산>>");
		int num1=scanner.nextInt();
		String op=scanner.next();
		int num2=scanner.nextInt();
		int res=0;
		switch(op) {
			case "+":
				res=num1+num2;
				break;
			case "-":
				res=num1*num2;
				break;
			case "*":
				res=num1*num2;
				break;
			case "/":
				res=num1/num2;
				break;
		}
		System.out.print(num1+op+num2+"의 계산결과는 "+res);
	}
}
