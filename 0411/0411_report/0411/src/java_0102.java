class TV{
	private int size;
	public TV(int size) {this.size = size;}
	protected int getSize() {return size;}
}
class ColorTV extends TV{
	private int color;
	public ColorTV(int size, int color){
		super(size);
		this.color = color;
	}
	public void printProperty() {
		System.out.println(super.getSize() + "인치 " + color + "컬러");
	}
}
public class java_0102 extends ColorTV {
	private String address;
	public java_0102(String address, int size, int color) {
		super(size, color);
		this.address = address;
	}
	public void printProperty() {
		System.out.print("나의 IPTV는 " + address + " 주소의 ");
		super.printProperty();
	}
	public static void main(String[] args) {
		java_0102 iptv = new java_0102("192.1.1.2", 32, 2048);
		iptv.printProperty();
	}
}
