package lv.tsi.book;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Bookrepository extends CrudRepository<Modelbook, Long> {



}