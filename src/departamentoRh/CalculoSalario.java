package departamentoRh;

import java.util.Scanner;

public class CalculoSalario {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Olá, vamos calcular o Sálario");
        
        System.out.print("Digite o salário bruto: ");
        double salarioBruto = sc.nextDouble();

        System.out.print("Digite o número de dependentes: ");
        int dependentes = sc.nextInt();

        System.out.print("Digite o tipo do plano de saúde (Básico ou Avançado): ");
        String planoSaude = sc.next();

        System.out.print("Utiliza vale transporte? (sim ou não): ");
        boolean usaValeTransporte = sc.next().equalsIgnoreCase("sim");

        System.out.print("Utiliza vale alimentação? (sim ou não): ");
        boolean usaValeAlimentacao = sc.next().equalsIgnoreCase("sim");
        
        System.out.println("Utiliza vale refeição? (sim ou não): ");
        boolean usaValeRefeicao = sc.next().equalsIgnoreCase("sim");
        
   

        // Cálculo do Vale Transporte
        double descontoValeTransporte = usaValeTransporte ? salarioBruto * 0.06 : 0;

        // Cálculo do Vale Alimentação
        double descontoValeAlimentacao = usaValeAlimentacao ? 200.00 : 0;

        // Cálculo do Vale Refeição
        double descontoValeRefeicao = usaValeRefeicao ? 250.00 : 0;
        
        
        //double descontoINSS = calcularINSS(salarioBruto);

        // Cálculo do IR
        //double descontoIR = calcularIR(salarioBruto, dependentes);
        
        
        

        System.out.println(descontoValeTransporte);
        System.out.println(descontoValeAlimentacao);
        System.out.println(descontoValeRefeicao);

        
    }
}
