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
@Table(name = "gear_part")
@DiscriminatorValue("G")
public class GearPart extends BasePart implements SpecialPart {

    @Column(name = "inner_radius")
    private String innerRadius;

    public GearPart(String name, String radius) {
        super(name);
        this.innerRadius = radius;
    }


}
