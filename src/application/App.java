package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class App {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		List<Pessoa> list = new ArrayList<Pessoa>();

		System.out.print("Enter the number of taxpayers: ");		
		int N = sc.nextInt();
		
		for (int i = 1; i <= N; i++) {
			System.out.println("Imposto #" + i + " data:");
			System.out.print("Pessoa Física ou Pessoa Jurídica (f/j)? ");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			String nome = sc.next();
			System.out.print("Renda Anual: ");
			Double rendaAnual = sc.nextDouble();
			if (type == 'f') {
				System.out.print("Gastos com saude: ");
				Double gastoSaude = sc.nextDouble();
				list.add(new PessoaFisica(nome, rendaAnual, gastoSaude));
			}
			else {
				System.out.print("Numero de funcionarios: ");
				Integer funcionarios = sc.nextInt();
				list.add(new PessoaJuridica(nome, rendaAnual, funcionarios));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		for (Pessoa tp : list) {
			System.out.println(tp.getNome() + ": $ " + String.format("%.2f", tp.calcImposto()));
		}
		
		System.out.println();
		double sum = 0.0;
		for (Pessoa tp : list) {
			sum += tp.calcImposto();
		}
		System.out.println("TOTAL DE TAXA: $ " + String.format("%.2f", sum));
		
		sc.close();
	}

}