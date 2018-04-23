import java.util.Scanner;

public class Primeiro {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
			
		String opcao1;
		
		while (true) {
			System.out.println("O que deseja fazer?");
			System.out.println("\ty para continuar");
			System.out.println("\tn para sair");
			opcao1 = scan.next();
			if((opcao1.equals("y")) || (opcao1.equals("n"))) {
				break;
			} else {
				System.out.println("\r\nDigite novamente!!!\r\n");
			}
		}
		
		if (opcao1.equals("y")) {
			
			int numCliente;
		
			while (true) {
				System.out.println("Informe a quantidade de clientes que deseja armazenar");
				numCliente = scan.nextInt();
				if (numCliente > 0) {
					break;
				} else {
					System.out.println("\tNúmero inválido.\r\n\tDigite novamente\r\n");
				}
			}
			
			String[] nomeCliente;
			nomeCliente = new String[numCliente];
			
			int contador = 0;
			
			while (true) {
				System.out.println("O que deseja fazer?");
				System.out.println("\t1 para armazenar o nome do cliente");
				System.out.println("\t0 para cancelar");
				int opcao2 = scan.nextInt();
			
				if (opcao2 == 1) {
					
					boolean opcao3 = true;
					
					while (opcao3) {
						System.out.println("Informe o nome do cliente");
						String oNome = scan.next();
						if (oNome.length() >= 2) {
							nomeCliente[contador] = oNome;
							opcao3 = false;
						} else {
							System.out.println("\r\n\tNome inválido.\r\n\tDigite novamente.\r\n");
						}
					}
					contador++;
				}
				
				if (opcao2 == 0) {
					System.out.println("\r\nPrograma finalizado!!!\r\n");
					break;
				}
				if (contador == numCliente) {
					System.out.println("\r\nTodos os clientes registrados.\r\n");
					break;
				} else {
					System.out.printf("\r\nHá %d registrados.\r\n\r\n", contador);
				}
			}
			if (contador != 0) {
				for (int i = 0; i < contador; i++) {
					System.out.printf("Nome: %s\r\n",nomeCliente[i]);
				} 
			}
		}
		if (opcao1.equals("n")) {
			System.out.println("\r\nPrograma fechado!!!\r\n");
		}			
	}	
}