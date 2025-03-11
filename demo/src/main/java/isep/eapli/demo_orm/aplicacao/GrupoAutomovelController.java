/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isep.eapli.demo_orm.aplicacao;

import isep.eapli.demo_orm.dominio.GrupoAutomovel;
import isep.eapli.demo_orm.persistencia.GrupoAutomovelRepositorio;
import isep.eapli.demo_orm.persistencia.GrupoAutomovelRepositorioJPAImpl;
import java.util.List;

/**
 *
 * @author eapli
 */
public class GrupoAutomovelController {

    public GrupoAutomovel registarGrupoAutomóvel(String nome, int portas,
            String classe) {
        GrupoAutomovel grupo1 = new GrupoAutomovel(nome, portas, classe);
        GrupoAutomovelRepositorio repo = new GrupoAutomovelRepositorioJPAImpl();
        return repo.add(grupo1);
    }
    
    public List<GrupoAutomovel> listarGruposAutomoveis() {
        GrupoAutomovelRepositorio repo = new GrupoAutomovelRepositorioJPAImpl();
        List<GrupoAutomovel> automoveis = repo.findAll();
        return automoveis;
    }

	public GrupoAutomovel procurarGrupoAutomovel(String id) {
		GrupoAutomovelRepositorio repo = new GrupoAutomovelRepositorioJPAImpl();
        return repo.findById(id);
	}

        /*  Versão  sem usar padrão repositório
	 private GrupoAutomovel gravarGA(GrupoAutomovel gAuto) {

	 EntityManager manager = criarEntityManager("DEMO_ORMPU");

	 manager.getTransaction().begin();
	 manager.persist(gAuto);
	 manager.getTransaction().commit();

	 manager.close();
	 return gAuto;
	 }

	 private List<GrupoAutomovel> listarTodos() {


	 EntityManager manager = criarEntityManager("DEMO_ORMPU");

	 Query query = manager.createQuery("select ga from GrupoAutomovel ga");
	 List<GrupoAutomovel> results = query.getResultList();

	 for (GrupoAutomovel result : results) {
	 System.out.println(result);
	 }

	 manager.close();
	 return results;
	 }

	 private EntityManager criarEntityManager(String persistenceUnit) {
	 EntityManagerFactory factory = Persistence.
	 createEntityManagerFactory(persistenceUnit);
	 EntityManager manager = factory.createEntityManager();
	 return manager;
	 }
	 */
}
