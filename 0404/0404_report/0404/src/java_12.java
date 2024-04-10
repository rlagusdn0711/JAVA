import java.util.Scanner;

class Sits{
	private String sit;
	
	public Sits() {
		sit = "---";
	}
	public String getSit() {
		return sit;
	}
	public void setSit(String name) {
		sit = name;
	}
}
class Line{
	Sits sits[] = new Sits[10];
	
	public Line() {
		for(int i = 0; i < sits.length; i++) {
			sits[i] = new Sits();
		}
	}
	public void show() {
		for(int i = 0; i < sits.length; i++) {
			System.out.print(sits[i].getSit() + " ");
		}
		System.out.println();
	}
	public void booking(String name, int num) {
		sits[num - 1].setSit(name);
	}
	public void cancelBooking(String name) {
		for(int i = 0; i < sits.length; i++) {
			if(sits[i].getSit().equals(name))
				sits[i].setSit("---");
		}
	}
}
public class java_12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean condition = true;
		System.out.println("명품콘서트홀 예약 시스템입니다.");
		Line S = new Line();
		Line A = new Line();
		Line B = new Line();
		while(condition) {
			System.out.print("예약 : 1, 조회 : 2, 취소 : 3, 끝내기 : 4 >> ");
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch(choice) {
			case 1:
				System.out.print("좌석구분 S(1), A(2), B(3) >> ");
				int sit = scanner.nextInt();
				scanner.nextLine();
				switch(sit){
					case 1:
						System.out.print("S >> ");
						S.show();
						System.out.print("이름 >> ");
						String name = scanner.nextLine();
						System.out.print("번호 >> ");
						int num = scanner.nextInt();
						scanner.nextLine();
						S.booking(name, num);
						break;
					case 2:
						System.out.print("A >> ");
						A.show();
						System.out.print("이름 >> ");
						name = scanner.nextLine();
						System.out.print("번호 >> ");
						num = scanner.nextInt();
						scanner.nextLine();
						A.booking(name, num);
						break;
					case 3:
						System.out.print("B >> ");
						B.show();
						System.out.print("이름 >> ");
						name = scanner.nextLine();
						System.out.print("번호 >> ");
						num = scanner.nextInt();
						scanner.nextLine();
						B.booking(name, num);
						break;
				}
				break;
			case 2:
				System.out.print("S >> ");
				S.show();
				System.out.print("A >> ");
				A.show();
				System.out.print("B >> ");
				B.show();
				System.out.println("<<조회를 완료하였습니다.>>");
				break;
			case 3:
				System.out.print("좌석 S(1), A(2), B(3) >> ");
				sit = scanner.nextInt();
				scanner.nextLine();
				switch(sit){
					case 1:
						System.out.print("S >> ");
						S.show();
						System.out.print("이름 >> ");
						String name = scanner.nextLine();
						S.cancelBooking(name);
						break;
					case 2:
						System.out.print("A >> ");
						A.show();
						System.out.print("이름 >> ");
						name = scanner.nextLine();
						A.cancelBooking(name);
						break;
					case 3:
						System.out.print("B >> ");
						B.show();
						System.out.print("이름 >> ");
						name = scanner.nextLine();
						B.cancelBooking(name);
						break;
				}
				break;
			case 4:
				condition = false;
				break;
			}
		}
		System.out.println("프로그램을 종료합니다...");
		scanner.close();
	}
}
