package equacao.segundo.grau;

public abstract class PolinomioGrau2 {
	private double a;
	private double b;
	private double c;
	
	public PolinomioGrau2() {
		
	}
	public PolinomioGrau2(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	
	public abstract double formulaBaskara();
	public abstract double raizX1();
	public abstract double raizX2();
}
