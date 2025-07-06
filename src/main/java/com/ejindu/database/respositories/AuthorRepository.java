package com.ejindu.database.respositories;

import com.ejindu.database.domain.entities.AuthorEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<AuthorEntity, Long> {


    Iterable<AuthorEntity> ageLessThan(int i);



}
