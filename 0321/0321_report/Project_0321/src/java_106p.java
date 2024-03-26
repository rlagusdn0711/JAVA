import java.util.Scanner;

public class java_106p {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요.");
		System.out.print("철수 >> ");
		String name_s=scanner.next();
		System.out.print("영희 >> ");
		String name_y=scanner.next();
		
		if(name_s.equals("가위")&&name_y.equals("가위")) {
			System.out.println("무승부입니다");
		}
		else if(name_s.equals("가위")&&name_y.equals("바위")) {
			System.out.println("영희가 이겻습니다");
		}
		else if(name_s.equals("가위")&&name_y.equals("보")) {
			System.out.println("철수가 이겻습니다");
		}
		else if(name_s.equals("보")&&name_y.equals("가위")) {
			System.out.println("영희가 이겻습니다");
		}
		else if(name_s.equals("보")&&name_y.equals("바위")) {
			System.out.println("철수가 이겻습니다");
		}
		else if(name_s.equals("보")&&name_y.equals("보")) {
			System.out.println("무승부입니다");
		}
		else if(name_s.equals("바위")&&name_y.equals("가위")) {
			System.out.println("철수가 이겻습니다");
		}
		else if(name_s.equals("바위")&&name_y.equals("바위")) {
			System.out.println("무승부입니다");
		}
		else if(name_s.equals("바위")&&name_y.equals("보")) {
			System.out.println("영희가 이겻습니다");
		}
		
	}
}
