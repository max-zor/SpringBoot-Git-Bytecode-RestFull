package com.testbytecode.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testbytecode.demo.entity.Empleado;

@Repository
public interface Repositorio extends JpaRepository<Empleado, Long>{

	public abstract Empleado findByNombre(String nombre);
	public abstract Empleado findByNombreAndId(String nombre, long id);
	public abstract Empleado findByNombreAndCargo(String nombre, String cargo);
}
