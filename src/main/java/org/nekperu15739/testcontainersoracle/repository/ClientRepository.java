package org.nekperu15739.testcontainersoracle.repository;

import org.nekperu15739.testcontainersoracle.entity.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client, String> {
}
