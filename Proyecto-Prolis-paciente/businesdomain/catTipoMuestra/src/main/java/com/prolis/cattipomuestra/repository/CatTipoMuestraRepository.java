package com.prolis.cattipomuestra.repository;

import com.prolis.cattipomuestra.entity.CatTipoMuestra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatTipoMuestraRepository extends JpaRepository<CatTipoMuestra, Long> {
}
