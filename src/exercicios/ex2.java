package exercicios;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] dado = new int [10];
		double media,soma=0;
		int maior=0;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite os valores do Dado: ");
		for (int i=0; i<dado.length;i++)
		{
			System.out.println((i+1) + "° Valor: ");
			dado[i]= leia.nextInt();
			while (1>dado[i] || 6<dado[i])
			{
				System.out.println("Valor inválido. Digite outro valor: ");
				dado[i]=leia.nextInt();
			}
			if (dado[i]==6)
			{
				maior++;
			}
			soma=soma+dado[i];
		}
		media=soma/dado.length;
		System.out.println("Resultados dos lançamentos: ");
		for (int i=0; i<dado.length;i++)
		{
			System.out.print(dado[i]+" | ");
		}
		System.out.printf("\nMédia= %.2f", media);
		System.out.println("\nOcorrencias da maior pontuação: " + maior);
		leia.close();
	}

}
