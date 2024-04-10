import java.util.Scanner;

class Add{
	private int a;
	private int b;
	
	public void setValue(int x, int y) {
		a = x;
		b = y;
	}
	public int calculate() {
		return a + b;
	}
}
class Sub{
	private int a;
	private int b;
	
	public void setValue(int x, int y) {
		a = x;
		b = y;
	}
	public int calculate() {
		return a - b;
	}
}
class Mul{
	private int a;
	private int b;
	
	public void setValue(int x, int y) {
		a = x;
		b = y;
	}
	public int calculate() {
		return a * b;
	}
}
class Div{
	private int a;
	private int b;
	
	public void setValue(int x, int y) {
		a = x;
		b = y;
	}
	public int calculate() {
		return a / b;
	}
}
public class java_11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오 >> ");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		String operator = scanner.next();
		
		if(operator.equals("+")) {
			Add add = new Add();
			add.setValue(x, y);
			System.out.println(add.calculate());
		}
		else if(operator.equals("-")) {
			Sub sub = new Sub();
			sub.setValue(x, y);
			System.out.println(sub.calculate());
		}
		else if(operator.equals("*")) {
			Mul mul = new Mul();
			mul.setValue(x, y);
			System.out.println(mul.calculate());
		}
		else if(operator.equals("/")) {
			Div div = new Div();
			div.setValue(x, y);
			System.out.println(div.calculate());
		}
		scanner.close();
	}
}
