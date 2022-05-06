package lv.tsi.finaltask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class MainController {

    @Autowired
    private  BookRepository bookRepository;

    @GetMapping("/info")
    public String info() {
        return "Martin Schweyer" +
                " " +
                "4005BDF" +
                " " +
                "Variant 9" +
                " " +
                "06/05";
    }

    @GetMapping("/getBooks")
    public ResponseEntity<Iterable<Book>> getBooks(){
        return new ResponseEntity<>(bookRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/getBook")
    public ResponseEntity<Optional<Book>> getBook(
            @RequestParam(
                    value = "id",
                    defaultValue = "1") Long id){
        return new ResponseEntity<>(bookRepository.findById(Math.toIntExact(id)), HttpStatus.OK);
    }

    @GetMapping(path="/totalprice")
    public double getTotal(){
        return bookRepository.findAll()
                .stream()
                .mapToDouble(Book::getPrice)
                .sum();
    }

    }


