import java.util.Scanner;

public class Segundo {
	
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
			
			int numContato;
			
			while (true) {
				System.out.println("Informe a quantidade de contatos que deseja armazenar");
				numContato = scan.nextInt();
				if(numContato > 0) {
					break;
				} else {
					System.out.println("\tNúmero inválido.\r\n\tDigite novamente\r\n");
				}
			}
			
			String[] nomeContato;
			String[] emailContato;
			nomeContato = new String[numContato];
			emailContato = new String[numContato];
			
			int contador = 0;
			
			while (true) {
				
				System.out.println("O que deseja fazer?");
				System.out.println("\t1 para armazenar o contato");
				System.out.println("\t0 para cancelar");
				int opcao2 = scan.nextInt();
			
				if (opcao2 == 1) {
					
					boolean opcao3 = true;
					boolean opcao4 = true;
			
					while(opcao3) {
						System.out.println("Informe o nome do cliente");
						String oNome = scan.next();
						if (oNome.length() >= 2){
							nomeContato[contador] = oNome;
							opcao3 = false;
						} else {
							System.out.println("\r\n\tNome inválido.\r\n\tDigite novamente.\r\n");
						}
					}
					
					while(opcao4) {
						System.out.println("Informe o e-mail do cliente");
						String oEmail = scan.next();
						if (oEmail.matches("^[a-zA-Z0-9\\-_\\.]+@[a-zA-Z0-9]+$")) {
							emailContato[contador] = oEmail;
							opcao4 = false;
						} else {
							System.out.println("\r\n\tE-mail inválido.\r\n\tDigite novamente.\r\n");
						}
					}
					contador++;
				}
				if (opcao2 == 0) {
					System.out.println("\r\nPrograma Finalizado!!!\r\n");
					break;
				}
				if (contador == numContato) {
					System.out.println("\r\nTodos os contatos registrados.\r\n");
					break;
				} else {
					System.out.printf("Há %d registrados.\r\n\r\n", contador);
				}
			}
			if (contador != 0) {
				for (int i = 0; i < contador; i++) {
					System.out.printf("Nome: %s\r\nE-mail: %s\r\n\r\n", nomeContato[i], emailContato[i]);
				}
			}
		} 
		if (opcao1.equals("n")) {
			System.out.println("\r\nPrograma fechado!!!\r\n");	
		}
	}
}