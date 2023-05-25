package lv.venta.java_sem6.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.util.Collection;

@Table (name = "student_table")
@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Student extends Person{
    @OneToMany(mappedBy="student")
    @ToString.Exclude
    private Collection<Grade> grades;

    public Student(String name, String surname) {
        super(name, surname);
    }
}
