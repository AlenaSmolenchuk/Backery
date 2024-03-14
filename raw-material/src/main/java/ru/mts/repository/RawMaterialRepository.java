package ru.mts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.mts.entity.RawMaterial;

import java.util.List;

public interface RawMaterialRepository extends JpaRepository<RawMaterial, Long> {
}
