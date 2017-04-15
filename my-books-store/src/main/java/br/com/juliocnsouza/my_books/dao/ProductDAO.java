package br.com.juliocnsouza.my_books.dao;

import br.com.juliocnsouza.my_books.model.Product;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class ProductDAO {

    @PersistenceContext
    private EntityManager em;

    public void save( Product product ) {
        em.persist( product );
    }

}
