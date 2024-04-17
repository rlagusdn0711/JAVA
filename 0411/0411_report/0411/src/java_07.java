
public class java_07 extends Point{
	private int z;
	public java_07(int x, int y, int z){
		super(x, y);
		this.z = z;
	}
	public void moveUp() {
		this.z++;
	}
	public void moveDown() {
		this.z--;
	}
	public void move(int x, int y) {
		main(x, y);
	}
	public void move(int x, int y, int z) {
		main(x, y);
		this.z = z;
	}
	public String toString() {
		return "(" + super.getX() + ", " + super.getY() + ", " + this.z +")의 점";
	}
	public static void main(String[] args) {
		java_07 p = new java_07(1, 2, 3);
		System.out.println(p.toString() + "입니다.");
		
		p.moveUp();
		System.out.println(p.toString() + "입니다.");
		p.moveDown();
		p.move(10, 10);
		System.out.println(p.toString() + "입니다.");
		
		p.move(100, 200, 300);
		System.out.println(p.toString() + "입니다.");
	}
}
