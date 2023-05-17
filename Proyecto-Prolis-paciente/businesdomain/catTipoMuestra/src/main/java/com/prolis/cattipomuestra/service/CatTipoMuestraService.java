package com.prolis.cattipomuestra.service;

import com.prolis.cattipomuestra.entity.CatTipoMuestra;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
public interface CatTipoMuestraService {
    CatTipoMuestra crearTipoMuestra(CatTipoMuestra p);
    CatTipoMuestra listarPorId(Long id);
    List<CatTipoMuestra> obtenerCatTipoMuestra();
    CatTipoMuestra actualizarCatTipoMuestra(CatTipoMuestra p);
    void eliminarCatTipoMuestra(Long id);
}
