package ar.edu.unju.fi.main;

import java.util.Scanner;

import ar.edu.unju.fi.model.Alumno;
import ar.edu.unju.fi.model.Materia;
import ar.edu.unju.fi.model.RegistroNota;

//NOS PIDEN UN ALUMNO REGISTRAR LAS NOTAS FINALES DE 4 MATERIAS

public class Main {

	public static void main(String[] args) {
		
		Alumno alumno = generarAlumno();
		registrarNotas(alumno);
		
		System.out.println("-----FIN DEL PROGRAMA-----");
	}
	
	public static Alumno generarAlumno() {
			
		Alumno alumno = new Alumno();
		Scanner scanner = new Scanner(System.in);
			
		System.out.println("Ingrese el legajo: ");
		Integer legajo = scanner.nextInt();
			
		System.out.println("Ingrese el apellido: ");
		String apellido = scanner.next();
			
		System.out.println("Ingrese el apellido: ");
		String nombre = scanner.next();
			
		alumno.setLegajo(legajo);
		alumno.setApellido(apellido);
		alumno.setNombre(nombre);
		
		return alumno;
	}
	
	public static void registrarNotas(Alumno alumno) {
		
		int numMaterias = 1;
		Scanner scanner = new Scanner(System.in);
			
		while(numMaterias <= 4) {
			
			System.out.println("Ingrese el código de la materia: ");
			String codigoMateria = scanner.next();
			System.out.println("Ingrese el nombre de la materia: ");
			String nombreMateria = scanner.next();
			
			Materia materia = new Materia(codigoMateria,nombreMateria);
			
			System.out.println("Código del registro de Notas: ");
			String codigoNota = scanner.next();
			System.out.println("Nota del alumno: ");
			Float nota = scanner.nextFloat();
			
			RegistroNota registroNota = new RegistroNota(codigoNota, alumno, materia, nota);
			
			System.out.println(registroNota.toString());
			
			numMaterias++;
		}
		
		scanner.close();
	}
		
	

}
