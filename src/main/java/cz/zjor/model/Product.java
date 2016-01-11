package cz.zjor.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Any;
import org.hibernate.annotations.AnyMetaDef;
import org.hibernate.annotations.MetaValue;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product")
public class Product extends UniqueId {

    @Any(metaColumn = @Column(name = "D"), fetch = FetchType.EAGER)
    @AnyMetaDef(idType = "string", metaType = "string", metaValues = {
            @MetaValue(targetEntity = BoltPart.class, value = "B")
    })
//    @ManyToOne
    @JoinColumn(name = "part_id")
    private BasePart part;

}
