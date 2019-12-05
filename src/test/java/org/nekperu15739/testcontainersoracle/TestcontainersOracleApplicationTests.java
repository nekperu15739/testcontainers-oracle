package org.nekperu15739.testcontainersoracle;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.nekperu15739.testcontainersoracle.entity.Client;
import org.nekperu15739.testcontainersoracle.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestcontainersOracleApplicationTests {

    @Autowired
    private ClientRepository repository;

    @Test
    public void findById() {
        //given
        final String crewCodeStartingWith = "ES";
        final String rank = "JU";

        Iterable<Client> clients = repository.findAll();

        //when
        Optional<Client> client = repository.findById(crewCodeStartingWith);

        //then
        assertThat(client)
            .isPresent();
    }

    @Test
    public void findAll() {
        //given
        final String crewCodeStartingWith = "ES";
        final String rank = "JU";

        //when
        Iterable<Client> clients = repository.findAll();

        //then
        assertThat(clients)
            .isNotEmpty()
            .hasSize(1);
    }

}