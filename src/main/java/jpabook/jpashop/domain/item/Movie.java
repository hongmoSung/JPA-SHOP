package jpabook.jpashop.domain.item;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@DiscriminatorValue("M")
@Entity
@Getter @Setter
public class Movie extends Item {
    private String director;
    private String actor;
}
