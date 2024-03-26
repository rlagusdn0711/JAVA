import java.util.Scanner;

public class java_06 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("1~99 사이의 정수를 입력하시오>>");	
		int num=scanner.nextInt();
		
		if(num!=0 && num>=1 && num <=99) {
			int a,b;
			a=num/10;
			b=num%10;
			
			if((a==3 || a==6 || a==9) && (b==3 || b==6 || b==9)) {
				System.out.println("박수짝짝");	
			}else if((a==3 || a==6 || a==9) || (b==3 || b==6 || b==9)) {
				System.out.println("박수짝");	}
			}
	}
}
