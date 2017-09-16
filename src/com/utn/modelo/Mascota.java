package com.utn.modelo;

public class Mascota {

	private String nombre;
	private String tipo;
	private String raza;
	private int edad;
	private String causaDeAtencion;
	private int turno;
	
	private String resultado;
	private String causas;
	private String medicamentos;
	private String doctor;
	
	public Mascota(){}
	
	public Mascota (int turno, String nombre, String tipo, String raza, 
			int edad, String causaDeAtencion) {
		
		this.turno = turno;
		this.nombre = nombre;
		this.tipo = tipo;
		this.raza = raza;
		this.edad = edad;
		this.causaDeAtencion = causaDeAtencion;
		
	}


	public int getTurno() {
		return turno;
	}

	public void setTurno(int turno) {
		this.turno = turno;
	}

	public String getNombre() {
		return nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public int getEdad() {
		return edad;
	}

	public String getCausaDeAtencion() {
		return causaDeAtencion;
	}

	
	//luego de atenderlos

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}


	public String getCausas() {
		return causas;
	}


	public void setCausas(String causas) {
		this.causas = causas;
	}


	public String getMedicamentos() {
		return medicamentos;
	}


	public void setMedicamentos(String medicamentos) {
		this.medicamentos = medicamentos;
	}


	public String getRaza() {
		return raza;
	}


	public void setRaza(String raza) {
		this.raza = raza;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public void setCausaDeAtencion(String causaDeAtencion) {
		this.causaDeAtencion = causaDeAtencion;
	}


	public String getDoctor() {
		return doctor;
	}


	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}

	
	
}
