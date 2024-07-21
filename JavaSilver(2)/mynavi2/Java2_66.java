package mynavi2;

public class Java2_66 {
	String name;
	public Java2_66(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Java2_66[] items = new Java2_66[3];
		items[0] = new Java2_66("Z");
		items[1] = new Java2_66("A");
		items[2] = new Java2_66("B");
		for(Java2_66 item:items) {
			System.out.println(item.name);
		}
	}

}
