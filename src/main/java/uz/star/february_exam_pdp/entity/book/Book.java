package uz.star.february_exam_pdp.entity.book;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.star.february_exam_pdp.entity.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "book")
public class Book extends BaseEntity<String> {

    @NotNull
    @Column(nullable = false)
    private String name;
    private String author;
}
