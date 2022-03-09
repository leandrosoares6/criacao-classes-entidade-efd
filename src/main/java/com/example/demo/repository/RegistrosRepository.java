package com.example.demo.repository;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Component;

@Component
public class RegistrosRepository {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void salvarRegistros(List<Object> registros) {
        for (Object registro : registros) {
            em.persist(registro);
        }
    }

}
