package Ejercicio2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prestados = 0;
		Libros libros_1 = new Libros(887948, 2010, "vino", true);
		Revista revista_1 = new Revista(88748, 2010, 56, false);
		Libros libros_2 = new Libros(887948, 2020, "Coca cola", false);
		Revista revista_2 = new Revista(88748, 2020, 23, true);
		Libros libros_3 = new Libros(887948, 2020, "pizza", false);
		Revista revista_3 = new Revista(88748, 2020, 12, false);
		Libros libros_4 = new Libros(887948, 1998, "comer", true);
		Revista revista_4 = new Revista(88748, 1988, 14, false);
		Publicacion[] publicacion_1 = new Publicacion[8];

		publicacion_1[0]=libros_1;
		publicacion_1[1]=revista_1;
		publicacion_1[2]=libros_2;
		publicacion_1[3]=revista_2;
		publicacion_1[4]=libros_3;
		publicacion_1[5]=revista_3;
		publicacion_1[6]=libros_4;
		publicacion_1[7]=revista_4;
		
		for(int i = 0;i < publicacion_1.length;i++) {
			System.out.println(publicacion_1[i].toString());
			if (publicacion_1[i].prestado() == true) {
				prestados++;
			}
		}
		
		System.out.println("Hay "+prestados+" libros prestados");
	
	}

}
