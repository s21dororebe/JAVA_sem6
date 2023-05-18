package lv.venta.repos;

import lv.venta.models.Professor;
import org.springframework.data.repository.CrudRepository;

public interface IProfessorRepo extends CrudRepository<Professor, Long> {

}
