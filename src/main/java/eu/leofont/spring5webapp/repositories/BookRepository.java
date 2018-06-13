package eu.leofont.spring5webapp.repositories;

import eu.leofont.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
