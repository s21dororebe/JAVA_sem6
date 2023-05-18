package lv.venta.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Table (name = "professor_table")
@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Professor {
    @Column(name="Idp")
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO) //auto generation
    @Setter(value=AccessLevel.NONE) //no id setter
    private long idp;

    @Column(name="name")
    @NotNull
    @Size(min=3, max=20)
    @Pattern(regexp ="[A-Z]{1}[a-z\\ ]+", message = "1.burtam jabut lielam un tikai latinu burti")
    private String name;

    @Column(name="surname")
    @NotNull
    @Size(min=3, max=20)
    @Pattern(regexp ="[A-Z]{1}[a-z\\ ]+", message = "1.burtam jabut lielam un tikai latinu burti")
    private String surname;

    @Column(name="degree")
    @NotNull
    private Degree degree;

    @OneToOne(mappedBy="professor") //variable
    @ToString.Exclude
    private Course course;

    public Professor(String name, String surname, Degree degree) {
        this.name = name;
        this.surname = surname;
        this.degree = degree;
    }
}
