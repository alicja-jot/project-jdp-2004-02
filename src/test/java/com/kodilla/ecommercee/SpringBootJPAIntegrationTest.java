package com.kodilla.ecommercee;

import com.kodilla.ecommercee.domain.GenericEntity;
import com.kodilla.ecommercee.repository.GenericEntityRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class SpringBootJPAIntegrationTest {

    @Autowired
    private GenericEntityRepository genericEntityRepository;

    @Test
    public void givenGenericEntityRepository_whenSaveAndRetreiveEntity_thenOK() {
        GenericEntity genericEntity = (GenericEntity) genericEntityRepository
                .save(new GenericEntity());
        Optional<GenericEntity> foundEntity = genericEntityRepository
                .findById(genericEntity.getId());

        assertTrue(foundEntity.isPresent());
    }
}
