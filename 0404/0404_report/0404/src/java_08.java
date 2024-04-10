import java.util.Scanner;

class Phone{
	private String name;
	private String tel;
	
	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
}
public class java_08 {
	public static void main(String[] args) {
		boolean condition = true;
		Scanner scanner = new Scanner(System.in);
		System.out.print("인원수 >> ");
		int cnt = scanner.nextInt();
		Phone phone[] = new Phone[cnt];
		
		for(int i = 0; i < phone.length; i++) {
			System.out.print("이름과 전화번호(이름과 전화번호는 빈칸 없이 입력) >> ");
			String name = scanner.next();
			String tel = scanner.nextLine();
			phone[i] = new Phone(name, tel);
		}
		System.out.println("저장되었습니다...");
		while(true) {
			System.out.print("검색할 이름을 입력하세요 >> ");
			String searchName = scanner.nextLine();
			if(searchName.equals("그만")) 
				break;
			for(int i = 0; i < phone.length; i++) {
				if(phone[i].getName().equals(searchName)) {
					System.out.println(searchName + "의 번호는 " + phone[i].getTel() + "입니다.");
					condition = false;
					break;
				}
				else if(i == 2 && condition) System.out.println(searchName + "이 없습니다.");
			}
		}
		scanner.close();
	}
}
