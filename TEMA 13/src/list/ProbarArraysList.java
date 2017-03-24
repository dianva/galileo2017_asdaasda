package list;

import java.util.ArrayList;
import java.util.Scanner;

public class ProbarArraysList {
	Scanner teclado=new Scanner(System.in);
	public static void main(String[] args) {

		ArrayList<Alumno> listado=new ArrayList<Alumno>();
		listado.add(new Alumno(1,"Pepe","1DAW"));
		listado.add(new Alumno(2,"Ana","1DAW"));
		listado.add(new Alumno(3,"Carlos","2DAW"));
		listado.add(new Alumno(4,"Marta","1DAW"));
		listado.add(new Alumno(5,"Fernando","2DAW"));
		int opSeleccionada=seleccionMenu();
		switch(opSeleccionada){
		case 1://AÑADIR UN ALUMNO AL LISTADO
			listado.add(addAlumno());
			break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			default:
				System.out.println("FIN DEL PROGRAMA");
		}
	}
	//METODOS

	private static Alumno addAlumno() {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Añadir alumno");
		System.out.println("Nº de matricula?");
		int nm=teclado.nextInt();
		System.out.println("Nombre?");
		String nombre=teclado.nextLine();
		System.out.println("Curso?");
		String curso=teclado.nextLine();
		return new Alumno(nm,nombre,curso);
	}

	private static int seleccionMenu() {
		Scanner teclado=new Scanner(System.in);
	System.out.println("GESTION DE ALUMNOS");
	System.out.println("------------------");
	System.out.println("1.-Añadir,\n 2.-Consultar\n 3.-Borrar\n 4.-Modificar Datso"
			+ " \n 5.-Listar TODOS \n 6.-Filtarr \n 7.-fin");
		int opSeleccionada;
		do{
			System.out.println("Selecciona de 1 a 7:");
			opSeleccionada=teclado.nextInt();
			if(opSeleccionada<1 || opSeleccionada>7){
				System.out.println("Selecciona una opcion de 1 a 7");
			}
		}while(opSeleccionada<1 || opSeleccionada>7);
		return opSeleccionada;
	}

}
