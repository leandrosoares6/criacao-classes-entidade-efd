package com.example.demo.repository;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class RegistrosRepository {

    private static final Logger LOGGER = LoggerFactory.getLogger(RegistrosRepository.class);

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void salvarRegistros(List<Object> registros) {
        registros.stream().forEach(registro -> {
            em.persist(registro);
            LOGGER.info("Entidade persistida {}", registro);
        });
        // for (Object registro : registros) {
        // em.persist(registro);
        // LOGGER.info("Entidade persistida {}", registro);
        // }
    }

    @Transactional
    public void salvarRegistrosWhile(List<Object> registros) {
        for (Object registro : registros) {
        em.persist(registro);
        LOGGER.info("Entidade persistida {}", registro);
        }
    }

}
