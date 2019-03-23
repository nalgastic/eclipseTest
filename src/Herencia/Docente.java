 package Herencia;

import java.util.*;

public class Docente{
	
	private String Nombre;
	
	public List<Docente> Hijo;
	public Docente Daddy;
	
	public Docente (String Nombre) {
		this.setNombre(Nombre);
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

}

