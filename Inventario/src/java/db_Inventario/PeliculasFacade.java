/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_Inventario;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author charly
 */
@Stateless
public class PeliculasFacade extends AbstractFacade<Peliculas> {

    @PersistenceContext(unitName = "InventarioPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PeliculasFacade() {
        super(Peliculas.class);
    }
    
}
