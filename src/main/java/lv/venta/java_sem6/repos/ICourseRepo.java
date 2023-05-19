package lv.venta.java_sem6.repos;

import lv.venta.java_sem6.models.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface ICourseRepo extends CrudRepository<Course, Long> {

    ArrayList<Course> findByGradesStudentIds(long id);

    ArrayList<Course> findAllByProfessorsIdp(long id);
}
