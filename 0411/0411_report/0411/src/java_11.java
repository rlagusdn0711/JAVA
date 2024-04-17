import java.util.Scanner;

abstract class Calc{
	protected int a;
	protected int b;
	abstract void setValue(int a, int b);
	abstract int calculate();
}
class Add extends Calc{
	public void setValue(int a, int b) {
		super.a = a;
		super.b = b;
	}
	public int calculate() {
		return a + b;
	}
}
class Sub extends Calc{
	public void setValue(int a, int b) {
		super.a = a;
		super.b = b;
	}
	public int calculate() {
		return a - b;
	}
}
class Mul extends Calc{
	public void setValue(int a, int b) {
		super.a = a;
		super.b = b;
	}
	public int calculate() {
		return a * b;
	}
}
class Div extends Calc{
	public void setValue(int a, int b) {
		super.a = a;
		super.b = b;
	}
	public int calculate() {
		return a / b;
	}
}
public class java_11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하세요 >> ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		String op = scanner.next();
		switch(op) {
		case "+":
			Add add = new Add();
			add.setValue(a, b);
			System.out.print(add.calculate());
			break;
		case "-":
			Sub sub = new Sub();
			sub.setValue(a, b);
			System.out.print(sub.calculate());
			break;
		case "*":
			Mul mul = new Mul();
			mul.setValue(a, b);
			System.out.print(mul.calculate());
			break;
		case "/":
			Div div = new Div();
			div.setValue(a, b);
			System.out.print(div.calculate());
			break;
		}
		scanner.close();
	}
}
