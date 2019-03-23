package Herencia;

public class UIS {

	public static void main(String[] args) {

		Empleados NuevoEmpleado = new Empleados (null, null, 0, 0, 0, 828.116);
		
		System.out.println( "El Empleado " + NuevoEmpleado.DevolverNombre(NuevoEmpleado) + " Se encuentra suscrito como Docente de la Universidad Industrial de Santander ");
		System.out.println( "Mensualmente genera un salario base equivalente a: "+ NuevoEmpleado.getSalario());
		System.out.println( "El siguiente valor es el Salario del Empleado despues de realizar los respectivos descuentos de salud y pensi�n: " + NuevoEmpleado.DevolverSalario(NuevoEmpleado) + ". ");
		
		System.out.println ("El Empleador (UIS) se encarga de girar los siguientes valores a las entidades de Salud, Pensi�n, Sena e ICBF de acuerdo al salirio del Empleado ");
		
		System.out.println( "Salud: "+ (NuevoEmpleado.getSalario()*0.085));
		System.out.println( "Pension: "+ (NuevoEmpleado.getSalario()*0.16));
		System.out.println( "SENA: "+ (NuevoEmpleado.getSalario()*0.02));
		System.out.println( "ICBF: "+ (NuevoEmpleado.getSalario()*0.03));
		System.out.println( "Caja de Compensaci�n: "+ (NuevoEmpleado.getSalario()*0.04));
	}

}
