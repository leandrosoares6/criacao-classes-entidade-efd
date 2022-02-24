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
    public void persistAllEntities(List<Object> entities) {
        for (Object entity : entities) {
            em.persist(entity);
            LOGGER.info("Saving entity: {}", entity);
        }
    }
    
}
