package com.prolis.valornormal.service;

import com.prolis.valornormal.entity.ValorNormal;

import java.util.List;

public interface ValorNormalService {

    ValorNormal crearValorNormal(ValorNormal v);
    ValorNormal listarPorIdValor(Long id);
    List<ValorNormal> obtenerValor();
    ValorNormal actualizarValor(ValorNormal v);
    boolean eliminarValor(Long id);
}
