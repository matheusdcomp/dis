package classes.geometria;

public class Retangulo {

	private float l1;
	private float l2;
	
	public float getL1() {
		return l1;
	}
	
	public void setL1(float l1) {
		this.l1 = l1;
	}
	
	public float getL2() {
		return l2;
	}
	
	public void setL2(float l2) {
		this.l2 = l2;
	}
	
	public float area() {
		return l1 * l2;
	}
	
}

