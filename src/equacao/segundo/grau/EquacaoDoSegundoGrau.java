package equacao.segundo.grau;

public class EquacaoDoSegundoGrau extends PolinomioGrau2 implements CondicaoEquacao2Grau{
	
	private double delta;
	
	
	public EquacaoDoSegundoGrau() {
	}

	public EquacaoDoSegundoGrau(double a, double b, double c) {
		super(a, b, c);
	}

	//METODOS PARA EXECUTAR A FORMULA DE BASKARA
	@Override
	public double formulaBaskara() {
		delta = Math.pow(super.getB(), 2) - (4 * super.getA() * super.getC());
		if(delta < 0) {
			System.out.println("Resultado indefinido!");
			System.exit(0);
		}
		return delta;
	}
	
	//METODOS PARA ENCONTRAR AS RAÍZES
	@Override
	public double raizX1() {
		double x1 = (-super.getB() + Math.sqrt(delta)) / (2 * super.getA());
		return x1;
	}

	@Override
	public double raizX2() {
		double x2 = (-super.getB() - Math.sqrt(delta)) / (2 * super.getA());
		return x2;
	}

	//METODOS PARA A CONDIÇÃO DO POLINOMIO
	@Override
	public boolean condicaoDeA(double a) {
		if(a == 0) {
			System.out.println("\nO valor de a tem que ser diferente de zero. Tente novamente.");
			System.out.print("Insira o valor de a: ");
			return false;
		}
		return true;
	}

	@Override
	public boolean condicaoDeB(double b) {
		if(b == 0) {
			System.out.println("\nO valor de b tem que ser diferente de zero. Tente novamente.");
			System.out.print("Insira o valor de b: ");
			return false;
		}
		return true;
	}

	@Override
	public boolean condicaoDeC(double c) {
		if(c == 0) {
			System.out.println("\nO valor de c tem que ser diferente de zero. Tente novamente.");
			System.out.print("Insira o valor de c: ");
			return false;
		}
		return true;
	}

}
