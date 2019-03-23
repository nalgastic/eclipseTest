package Herencia;

public class PlantaDocente extends Empleados {

	public PlantaDocente(String nombre, String apellido, int edad, int iD, int telefono, double salario) {
		super(nombre, apellido, edad, iD, telefono, salario);
	
	Docente UIS = new Docente ("UIS");
	Docente Contrato = new Docente ("ContratoDocentes");
	
	Docente Catedra = new Docente ("Catedra");
	Docente TiempoCompleto = new Docente ("TiempoCompleto");
	Docente MedioTiempo = new Docente ("MedioTiempo");
	
	UIS.Hijo.add(Contrato);
	Contrato.Daddy = UIS;
	
	Contrato.Hijo.add(Catedra);
	Contrato.Hijo.add(TiempoCompleto);
	Contrato.Hijo.add(MedioTiempo);
	}

}
