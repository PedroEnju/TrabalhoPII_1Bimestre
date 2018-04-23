import java.util.Scanner;

public class Terceiro {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String[] p = {"Primeira", "Segunda", "Terceira", "Quarta", "Quinta", "Sexta"};
		
		String opcao1;
		
		System.out.println("O que deseja fazer?");
		System.out.println("\ty para continuar");
		System.out.println("\tn para sair");
		opcao1 = scan.next();
		
		if (opcao1.equals("y")) {
			
			int numAluno;
			
			while (true) {
				System.out.println("Informe a quantidade de alunos");
				numAluno = scan.nextInt();
				if (numAluno > 0) {
					break;
				}
			}
			
			float[][] notaAluno;
			float[] mediaAluno;
			
			notaAluno = new float[numAluno][6];
			mediaAluno = new float[numAluno];
			
			int contador = 0;
			
			while (true) {
				
				System.out.println("O que deseja fazer?");
				System.out.println("\t1 para calcular média");
				System.out.println("\t0 para cancelar");
				int opcao2 = scan.nextInt();
				
				if (opcao2 == 1) {
					
					boolean opcao3 = true;
					int e = 0;
					
					while (opcao3) {
						System.out.printf("Informe a %s nota do Aluno número: %d\r\n", p[e], contador + 1);
						float nota = scan.nextFloat();
						
						if ((nota >= 0) && (nota <= 10)) {
							notaAluno[contador][e] = nota;
							mediaAluno[contador] += nota;
							e++;
						} else {
							System.out.println("\r\n\tNota inválida.\r\n\tDigite novamente.\r\n");
						}
						if (e == 6) {
							opcao3 = false;
						}
					}
					contador++;
				}
				
				if (opcao2 == 0) {
					System.out.println("\r\nPrograma Finalizado!!!\r\n");
					break;
				}
				if (contador == numAluno) {
					System.out.println("\r\nTodos os contatos registrados.\r\n");
					break;
				} else {
					System.out.printf("Há %d registrados.\r\n\r\n", contador);
				}
			}
			for (int i = 0; i < contador; i++) {
				System.out.printf("O aluno %d teve a média de %.2f.\r\n", i + 1, (mediaAluno[i] / 6));
			}
		}
		if (opcao1.equals("n")) {
			System.out.println("\r\nPrograma fechado!!!\r\n");	
		}
	}
	
}