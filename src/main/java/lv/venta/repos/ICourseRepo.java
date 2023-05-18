package lv.venta.repos;

import lv.venta.models.Course;
import lv.venta.models.Professor;
import org.springframework.data.repository.CrudRepository;

public interface ICourseRepo extends CrudRepository<Course, Long> {

}
