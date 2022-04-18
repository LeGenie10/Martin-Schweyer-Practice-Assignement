package lv.tsi.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class Bookcontroller {
    @Autowired
    private Bookrepository bookRepository;

    @GetMapping("/getBooks")
    public ResponseEntity<Iterable<Modelbook>> getBooks() {
        return new ResponseEntity<>(bookRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/getBook")
    public ResponseEntity<Optional<Modelbook>> getBook(
            @RequestParam(
                    value = "id",
                    defaultValue = "1") Long id) {
        return new ResponseEntity<>(bookRepository.findById(id), HttpStatus.OK);
    }
}