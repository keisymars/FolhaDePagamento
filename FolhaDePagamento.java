import java.util.Scanner;

public class FolhaDePagamento{

    public static void main(String[] args){
  
      Scanner entrada = new Scanner(System.in);


	System.out.print("Digite o nome completo: ");
	String nome = entrada.nextLine();

	System.out.print("Digite o valor da hora: ");
	double valorHora = entrada.nextDouble();

	System.out.print("Digite as horas trabalhadas: ");
	int horasTrabalhadas = entrada.nextInt();

	System.out.print("Digite o valor dos descontos: ");
	double valorDesconto = entrada.nextDouble();

	double totalBruto = horasTrabalhadas * valorHora;
	double totalDevido = totalBruto - valorDesconto;


System.out.println("-------------------------------------------------");
System.out.println("                   Relatório");
System.out.println("-------------------------------------------------");
System.out.printf("Folha de pagamento de: %s%n", nome);
System.out.printf("%d horas X R$%.2f = %.2f%n", horasTrabalhadas, valorHora, totalBruto);
System.out.printf("Descontos: R$%.2f%n",valorDesconto);
System.out.printf("Total devido: R$%.2f%n",totalDevido);
System.out.println("-------------------------------------------------");



    }

}