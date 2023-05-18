package lv.venta.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Table (name = "grade_table")
@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Grade {
    @Column(name="Idg")
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO) //auto generation
    @Setter(value=AccessLevel.NONE) //no id setter
    private long idg;

    @Column(name="gvalue")
    @Min(0)
    @Max(10)
    private int gvalue;

//    private Student student;

    //TODO add constructor
}
