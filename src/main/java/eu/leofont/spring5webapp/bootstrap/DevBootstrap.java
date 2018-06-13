package eu.leofont.spring5webapp.bootstrap;

import eu.leofont.spring5webapp.model.Author;
import eu.leofont.spring5webapp.model.Book;
import eu.leofont.spring5webapp.model.Publisher;
import eu.leofont.spring5webapp.repositories.AuthorRepository;
import eu.leofont.spring5webapp.repositories.BookRepository;
import eu.leofont.spring5webapp.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    public void initData() {

        Publisher publisher = new Publisher("O'Reilly", "Leopardstown");
        publisherRepository.save(publisher);

        //Leo
        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "1234", publisher);
        eric.getBooks().add(ddd);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        //Rod
        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "23444", publisher);
        rod.getBooks().add(noEJB);

        authorRepository.save(rod);
        bookRepository.save(noEJB);


    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }
}
