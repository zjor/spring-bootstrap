package cz.zjor.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@Entity
@Table(name = "model")
public class Model extends UniqueId {

    @Column(name = "name")
    private String name;

    public Model(String name) {
        this.name = name;
    }

}
