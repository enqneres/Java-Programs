package exercicios_estrutura_Sequencial;

import java.util.Scanner;

public class operacaoDiferenca {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		int Diferenca = (A * B - C * D);
		
		System.out.println("DIFERENCA: " + Diferenca);		
		
		sc.close();

	}
}
