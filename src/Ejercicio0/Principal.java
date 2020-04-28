package Ejercicio0;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudiante estudiar = new Estudiante("Juan", "1ºDAM", 12345);
		estudiar.setEdad(20);
		double[] notas = new double[7];
		notas[0] = 7;
		notas[1] = 8.5;
		notas[2] = 4;
		notas[3] = 8;
		notas[4] = 6;
		notas[5] = 7.5;
		notas[6] = 5;
		estudiar.setNotas(notas);
		Coche coche = new Coche();
		coche.setMarca("Renault");
		coche.setModelo("Clio");
		coche.setColor("Rojo");
		
		Profesor profesor = new Profesor("Fernando", "D104");
		profesor.setNomina(69);
		profesor.setEdad(45);
		profesor.setHorarioTutorias("Lunes de 10:00 a 13:00");
		Coche coche1 = new Coche();
		coche1.setMarca("Opel");
		coche1.setModelo("Corsa");
		coche1.setColor("Blanco");
		
		
		System.out.println(estudiar.nombre+" tiene un "+estudiar.getNotaMedia()+" de media");
		
		estudiar.menuIntranet();
		profesor.menuIntranet();
	}

}
