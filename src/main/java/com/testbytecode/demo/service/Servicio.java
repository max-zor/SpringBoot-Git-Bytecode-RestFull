package com.testbytecode.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testbytecode.demo.entity.Empleado;
import com.testbytecode.demo.repository.Repositorio;

@Service
public class Servicio {
	
	@Autowired
	Repositorio repo;
	
	public boolean crear (Empleado empleado) {
		try {
			repo.save(empleado);
			return true;
			
		} catch (Exception e) {
			return false;
			
		}
				
	}
	public boolean actualizar (Empleado empleado) {
		try {
			repo.save(empleado);
			return true;
			
		} catch (Exception e) {
			return false;
			
		}
				
	}

}
