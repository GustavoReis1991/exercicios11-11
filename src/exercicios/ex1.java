package exercicios;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);
		double [] pontuacao = new double [5];
		double maior=0;
		for (int i=0; i<pontuacao.length; i++)
		{
			System.out.println((i+1)+"� Pontua��o: ");
			pontuacao [i] = leia.nextDouble();
			if (pontuacao[i]>maior)
			{
				maior=pontuacao[i];
			}
		}
		System.out.println("\nPontua��es:");
		for (int i=0; i<pontuacao.length; i++)
		{
			System.out.print(pontuacao [i] + " | ");
		}
		System.out.printf("\n\nMaior Pontua��o: " + maior);
		leia.close();

	}

}
