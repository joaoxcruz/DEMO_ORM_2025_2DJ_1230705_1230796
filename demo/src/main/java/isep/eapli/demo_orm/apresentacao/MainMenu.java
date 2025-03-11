/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isep.eapli.demo_orm.apresentacao;

import isep.eapli.demo_orm.aplicacao.GrupoAutomovelController;
import isep.eapli.demo_orm.util.Console;

import java.util.Scanner;

/**
 *
 * @author mcn
 */
public class MainMenu {
	static GrupoAutomovelController grupoAutomovelController = new GrupoAutomovelController();
    public static void mainLoop() {
		int opcao = 0;
		do {
			opcao = menu();

			switch (opcao) {
				case 0:
					System.out.println("fim ...");
					break;
				case 1:
					System.out.println("Introduza os seguintes dados do carro:\n");
					System.out.println("Classe:\n");
					Scanner input = new Scanner(System.in);
					String classe = input.nextLine();
					System.out.println("Número de Portas:\n");
					int nPortas = Integer.parseInt(input.nextLine());
					System.out.println("Nome:\n");
					String nome = input.nextLine();
					grupoAutomovelController.registarGrupoAutomóvel(nome, nPortas, classe);
					break;

				case 2:
					System.out.println("Ainda não implementado ...");
					break;

				
				
				default:
					System.out.println("opcao não reconhecida.");
					break;
			}
		} while (opcao != 0);

	}

	private static int menu() {
		int option = -1;
		System.out.println("");
		System.out.println("=============================");
		System.out.println(" Rent a Car ");
		System.out.println("=============================\n");
		System.out.println("1.Registar Grupo Automóvel");
		System.out.println("2.Listar todos os Grupos Automóveis");          
		
        System.out.println("=============================");
        System.out.println("0. Sair\n\n");
		option = Console.readInteger("Por favor escolha opção");
		return option;
	}
}
