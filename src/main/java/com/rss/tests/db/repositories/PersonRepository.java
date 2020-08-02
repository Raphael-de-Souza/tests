package com.rss.tests.db.repositories;

import com.rss.tests.db.entities.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author
 * <pre>
 *  	JPA repository interface for {@link PersonEntity} class
 * </pre>
 */
@Repository
public interface PersonRepository extends JpaRepository<PersonEntity, Integer> {
}
