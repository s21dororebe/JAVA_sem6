package lv.venta.java_sem6.repos;

import lv.venta.java_sem6.models.Course;
import org.springframework.data.repository.CrudRepository;

public interface ICourseRepo extends CrudRepository<Course, Long> {

}
