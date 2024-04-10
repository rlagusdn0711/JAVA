package report_0404;

import java.util.Scanner;

class Player{
	String name,word;
	
	Player(String str){
		name=str;
	}
	
	void getWordFromUser() {
		Scanner scanner=new Scanner(System.in);
		System.out.println(name+">>");
		word=scanner.next();
	}
	boolean checkSuccess(String str) {
		if(str.charAt(str.length()-1)==word.charAt(0)) {
			return true;
		}
		return false;
	}
}

public class java_oc {
	
	int people;
	Player p[];
	String cur;
	
	java_oc(){
		cur="아버지";
	}
	
	void run() {
		System.out.println("끝말잇기 게임을 시작합니다.");
		System.out.print("게임에 참가하는 인원은 몇명입니까>>");
		Scanner scanner=new Scanner(System.in);
		people=scanner.nextInt();
		p=new Player[people];
		for(int i=0;i<people;i++) {
			String str;
			System.out.print("참가자의 이름을 입력하세요>>");
			str=scanner.next();
			p[i]=new Player(str);
		}
		System.out.println("시작하는 단어는 아버지입니다.");
		int idx=0;
		while(true) {
			p[idx].getWordFromUser();
			if(p[idx].checkSuccess(cur)) {
				cur=p[idx].word;
			}
			else {
				System.out.println(p[idx].name+"이 졌습니다.");
				break;
			}
			idx= (idx+1)%people;
		}
	}
	
	public static void main(String[] args) {
		java_oc game=new java_oc();
		game.run();
	}

}
