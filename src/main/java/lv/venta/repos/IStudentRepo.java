package lv.venta.repos;

import lv.venta.models.Professor;
import lv.venta.models.Student;
import org.springframework.data.repository.CrudRepository;

public interface IStudentRepo extends CrudRepository<Student, Long> {

}
