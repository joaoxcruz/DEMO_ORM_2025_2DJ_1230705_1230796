/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isep.eapli.demo_orm.apresentacao;

import isep.eapli.demo_orm.aplicacao.GrupoAutomovelController;
import isep.eapli.demo_orm.dominio.GrupoAutomovel;
import isep.eapli.demo_orm.util.Console;

import java.util.List;

/**
 *
 * @author mcn
 */
public class GrupoAutomovelUI {

    private final GrupoAutomovelController controller = new GrupoAutomovelController();
    
    public void registarGA() {
        System.out.println("*** Registo Grupo Automóvel ***\n");
        String nome = Console.readLine("Nome:");
        int portas = Console.readInteger("Número de portas");
        String classe = Console.readLine("Classe:");
        GrupoAutomovel grupoAutomovel = controller.
                registarGrupoAutomóvel(nome, portas, classe);
        System.out.println("Grupo Automóvel" + grupoAutomovel);
    }
    public void listarGAs() {
		List<GrupoAutomovel> lista = controller.listarGruposAutomoveis();
        for(GrupoAutomovel grupoAutomovel : lista) {
            System.out.println(grupoAutomovel);
        }
	}

	public void procurarGAPorID(String id) {
        GrupoAutomovel g1 = controller.procurarGrupoAutomovel(id);
        System.out.println(g1);
	}
}
