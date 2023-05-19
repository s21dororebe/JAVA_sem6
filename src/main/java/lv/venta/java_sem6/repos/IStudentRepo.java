package lv.venta.java_sem6.repos;

import lv.venta.java_sem6.models.Student;
import org.springframework.data.repository.CrudRepository;

public interface IStudentRepo extends CrudRepository<Student, Long> {

}
