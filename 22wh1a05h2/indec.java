package javaprograms;

public class indec {

	public static void main(String[] args) {
		String name = "java strings";
		char[] dst = new char [6];
		name.getChars(4, 9, dst, 0);
		System.out.println(dst);
		
	}

}
