package lv.venta.java_sem6.repos;

import lv.venta.java_sem6.models.Professor;
import org.springframework.data.repository.CrudRepository;

public interface IProfessorRepo extends CrudRepository<Professor, Long> {

}
