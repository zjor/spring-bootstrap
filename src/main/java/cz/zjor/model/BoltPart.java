package cz.zjor.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@Entity
@Table(name = "bolt_part")
@DiscriminatorValue("B")
public class BoltPart extends BasePart {

    @Column(name = "outer_radius")
    private String outerRadius;

    public BoltPart(String name, String radius) {
        super(name);
        this.outerRadius = radius;
    }

}
