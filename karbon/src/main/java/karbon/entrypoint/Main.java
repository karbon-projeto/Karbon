package karbon.entrypoint;

import karbon.causa.Causa;
import karbon.falha.Falha;
import karbon.abstractUser.*;
import java.util.Scanner;
import karbon.relatorio.Relatorio;

public class Main {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//Inicialização do relatório que será gerado a partir do que é posto
		Relatorio r1 = new Relatorio();
		
		//Causas criadas como base para testes do codigo
		Causa c1 = new Causa ("Interrupção de manutenção", "Mecânica", "Baixo nível de agua limpa");
		Falha falha1 = new Falha ();
		Causa c2 = new Causa ("Interrupção operacional", "Operac. laminador", "Ajuste axial");
		falha1.addCausa(c1);
		falha1.addCausa(c2);
		
		//Adicionando as causas no relatório
		r1.addCausas(c1);
		r1.addCausas(c2);
		
		//Inicializando o escaner, que será utilizado para receber inputs
		@SuppressWarnings("resource")
		Scanner escaner = new Scanner(System.in);
		
		
		//Informações do usuário, que no momento não possui utilidade, porém, a ideia seria pegar de um banco de dados e verificar se o funcionario existe realmente
		System.out.println("E-mail:");
		String email = escaner.nextLine();
		System.out.println("Nome:");
		String nome = escaner.nextLine();
		System.out.println("Id:");
		String id = escaner.nextLine();
		
		
		//Por enquanto, como não possuimos acesso a um banco de dados, faz-se necessário perguntar qual o cargo do funcionário
		System.out.println("\n\nCargo:");
		String cargo = escaner.nextLine();
		
		if (cargo.equals("P4")) {
			
			//Registra o P4 (Porém sem utilidade no momento)
			P4 p1 = new P4(nome, email, id);
			
			//Relatório das falhas existentes
			System.out.println("\t\t\t\tFalhas\n\n");
			System.out.println("Tipos:\t\t\t\t\tAtributos:\t\tDisfunções:\n");
			System.out.println("\n\n" + r1.getCausas());
			
			//Recebe uma entrada do P4 de se houve nova falha ou não
			System.out.println("Registrar falha nova?");
			Falha falha2 = new Falha ();
			falha2.setDataHoraInicio();
			String falhaNova = escaner.nextLine();
			while (falhaNova.equals("sim")) {
				
				//Recebe as causas da falha 
				System.out.println("\n\t\tCausa da falha:");
				System.out.println("Tipo:");
				String tipo = escaner.nextLine();
				System.out.println("Atributo:");
				String atributo = escaner.nextLine();
				System.out.println("Disfunção:");
				String disfuncao = escaner.nextLine();
				
				//Armazena as causas da falha que está sendo registrada
				Causa c3 = new Causa (tipo, atributo, disfuncao);
				falha2.addCausa(c3);
				r1.addCausas(c3);
				
				//Verifica se houve mais alguma causa para aquela falha
				System.out.println("Houve mais alguma causa?");
				falhaNova = escaner.nextLine();
			}
			
			//Mostra o relatório de falhas após adicionar a falha
			System.out.println("\t\t\t\tFalhas\n\n");
			System.out.println("Tipos:\t\t\t\t\tAtributos:\t\tDisfunções:\n");
			System.out.println("\n\n" + r1.getCausas());
		}
		else if (cargo.equals("Gestor")) {
			
			//Registra o Gestor (Porém sem utilidade no momento)
			Gestor g1 = new Gestor(nome, email, id);
			
			//Pergunta se o gestor deseja realizar o relatório das falhas
			System.out.println("\nFazer relatório?");
			String fazerRelatorio = escaner.nextLine();
			
			//Verifica a resposta do gestor
			if (fazerRelatorio.equals("sim")) {
				
				//Mostra o relatório de falhas
				System.out.println("\n\n\t\t\t\tRelatório\n\n");
				System.out.println("Tipos:\t\t\t\t\tAtributos:\t\tDisfunções:\n");
				System.out.println(r1.getCausas());
			}
		}
	}
}
