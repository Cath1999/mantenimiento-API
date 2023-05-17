package com.prolis.empleado.service.impl;

import com.prolis.empleado.entity.empleado;
import com.prolis.empleado.repository.EmpleadoRepository;
import com.prolis.empleado.service.EmpleadoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmpleadoServiceImpl implements EmpleadoService {
    @Autowired
    private final EmpleadoRepository EmpleadoRepository;
    @Override
    public Empleado crearEmpleado(Empleado E) {
        return EmpleadoRepository.save(E);
    }

    @Override
    public Empleado listarPorId(Long id) {
        Optional<Empleado> optionalEmpleado = EmpleadoRepository.findById(id);
        return optionalEmpleado.get();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Empleado> obtenerEmpleado() {
        return EmpleadoRepository.findAll();
    }

    @Override
    public Empleado actualizarEmpleado(Empleado E) {
        Empleado existe = EmpleadoRepository.findById(E.getIdEmpleado()).get();

        existe.setIdProfesiones(E.GetIdProfesiones());
        existe.setIdUsuarioCreacion(E.GetIdUsuarioCreacion());
        existe.setIdUsuarioEliminacion(E.GetIdUsuarioEliminacion());
        existe.setIdUsuarioModificacion(E.GetIdUsuarioModificacion());
        existe.setFechaCreacion(E.GetFechaCreacion());
        existe.setFechaModificacion(E.GetFechaModificacion());
        existe.setFechaEliminacion(E.GetFechaEliminacion());
        existe.setIdMunicipioRes(E.GetIdMunicipioRes());
        existe.setIdMunicipioNac(E.GetIdMunicipioNac());
        existe.setIdDepartamentoNac(E.GetIdDepartamentoNac());
        existe.setIdDepartamentoRes(E.GetIdDepartamentoRes());
        existe.setIdPaisNac(E.GetIdPaisNac());
        existe.setIdPaisRes(E.GetIdPaisRes());
        existe.setIdIdentificacion(E.GetIdIdentificacion());
        existe.setIdEstadoCivil(E.GetIdEstadoCivil());
        existe.setIdSexo(E.GetIdSexo());
        existe.setIdNacionalidad(E.getIdNacionalidad());
        existe.setNumIdentificacion(E.getNumIdentificacion());
        existe.setNumINSS(E.getNumINSS());
        existe.setCodMinsa(E.getCodMinsa());
        existe.setPrimerNombre(E.getPrimerNombre());
        existe.setSegundoNombre(E.getSegundoNombre());
        existe.setPrimerApellido(E.getPrimerApellido());
        existe.setSegundoApellido(E.getSegundoApellido());
        existe.setFechaNac(E.getFechaNac());
        existe.setEdadIngreso(E.getEdadIngreso());
        existe.setEmail(E.getEmail());
        existe.setPrimerNombre(E.getSegundoNombre());
        existe.setDireccionDomiciliar(E.getDireccionDomicilar());
        existe.setTelefonoDomiciliar(E.getTelefonoDomiciliar());
        existe.setTelefonoMovil(E.getTelefonoMovil());
        existe.setFechaContrato(E.getFechaContrato());
        existe.setUrlFoto(E.getUrlFoto());
        existe.setActivo(E.getActivo());
        existe.setEstado(E.getEstado());


        return EmpleadoRepository.save(existe);
    }

    @Override
    public void eliminarEmpleado(Long id) {
        EmpleadoRepository.deleteById(id);
    }
}
