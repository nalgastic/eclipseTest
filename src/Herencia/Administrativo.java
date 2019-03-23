package Herencia;

import java.util.*;

public class Administrativo {
	
	private String Nombre;
	
	public List<Administrativo> Hijo;
	public Administrativo Daddy;
	
	public Administrativo (String Nombre) {
		this.setNombre(Nombre);
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

}
