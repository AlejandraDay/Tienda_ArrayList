package categor�a.view;

import java.util.Scanner;

import categor�a.entity.NoExisteCategor�a;
import view.InputTypes;

public class Categor�aMen� {

	
	private static int encabezado(Scanner scanner) {
		int opcion;
		while(true) {
			System.out.println("Ingrese una opci�n: ");
			System.out.println("1. Ingresar categor�a ");
			System.out.println("2. Listar categor�as ");
			System.out.println("3. Eliminar categor�a ");
			System.out.println("4. Listar productos por categor�a ");
			System.out.println("0. salir");
			System.out.println();
			
			opcion= InputTypes.readInt("�Su opci�n?", scanner);
			
			if(opcion>=0&& opcion<=4) {
				return opcion;
			}
		}
	}
	public static void men�(Scanner scanner, Categor�aView categor�asView) {
		boolean salir= false;
		while(!salir) {
			switch (encabezado(scanner)) {
			case 0:
				salir=true;
				break;
			case 1:
				categor�asView.add();
				break;
			case 2:
				categor�asView.listar();
				break;
			case 3:
				try {
					categor�asView.delete();}
					catch(NoExisteCategor�a e){
						System.out.println("No existe la categor�a");
					}
					break;
			case 4:
				try {
					categor�asView.lisarProductos();
				} catch (NoExisteCategor�a e) {
					e.printStackTrace();
				}
				break;
			}
		}
	}



}
