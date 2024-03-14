package ru.mts.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "raw_materials")
public class RawMaterial {
    @GeneratedValue
    @Id
    Long id;

    MaterialType materialType;

    public RawMaterial(MaterialType materialType) {
        this.materialType = materialType;
    }
}
