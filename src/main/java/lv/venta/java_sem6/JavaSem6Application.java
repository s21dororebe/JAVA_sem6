package lv.venta.java_sem6;

import lv.venta.models.*;
import lv.venta.repos.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = "lv.venta")
//@SpringBootApplication
public class JavaSem6Application {

    public static void main(String[] args) {
        SpringApplication.run(JavaSem6Application.class, args);
    }
/*
    @Bean
    public CommandLineRunner testModel(IProfessorRepo prRepo, IStudentRepo stRepo, ICourseRepo coRepo, IGradeRepo grRepo){
        return new CommandLineRunner() {
            @Override
            public void run() throws Exception {
                Professor p1 = new Professor("Juris", "Zagars", Degree.phd);
                Professor p2 = new Professor("Dmitrijs", "Smirnovs", Degree.phd);
                prRepo.save(p1);
                prRepo.save(p2);
                Student st1 = new Student("Janis", "Berzins");
                Student st2 = new Student("Baiba", "Kalnina");
                stRepo.save(st1);
                stRepo.save(st2);
                Course c1 = new Course("Haosa teorija", 4, p1);
                Course c2 = new Course("Ekonomikas pamati", 2, p2);
                coRepo.save(c1);
                coRepo.save(c2);
                grRepo.save(new Grade(5, st1, c1)); //Janis 5 Haoss
                grRepo.save(new Grade(7, st1, c2)); //Janis 7 Ekonomika
                grRepo.save(new Grade(10, st2, c1)); //Baiba 10 Haoss
                grRepo.save(new Grade(8, st2, c2)); //Baiba 8 Ekonomika
            }
        };
    }*/

}
