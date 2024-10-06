package com.tericcabrel.authapi.repositories;

import com.tericcabrel.authapi.entities.Guild;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GuildRepository extends CrudRepository<Guild, Integer> {
    Optional<Guild> findByName(String name);
}
