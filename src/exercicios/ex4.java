package exercicios;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);
		double [][] m = new double	[3][3];
		double st=0,sd=0;
		System.out.println("Valores da Matriz X: ");
		for (int l=0; l< m.length; l++)
		{
			for (int c=0; c<m[l].length; c++)
			{
				System.out.printf("X[%d][%d]: ",(l+1),(c+1));
				m[l][c]= leia.nextDouble();
				st=st+m[l][c];
				if (l==c)
				{
					sd=sd+m[l][c];
				}
			}
		}
		System.out.println("Matriz X: ");
		for (int l=0; l<m.length; l++)
		{
			for (int c=0; c<m[l].length;c++)
			{
				System.out.print(m[l][c] + " | ");
			}
			System.out.println();
		}
		System.out.println("Soma dos Valores: " + st);
		System.out.println("Soma da diagonal principal: "+sd);
		leia.close();
		

	}

}
