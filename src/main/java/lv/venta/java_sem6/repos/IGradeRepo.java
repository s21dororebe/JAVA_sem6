package lv.venta.java_sem6.repos;

import lv.venta.java_sem6.models.Grade;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface IGradeRepo extends CrudRepository<Grade, Long> {


    ArrayList<Grade> findByStudentIds(long id);

    ArrayList<Grade> findByCourseIdc(long id);
}
