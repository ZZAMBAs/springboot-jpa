package org.devcourse.springbootjpa.domain.order;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
@DiscriminatorValue("FOOD")
public class Food extends Item {
    private String chef;
}
