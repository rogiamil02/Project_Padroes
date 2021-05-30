package modelo;

import java.util.Scanner;

public class Print {
	
		
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			
		//Informar
			
			//proprietario
				System.out.println("Digite seu nome:");
				String proprietario = in.nextLine();
			//E-mail
				System.out.println("Digite seu E-mail:");
				String email = in.nextLine();
			//Nome do arquivo
				System.out.println("Informe o nome do arquivo desejado:");
				String NomeArquivo = in.nextLine();
			//Caminho
				System.out.println("Insira o caminho do arquivo:");
				String CaminhoArquivo = in.nextLine();
			//Autorização de impressão
				System.out.println("Informe se tem permissão para impressão:");
				String autorizacao = in.next();
		//Resposta
			System.out.println("\n");
			System.out.println("Proprietario(a): " + proprietario + "\n");
			System.out.println("E-mail para contato: " + email + "\n");
			System.out.println("Desejo o arquivo: " + NomeArquivo + "\n");
			System.out.println("Caminho do arquivo desejado: " + CaminhoArquivo + "\n");
			System.out.println("Minhas permissões para impressão é: " + autorizacao);
			
		}

	}
}
