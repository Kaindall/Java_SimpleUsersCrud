package com.training.users.repository;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@ActiveProfiles("test")
class UserRepositoryDAOTest {

    @Autowired
    TestEntityManager entityManager;
    
    @BeforeAll
    static void beforeAll() {

    }

    @Test
    void findByUserId() {
    }

    @Test
    void findByEmail() {
    }

    @Test
    void existsByEmail() {
    }

    @Test
    void existsByUserId() {
    }
}