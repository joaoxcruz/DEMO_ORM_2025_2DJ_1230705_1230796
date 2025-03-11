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
	static GrupoAutomovelUI grupoAutomovelUI = new GrupoAutomovelUI();

	public static void mainLoop() {
		int opcao = 0;
		do {
			opcao = menu();

			switch (opcao) {
				case 0:
					System.out.println("fim ...");
					break;
				case 1:
					grupoAutomovelUI.registarGA();

				case 2:
					grupoAutomovelUI.listarGAs();
					break;
				case 3:
					System.out.println("*** Procurar por ID ***\n");
					String id = Console.readLine("ID:");
					grupoAutomovelUI.procurarGAPorID(id);
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
		System.out.println("3. Procurar Grupo Automóvel por ID");

		System.out.println("=============================");
        System.out.println("0. Sair\n\n");
		option = Console.readInteger("Por favor escolha opção");
		return option;
	}
}
