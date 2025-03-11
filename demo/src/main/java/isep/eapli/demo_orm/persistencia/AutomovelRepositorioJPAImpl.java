/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isep.eapli.demo_orm.persistencia;

import isep.eapli.demo_orm.dominio.Automovel;
import jakarta.persistence.Query;

import java.util.List;

/**
 *
 * @author eapli
 */
public class AutomovelRepositorioJPAImpl extends JpaRepository<Automovel, String> implements AutomovelRepositorio {

    public AutomovelRepositorioJPAImpl() {
        super();
    }

    /**
     * Returns the List of all entities in the persistence store
     *
     * @return
     */
    @Override
    public List<Automovel> findAll() {
        Query query = entityManager().createQuery(
                "SELECT e FROM Automovel e");
        List<Automovel> list = query.getResultList();
        return list;
    }

    @Override
    protected String persistenceUnitName() {
        return "DEMO_ORMPU";
    }
}