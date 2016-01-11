package cz.zjor.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "base_part")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "D")
public class BasePart extends UniqueId {

    @Column(name = "name", nullable = false)
    private String name;

}
