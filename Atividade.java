package Atividade;

import java.util.Scanner;
public class Atividade {
	public static void main(String[] args) {
		Scanner scaneia = new Scanner(System.in);
		System.out.println("Informe o nome do aluno referente ao cálculo da média de suas notas:");
		String nome=scaneia.nextLine();
		System.out.println("Informe a nota do(a) "+nome+",obtida no primeiro bimestre:");
		double nota1=scaneia.nextDouble();
		System.out.println("Agora informe a nota do(a) "+nome+",obtida no segundo bimestre:");
		double nota2=scaneia.nextDouble();
		double Media=nota1*2 + nota2*3 /5;
		System.out.println("                RESULTADO");
		System.out.println("A média do aluno(a) "+nome+",foi de:"+Media);
		

	}

}
