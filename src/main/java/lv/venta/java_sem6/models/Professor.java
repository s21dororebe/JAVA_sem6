package lv.venta.java_sem6.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.util.Collection;

@Table (name = "professor_table")
@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Professor extends Person{
    @Column(name="degree")
    @NotNull
    private Degree degree;

    @ManyToMany(mappedBy = "professors")
    @ToString.Exclude
    private Collection<Course> courses;

    public Professor(String name, String surname, Degree degree) {
        super(name, surname);
        this.degree = degree;
    }

    public void addCourse(Course inputCourse){
        if(!courses.contains(inputCourse)){
            courses.add(inputCourse);
        }
    }
    public void removeCourse(Course inputCourse){
        courses.remove(inputCourse);
    }
}
