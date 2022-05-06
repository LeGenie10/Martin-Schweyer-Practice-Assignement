package lv.tsi.finaltask;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FinalTaskApplication {

    public static void main(String[] args) {

        SpringApplication.run(FinalTaskApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(BookRepository repository) {
        return args -> {
            insertJavaAdvocates(repository);
            System.out.println(repository.findAll());
        };
    }

    private void insertJavaAdvocates(BookRepository repository) {
        repository.save(new Book(1, "Don Quixote", "Miguel de Cervantes", 310, 20.10));
        repository.save(new Book(2, "War and Peace", "Leo Tolstoy", 1340, 70.40));
        repository.save(new Book(3, "Hamlet", "William Shakespeare", 75, 14.20));
        repository.save(new Book(4, "The Odyssey", "Homer", 67, 12.70));
    }

}
