package lv.venta.repos;

import lv.venta.models.Grade;
import lv.venta.models.Professor;
import org.springframework.data.repository.CrudRepository;

public interface IGradeRepo extends CrudRepository<Grade, Long> {

}
