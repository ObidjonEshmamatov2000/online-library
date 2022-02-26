package uz.star.february_exam_pdp.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

/**
 * date: 2022.02.21
 * createdBy: Eshmamatov Obidjon
 * email_account: obidjoneshmamatov@Gmail.com
 */

@Getter
@Setter
@MappedSuperclass
public class BaseEntity<T>{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;

    @CreationTimestamp
    protected LocalDateTime createdDate;

    @UpdateTimestamp
    protected LocalDateTime updatedDate;

    protected T createdBy;

    protected T updatedBy;
}























