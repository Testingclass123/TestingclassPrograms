package javaprogram;

public class mainover {

	public static void main(String[] args) {
		main("Java");
		main();

	}
	
	public static void main(String ar) {
		System.out.println("Main with String param s="+ar);
	}

	public static void main() {
		System.out.println("Main with no param");
	}
}
