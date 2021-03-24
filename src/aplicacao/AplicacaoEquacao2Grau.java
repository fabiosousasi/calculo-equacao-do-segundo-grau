package aplicacao;

import java.util.Scanner;

import equacao.segundo.grau.EquacaoDoSegundoGrau;

public class AplicacaoEquacao2Grau {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EquacaoDoSegundoGrau equacao = new EquacaoDoSegundoGrau();
		
		System.out.println("EQUA��O DE 2 GRAU");
		
		//entrada do valor de a
		System.out.print("Informe o valor de a: ");
		double a = sc.nextDouble();
		//aplica��o da condi��o de a
		while(equacao.condicaoDeA(a) == false) {
			a = sc.nextDouble();
		}
		
		//entrada do valor de b
		System.out.print("\nInforme o valor de b: ");
		double b = sc.nextDouble();
		//aplica��o da condi��o de b
		while(equacao.condicaoDeB(b) == false) {
			b = sc.nextDouble();
		}
		
		//entrada do valor de b
		System.out.print("\nInforme o valor de c: ");
		double c = sc.nextDouble();
		//aplica��o da condi��o de b
		while(equacao.condicaoDeC(c) == false) {
			c = sc.nextDouble();
		}
		equacao = new EquacaoDoSegundoGrau(a, b, c);
		
		//APLICA��O DA FORMULA DE BASKARA
		System.out.println("Aplicando a formula de baskara:");
		System.out.println("Resultado do delta: " + equacao.formulaBaskara());
		
		System.out.println("Resultado da ra�z do delta: " + equacao.raizDelta());
		
		//RESULTADO DAS RAIZ X1 E X2
		System.out.print("\nResultado do x1: ");
		System.out.println(equacao.raizX1());
		System.out.print("Resultado do x2: ");
		System.out.println(equacao.raizX2());
	}

}
