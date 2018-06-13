package eu.leofont.spring5webapp.repositories;

import eu.leofont.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> { }
