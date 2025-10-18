package Main;

import java.util.Scanner;

import Dominio.Empleados;
import Implementacion.LogicaMetodos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lectura = null;

		int numEmpleado, menuPrincipal;
		String nombre;
		String app;
		String apm;
		long numCel;
		
		System.out.println("Hola mundo");
		System.out.println("Probando nuevos cambios");

		Empleados empleado;

		LogicaMetodos imp = new LogicaMetodos();

		do {
			System.out.println("MENU PRINCIPAL");
			System.out.println("1--ALTA");
			System.out.println("2--MOSTRAR");
			System.out.println("3--BUSCAR");
			System.out.println("4---EDITAR");
			System.out.println("5---ELIMINAR");
			System.out.println("6---SALIR");

			lectura = new Scanner(System.in);
			menuPrincipal = lectura.nextInt();

			switch (menuPrincipal) {
			case 1:
				try {
					System.out.println("Ingrese el numEmpleado");
					lectura = new Scanner(System.in);
					numEmpleado = lectura.nextInt();

					System.out.println("Ingrese el nombre");
					lectura = new Scanner(System.in);
					nombre = lectura.nextLine();

					System.out.println("Ingrese el app");
					lectura = new Scanner(System.in);
					app = lectura.nextLine();

					System.out.println("Ingrese el apm");
					lectura = new Scanner(System.in);
					apm = lectura.nextLine();

					System.out.println("Ingrese el num. celular");
					lectura = new Scanner(System.in);
					numCel = lectura.nextLong();

					// Craer el objeto
					empleado = new Empleados(numEmpleado, nombre, app, apm, numCel);

					// Agregar al hashMap
					imp.guardar(empleado);
					System.out.println("Se guardo");

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al guardar " + e.getMessage());
				}
				break;
			case 2:
				imp.mostrar();
				break;
			case 3:
				try {
					System.out.println("Ingrese el numEmpleado");
					lectura = new Scanner(System.in);
					numEmpleado = lectura.nextInt();

					// Buscar
					empleado = imp.buscar(numEmpleado);

					if (empleado != null)
						System.out.println(empleado);
					else
						System.out.println("No existe");

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al buscar " + e.getMessage());
				}
				break;
			case 4:
				try {
					System.out.println("Ingrese el numEmpleado");
					lectura = new Scanner(System.in);
					numEmpleado = lectura.nextInt();

					// Buscar
					empleado = imp.buscar(numEmpleado);

					if (empleado != null) {
						System.out.println(empleado);

						// Editar ---- la llave no se puede editar
						System.out.println("Ingrese el nuevo nombre");
						lectura = new Scanner(System.in);
						nombre = lectura.nextLine();

						// Actualizar el objeto
						empleado.setNombre(nombre);

						// Actualizar el objeto en el hashMap
						imp.editar(empleado);
						System.out.println("Se edito");

					} else
						System.out.println("No existe");

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al editar " + e.getMessage());
				}
				break;
			case 5:
				try {
					System.out.println("Ingrese el numEmpleado");
					lectura = new Scanner(System.in);
					numEmpleado = lectura.nextInt();

					// Eliminar
					imp.eliminar(numEmpleado);
					System.out.println("Se elimino");

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al eliminar");
				}
				break;
			case 6:
				break;
			}

		} while (menuPrincipal < 6);

	}

}
