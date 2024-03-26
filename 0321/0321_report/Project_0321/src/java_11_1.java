import java.util.Scanner;

public class java_11_1 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("달을 입력하세요(1~12)>>");
		int num=scanner.nextInt();
		if (num>=3 && num<=5)
			System.out.println("봄");
		else if(num>=6 && num<=8)
			System.out.println("여름");
		else if(num>=9 && num<=11)
		System.out.println("가을");
		else
			System.out.println("겨울");
	}
}
