package producto.view;

import java.util.Scanner;

import categoría.entity.NoExisteCategoría;
import view.InputTypes;

public class ProductoMenú {
	
	private static int encabezado(Scanner scanner) {
		int opcion;
		while(true) {
			System.out.println("Ingrese una opción: ");
			System.out.println("1. Ingresar producto ");
			System.out.println("2. Listar productos ");
			System.out.println("3. Eliminar producto ");
			System.out.println("0. salir");
			System.out.println();
			
			opcion= InputTypes.readInt("¿Su opción?", scanner);
			
			if(opcion>=0&& opcion<=3) {
				return opcion;
			}
		}
	}
	public static void menú(Scanner scanner, ProductoView productosView){
		boolean salir= false;
		
		while(!salir) {
			switch (encabezado(scanner)) {
			case 0:
				salir=true;
				break;
			case 1:
				try {
					productosView.add();
				} catch (NoExisteCategoría e) {
					System.out.println("No Existe la categoría!");
				}
				break;
			case 2:
				productosView.listar();
				break;
			case 3:
				productosView.delete();
				break;
			}
		}
	}

}
