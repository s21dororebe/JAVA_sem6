package lv.venta.java_sem6.controllers;

import lv.venta.java_sem6.services.IFilteringService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class FilterController {
    @Autowired
    private IFilteringService filteringService;

    @GetMapping("/info/showAllStudents") //localhost:8080/info/showAllStudents
    public String getAllStudentsFunc(Model model){
        model.addAttribute("students", filteringService.retrieveAllStudents());
        return "all-students-page"; //all-students-page.html
    }

    @GetMapping("/info/showAllProfessors") //localhost:8080/info/showAllProfessors
    public String getAllProfessorsFunc(Model model){
        model.addAttribute("professors", filteringService.retrieveAllProfessors());
        return "all-professors-page"; //all-students-page.html
    }

    @GetMapping("/info/showAllCourses") //localhost:8080/info/showAllCourses
    public String getAllCoursesFunc(Model model){
        model.addAttribute("courses", filteringService.retrieveAllCourses());
        return "all-courses-page"; //all-students-page.html
    }

    @GetMapping("/info/showAllGrades") //localhost:8080/info/showAllGrades
    public String getAllGradesFunc(Model model){
        model.addAttribute("grades", filteringService.retrieveAllGrades());
        return "all-grades-page"; //all-students-page.html
    }
}
