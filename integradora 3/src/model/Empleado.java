package model;

public class Empleado{

	//Atributes
	private String nombre;
	private double salario;
	private Estado estado;

	public Empleado (String nombre, double salario, int pestado){
		this.nombre = nombre;
		this.salario = salario;
		switch(pestado){
			case 1:
			this.tactica = Estado.ACTIVO; break;
			case 2:
			this.tactica = Estado.INACTIVO;
		}
	}
}