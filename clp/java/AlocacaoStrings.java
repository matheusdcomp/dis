package clp.java;

public class AlocacaoStrings {

	public static void main(String[] args) {

		String a = "ABC";
		System.out.println(System.identityHashCode(a));

		String b = "ABC";
		System.out.println(System.identityHashCode(b));

		a += "D";
		System.out.println(System.identityHashCode(a));

		StringBuffer c = new StringBuffer("ABC");
		System.out.println(System.identityHashCode(c));

		c.append("D");
		System.out.println(System.identityHashCode(c));

	}

}
