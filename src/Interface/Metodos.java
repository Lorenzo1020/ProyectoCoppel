package Interface;

import Dominio.Empleados;

public interface Metodos {

	public void guardar(Empleados empleado);

	public void mostrar();

	public Empleados buscar(int numEmpleado);

	public void editar(Empleados empleado);

	public void eliminar(int numEmpleado);

}
