package lv.venta.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Table (name = "student_table")
@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Student {
    @Column(name="Ids")
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO) //auto generation
    @Setter(value=AccessLevel.NONE) //no id setter
    private long ids;

    @Column(name="name")
    @NotNull
    @Size(min=3, max=20)
    @Pattern(regexp ="[A-Z]{1}[a-z]+", message = "1.burtam jabut lielam un tikai latinu burti")
    private String name;

    @Column(name="surname")
    @NotNull
    @Size(min=3, max=20)
    @Pattern(regexp ="[A-Z]{1}[a-z]+", message = "1.burtam jabut lielam un tikai latinu burti")
    private String surname;

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
