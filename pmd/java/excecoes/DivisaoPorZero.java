package excecoes;

public class DivisaoPorZero {

	public static void main(String[] args) {

		String s = "1,5";
		float f;
		try {
			f = Float.parseFloat(s);
		}
		catch (NumberFormatException e) {
			e.printStackTrace();
			f = -1f;
		}
	    System.out.println(f);
	}

}
