package Herencia;

public class Empleados extends UIS{
	
	 private String Nombre, Apellido;
	 private int Edad, ID, Telefono;
	 private double Salario;
	 
	public Empleados(String nombre, String apellido, int edad, int iD, int telefono, double salario) {
		Nombre = nombre;
		Apellido = apellido;
		Edad = edad;
		ID = iD;
		Telefono = telefono;
		Salario = salario;
		}	
	
	 public String getNombre() {
		return Nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getTelefono() {
		return Telefono;
	}

	public void setTelefono(int telefono) {
		Telefono = telefono;
	}

	public double getSalario() {
		return Salario;
	}

	protected String DevolverNombre (Empleados empleado) {
		return empleado.getNombre() + " " + empleado.getApellido();
	}
	
	protected double DevolverSalario (Empleados empleado) {
		return (empleado.getSalario() - (empleado.getSalario() * 0.08 )) + 97.032; 
	}

}


