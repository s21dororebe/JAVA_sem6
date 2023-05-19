package lv.venta.java_sem6.services;

import lv.venta.java_sem6.models.Course;
import lv.venta.java_sem6.models.Grade;
import lv.venta.java_sem6.models.Professor;
import lv.venta.java_sem6.models.Student;

import java.util.ArrayList;

public interface IFilteringService {
    ArrayList<Student> retrieveAllStudents();
    ArrayList<Grade> retrieveAllGrades();
    ArrayList<Professor> retrieveAllProfessors();
    ArrayList<Course> retrieveAllCourses();

    ArrayList<Grade> retrieveAllGradesByStudentId(long id);

    ArrayList<Course> retrieveAllCoursesByStudentId(long id);
    ArrayList<Course> retrieveAllCoursesByProfessorId(long id);

    float calculateAVGGradeInCoursesId(long id);
}
