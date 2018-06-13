package eu.leofont.spring5webapp.repositories;

import eu.leofont.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
