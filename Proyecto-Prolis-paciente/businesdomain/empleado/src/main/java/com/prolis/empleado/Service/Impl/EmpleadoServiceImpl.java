package com.prolis.empleado.Service.Impl;

import com.prolis.empleado.entity.empleado;
import com.prolis.empleado.Repository.EmpleadoRepository;
import com.prolis.empleado.Service.EmpleadoService;
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
    public empleado crearEmpleado(empleado E) {
        return EmpleadoRepository.save(E);
    }

    @Override
    public empleado listarPorId(Long id) {
        Optional<empleado> optionalEmpleado = EmpleadoRepository.findById(id);
        return optionalEmpleado.get();
    }

    @Override
    @Transactional(readOnly = true)
    public List<empleado> obtenerEmpleado() {
        return EmpleadoRepository.findAll();
    }

    @Override
    public empleado actualizarEmpleado(empleado E) {
        empleado existe = EmpleadoRepository.findById(E.getIdEmpleado()).get();

        existe.setIdProfesiones(E.getIdProfesiones());
        existe.setIdUsuarioCreacion(E.getIdUsuarioCreacion());
        existe.setIdUsuarioEliminacion(E.getIdUsuarioEliminacion());
        existe.setIdUsuarioModificacion(E.getIdUsuarioModificacion());
        existe.setFechaCreacion(E.getFechaCreacion());
        existe.setFechaModificacion(E.getFechaModificacion());
        existe.setFechaEliminacion(E.getFechaEliminacion());
        existe.setIdMunicipioRes(E.getIdMunicipioRes());
        existe.setIdMunicipioNac(E.getIdMunicipioNac());
        existe.setIdDepartamentoNac(E.getIdDepartamentoNac());
        existe.setIdDepartamentoRes(E.getIdDepartamentoRes());
        existe.setIdPaisNac(E.getIdPaisNac());
        existe.setIdPaisRes(E.getIdPaisRes());
        existe.setIdIdentificacion(E.getIdIdentificacion());
        existe.setIdEstadoCivil(E.getIdEstadoCivil());
        existe.setIdSexo(E.getIdSexo());
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
        existe.setDireccionDomiciliar(E.getDireccionDomiciliar());
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
