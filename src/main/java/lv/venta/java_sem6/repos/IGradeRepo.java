package lv.venta.java_sem6.repos;

import lv.venta.java_sem6.models.Grade;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface IGradeRepo extends CrudRepository<Grade, Long> {


    ArrayList<Grade> findByStudentIdp(long id);

    ArrayList<Grade> findByCourseIdc(long id);

    @Query(value="SELECT AVG(GValue) FROM grade_table WHERE Idc = ?1", nativeQuery = true)
    float myCalculateAVGGradeByCourseId(long id);
}
