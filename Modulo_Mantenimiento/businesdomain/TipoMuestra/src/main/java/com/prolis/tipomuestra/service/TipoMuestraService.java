package com.prolis.tipomuestra.service;

import com.prolis.tipomuestra.entity.TipoMuestra;

import java.util.List;

public interface TipoMuestraService {

    TipoMuestra crearTipoMuestra(TipoMuestra m);
    TipoMuestra listarPorIdMuestra(Long id);
    List<TipoMuestra> obtenerMuestras();
    TipoMuestra actualizarMuestra(TipoMuestra m);
    boolean eliminarMuestra(Long id);
}
