package exercicios;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [][] N1 = new double [4][6];
		double [][] N2 = new double [4][6];
		double [][] M1 = new double [4][6];
		double [][] M2 = new double [4][6];
		int l,c;
		Scanner leia = new Scanner (System.in);
		System.out.println("Valores da matriz N1: ");
		for ( l=0; l<N1.length; l++)
		{
			for ( c=0; c<N1[l].length; c++)
			{
				System.out.printf("\nN1[%d][%d]: " ,(l+1) ,(c+1));
				N1[l][c]=leia.nextDouble();
			}
		}
		System.out.println("Valores da matriz N2: ");
		for ( l=0; l<N2.length; l++)
		{
			for ( c=0; c<N2[l].length; c++)
			{
				System.out.printf("\nN2[%d][%d]: " ,(l+1) ,(c+1));
				N2[l][c]=leia.nextDouble();
			}
		}
		for ( l=0; l<M1.length; l++)
		{
			for ( c=0; c<M1[l].length; c++)
			{
				M1[l][c]=N1[l][c]+N2[l][c];
				M2[l][c]=N1[l][c]-N2[l][c];
			}
		}
		System.out.println("\nM1:");
		for (l=0; l<M1.length; l++)
		{
			for (c=0; c<M1[l].length; c++)
			{
				System.out.print(M1[l][c]+ " | ");
			}
			System.out.println();
		}
		System.out.println("\nM2:");
		for (l=0; l<M2.length; l++)
		{
			for (c=0; c<M2[l].length; c++)
			{
				System.out.print(M2[l][c]+ " | ");
			}
			System.out.println();
			leia.close();
		}
	}

}
