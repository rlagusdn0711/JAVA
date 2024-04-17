class Oval implements Shape{
	private int width, height;
	
	public Oval(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public void draw() {
		System.out.println(width + "x" + height + "에 내접하는 타원입니다.");
	}
	public double getArea() {
		return width * height * PI;
	}	
}
class Rect implements Shape{
	private int width, height;
	
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public void draw() {
		System.out.println(width + "x" + height + "에 내접하는 사각형입니다.");
	}
	public double getArea() {
		return width * height;
	}
}
public class java_14 {
	static public void main(String[] args) {
		Shape[] list = new Shape[3];
		list[0] = new java_13(10);
		list[1] = new Oval(20, 30);
		list[2] = new Rect(10, 40);
		
		for(int i = 0; i < list.length; i++) list[i].redraw();
		for(int i = 0; i < list.length; i++) System.out.println("면적은 " + list[i].getArea());
	}
}
