package com.testbytecode.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPLEADO")
public class Empleado {
	
	@Id
	@GeneratedValue
	@Column(name="ID")
	long id;
	@Column(name="NOMBRE")
	String nombre;
	@Column(name="CARGO")
	String cargo;
	@Column(name="SUELDO")
	double sueldo;
	
	public Empleado() {
		
	}
	public Empleado(long id, String nombre, String cargo, double sueldo) {
		this.id=id;
		this.nombre=nombre;
		this.cargo=cargo;
		this.sueldo=sueldo;
	}
	
	public void setId(long id) {
		this.id=id;
	}
	public long getId() {
		return id;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setCargo(String cargo) {
		this.cargo=cargo;
	}
	public String getCargo() {
		return cargo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo=sueldo;
	}
	public double getSueldo() {
		return sueldo;
	}

}
