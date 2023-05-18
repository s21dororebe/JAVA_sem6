package lv.venta.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.util.Collection;

@Table (name = "course_table")
@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Course {
    @Column(name="Idc")
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO) //auto generation
    @Setter(value=AccessLevel.NONE) //no id setter
    private long idc;

    @Column(name="title")
    @NotNull
    @Size(min=3, max=150)
    @Pattern(regexp ="[A-Z]{1}[a-z\\ ]+", message = "1.burtam jabut lielam un tikai latinu burti")
    private String title;

    @Column(name="creditPoints")
    @Min(1)
    @Max(20)
    private int creditPoints;

    @OneToOne
    @JoinColumn(name="Idp") //profesora id
    private Professor professor;

    @OneToMany(mappedBy="course")
    @ToString.Exclude
    private Collection<Grade> grades;

    public Course(String title, int creditPoints, Professor professor) {
        this.title = title;
        this.creditPoints = creditPoints;
        this.professor = professor;
    }
}
