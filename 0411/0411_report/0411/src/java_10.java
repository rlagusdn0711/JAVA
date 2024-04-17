abstract class PairMap{
	protected String keyArray[];
	protected String valueArray[];
	abstract String get(String key);
	abstract String delete(String key);
	abstract int length();
}
class Dictionary extends PairMap{
	private int size;
	private int pos = 0;
	
	public Dictionary() {}
	public Dictionary(int size) {
		this.size = size;
		keyArray = new String[size];
		valueArray = new String[size];
	}
	public void put(String name, String cLanguage) {
		boolean checking = true;
		if(pos != 0) {
			for(int i = 0; i < pos; i++) {
				if(keyArray[i].equals(name)) {
					valueArray[i] = cLanguage;
					checking = false;
					break;
				}
			}
		}
		if(checking) {
			keyArray[pos] = name;
			valueArray[pos] = cLanguage;
			pos++;
		}
	}
	public String get(String key) {
		for(int i = 0; i < size; i++) {
			if(keyArray[i].equals(key))
				return valueArray[i];
		}
		return "해당 사항  없음";		
	}
	public String delete(String key) {
		for(int i = 0; i < size; i++) {
			if(keyArray[i].equals(key))
				return valueArray[i] = null;
		}
		return "해당 사항 없음";
	}
	public int length() {
		return pos;
	}
}
public class java_10 extends Dictionary{
	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10);
		dic.put("황기태", "자바");
		dic.put("이재문", "파이썬");
		dic.put("이재문", "C++");
		System.out.println("이재문의 값은 " + dic.get("이재문"));
		System.out.println("황기태의 값은 " + dic.get("황기태"));
		dic.delete("황기태");
		System.out.println("황기태의 값은 " + dic.get("황기태"));
	}
}
