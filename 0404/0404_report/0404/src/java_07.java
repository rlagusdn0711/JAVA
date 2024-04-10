import java.util.Scanner;

class Day{
	private String work;
	public void set(String work) {this.work = work;}
	public String get() {return work;}
	public void show() {
		if(work == null) System.out.println("없습니다.");
		else System.out.println(work + "입니다.");
	}
}
public class java_07 {
Day day[] = new Day[30];
	
	public java_07() {
		System.out.println("이번달 스케쥴 관리 프로그램.");
		for(int i = 0; i < day.length; i++) {
			day[i] = new Day();
		}
	}
	public void input(int date, String todo) {
		day[date].set(todo);
	}
	public void view(int date) {
		System.out.println(day[date].get());
	}
	public boolean finish() {
		System.out.println("시스템을 종료합니다.");
		return false;
	}
	public void run() {
		System.out.print("할일(입력 : 1, 보기 : 2, 끝내기 : 3) >> ");
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		java_07 monthSchedule = new java_07();
		boolean condition = true;
		while(condition) {
			monthSchedule.run();
			int choice = scanner.nextInt();
			switch(choice) {
			case 1:
				System.out.print("날짜(1~30)?");
				int date = scanner.nextInt();
				scanner.nextLine();
				System.out.print("할일(빈칸없이입력)?");
				String todo = scanner.nextLine();
				monthSchedule.input(date, todo);
				break;
			case 2:
				System.out.print("날짜(1~30)?");
				date = scanner.nextInt();
				monthSchedule.view(date);
				break;
			case 3:
				condition = monthSchedule.finish();
				break;
			}
		}
		scanner.close();
	}
}
