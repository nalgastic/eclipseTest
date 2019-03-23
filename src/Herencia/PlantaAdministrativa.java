package Herencia;

public class PlantaAdministrativa extends Empleados{

	public PlantaAdministrativa(String nombre, String apellido, int edad, int iD, int telefono, double salario) {
		super(nombre, apellido, edad, iD, telefono, salario);
	
	Administrativo UIS = new Administrativo ("UIS");
	Administrativo Contrato = new Administrativo ("ContratoAdministrativos");
	
	Administrativo Profesional = new Administrativo ("Porfesional");
	Administrativo Tecnico = new Administrativo ("Tecnico");
	Administrativo Auxiliar = new Administrativo ("Auxiliar");
	
	UIS.Hijo.add(Contrato);
	Contrato.Daddy = UIS;
	
	Contrato.Hijo.add(Profesional);
	Contrato.Hijo.add(Tecnico);
	Contrato.Hijo.add(Auxiliar);
	}

	
}
