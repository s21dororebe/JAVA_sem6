package lv.venta.java_sem6.services.impl;

import lv.venta.java_sem6.models.Course;
import lv.venta.java_sem6.models.Grade;
import lv.venta.java_sem6.models.Professor;
import lv.venta.java_sem6.models.Student;
import lv.venta.java_sem6.repos.ICourseRepo;
import lv.venta.java_sem6.repos.IGradeRepo;
import lv.venta.java_sem6.repos.IProfessorRepo;
import lv.venta.java_sem6.repos.IStudentRepo;
import lv.venta.java_sem6.services.IFilteringService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import java.util.ArrayList;

@Service
public class FilteringServiceImpl implements IFilteringService {
    @Autowired
    private IProfessorRepo profRepo;
    @Autowired
    private IStudentRepo studRepo;
    @Autowired
    private ICourseRepo courseRepo;
    @Autowired
    private IGradeRepo gradeRepo;

    public ArrayList<Student> retrieveAllStudents(){
        return (ArrayList<Student>) studRepo.findAll();
    }
    public ArrayList<Grade> retrieveAllGrades(){
        return (ArrayList<Grade>) gradeRepo.findAll();
    }
    public ArrayList<Professor> retrieveAllProfessors(){
        return (ArrayList<Professor>) profRepo.findAll();
    }
    public ArrayList<Course> retrieveAllCourses(){
        return (ArrayList<Course>) courseRepo.findAll();
    }

    public ArrayList<Grade> retrieveAllGradesByStudentId(long id) throws Exception {
        if(id > 0){
            return gradeRepo.findByStudentIds(id);
        } else throw new Exception("Incorrect id");
    }

    public ArrayList<Course> retrieveAllCoursesByStudentId(long id) throws Exception {
        if(id > 0){
            return courseRepo.findByGradesStudentIds(id);
        } else throw new Exception("Incorrect id");
    }
    public ArrayList<Course> retrieveAllCoursesByProfessorId(long id) throws Exception {
        if(id > 0){
            return courseRepo.findAllByProfessorsIdp(id);
        } else throw new Exception("Incorrect id");
    }

    public float calculateAVGGradeInCoursesId(long id) throws Exception {
        if(id > 0){
            ArrayList<Grade> filteredResults = gradeRepo.findByCourseIdc(id);
            float summa = 0;
            for(Grade temp : filteredResults){
                summa += temp.getGvalue();
            }
            return summa/filteredResults.size();
        } else throw new Exception("Incorrect id");
    }
}
