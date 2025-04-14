package desafio_fiama;

import java.util.Scanner;

public class CalculoSalario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("  Olá, vamos calcular seu Sálario! ");
		
		System.out.println(" Informe o Sálario Bruto: ");
		double salarioBruto = sc.nextDouble();
		
		System.out.println(" Informe o número de dependentes: ");
		int dependentes = sc.nextInt();
		
		sc.nextLine();
			
		System.out.println("Informe o Plano de Saúde: (B para Básico, A para Avançado ou N para Nenhum): ");
		char planoSaude = sc.nextLine().toUpperCase().charAt(0);
		
		System.out.println(" Usa Vale Transporte? (digite: S para Sim ou N para Não): ");
		char vTransporte = sc.nextLine().toUpperCase().charAt(0);
		
		System.out.println(" Usa Vale Alimentação? (digite: S para Sim ou N para Não): ");
		char vAlimentacao = sc.nextLine().toUpperCase().charAt(0);
		
		System.out.println(" Usa Vale Refeição? (digite: S para Sim ou N para Não): ");
		char vRefeicao = sc.nextLine().toUpperCase().charAt(0);
		
		
		double descontoINSS;
		
		
		if (salarioBruto <= 1302.00) {
			descontoINSS = salarioBruto * 0.08;
		            
		} else if (salarioBruto <= 2571.00) {
			descontoINSS = salarioBruto * 0.09;
			
		} else if (salarioBruto <= 3856.00) {
			descontoINSS = salarioBruto * 0.11;
			
		} else {
			descontoINSS = salarioBruto * 0.14;
			if (descontoINSS > 570.88) {
				descontoINSS = 570.88;
			}	
		}
		
		
		double baseIR = salarioBruto - (dependentes * 189.59);
		double descontoIR;
		
		if (baseIR <= 1903.98) {
			descontoIR = 0;
			
		} else if (baseIR <= 2826.65) {
			descontoIR = (baseIR * 0.075) - 142.80;
			
		} else if (baseIR <= 3751.05) {
			descontoIR = (baseIR * 0.15) - 354.80;
			
		} else if (baseIR <= 4664.68) {
			descontoIR = (baseIR * 0.225) - 636.13;
			
		} else {
			descontoIR = (baseIR * 0.275) - 869.36;
		}
		
		double descontoVT = vTransporte = "S" ?  salarioBruto * 0.06 : 0;
		double descontoVA = vAlimentacao = "S" ? 200.0 : 0;
		double descontoVR = vRefeicao = "S" ? 250.00 : 0;
		double descontoPlano = 0;
		
		if (planoSaude = "B") {
			descontoPlano =  150.0;			
		} else if (planoSaude = "A") {
			descontoPlano = 300.0;			
		} else if ( planoSaude = "N") {
			descontoPlano = 0;
		} else {
			System.out.println("Digite uma das opções !");
		}
	
			
		
		System.out.printf(" Desconto do INSS é: R$ %.2f\n", descontoINSS);
		System.out.printf(" Salario base para IR é: R$ %.2f\n" , baseIR);		
		System.out.printf(" Desconto do IR é: R$ %.2f\n", descontoIR);
	    System.out.printf(" Desconto de Vale Transporte: R$ %.2f\n", descontoVT);
	    System.out.printf(" Desconto de Vale Alimentação: R$ %.2f\n", descontoVA);
	    System.out.printf(" Desconto de Vale Refeição: R$ %.2f\n", descontoVR);
	    System.out.printf(" Desconto do Plano de Saúde: R$ %.2f\n", descontoPlano);

		
		sc.close();

	}

}
