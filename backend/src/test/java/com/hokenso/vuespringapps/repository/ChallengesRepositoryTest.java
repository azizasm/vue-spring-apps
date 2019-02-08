package com.hokenso.vuespringapps.repository;

import com.hokenso.vuespringapps.domain.Challenges;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ChallengesRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private ChallengesRepository users;

    private Challenges c1 = new Challenges("t1", "l1", "", "", "", "", "");
    private Challenges c2 = new Challenges("t2", "l2", "", "", "", "", "");

    @Before
    public void fillSomeDataIntoOurDb() {
        // Add new Users to Database
        entityManager.persist(c1);
        entityManager.persist(c2);
    }

    @Test
    public void testFindByTitle() throws Exception {
        // Search for specific Challenges in Database according to lastname
        List<Challenges> cWitht1 = users.findByTitle("t1");

        assertThat(cWitht1, contains(c1));
    }


    @Test
    public void testFindByLevel() throws Exception {
        // Search for specific Challenges in Database according to level
        List<Challenges> cWithl2 = users.findByLevel("l2");

        assertThat(cWithl2, contains(c2));
    }

}