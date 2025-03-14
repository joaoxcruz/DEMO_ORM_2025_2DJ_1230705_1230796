/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isep.eapli.demo_orm.persistencia;

import isep.eapli.demo_orm.dominio.GrupoAutomovel;
import java.util.List;
import jakarta.persistence.Query;


/**
 *
 * @author eapli
 * Refactored to extend JpaRepository to remove duplicated code
 */
public class GrupoAutomovelRepositorioJPAImpl extends JpaRepository<GrupoAutomovel, String> implements GrupoAutomovelRepositorio {

    public GrupoAutomovelRepositorioJPAImpl() {
        super();
    }

    /**
     * Returns the List of all entities in the persistence store
     *
     * @return
     */
    @Override
    public List<GrupoAutomovel> findAll() {
        Query query = entityManager().createQuery(
                "SELECT e FROM GrupoAutomovel e");
        List<GrupoAutomovel> list = query.getResultList();
        return list;
    }

    @Override
    protected String persistenceUnitName() {
        return "DEMO_ORMPU";
    }

}