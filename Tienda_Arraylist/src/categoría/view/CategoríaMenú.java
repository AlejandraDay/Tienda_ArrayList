package categoría.view;

import java.util.Scanner;

import categoría.entity.NoExisteCategoría;
import view.InputTypes;

public class CategoríaMenú {

	
	private static int encabezado(Scanner scanner) {
		int opcion;
		while(true) {
			System.out.println("Ingrese una opción: ");
			System.out.println("1. Ingresar categoría ");
			System.out.println("2. Listar categorías ");
			System.out.println("3. Eliminar categoría ");
			System.out.println("4. Listar productos por categoría ");
			System.out.println("0. salir");
			System.out.println();
			
			opcion= InputTypes.readInt("¿Su opción?", scanner);
			
			if(opcion>=0&& opcion<=4) {
				return opcion;
			}
		}
	}
	public static void menú(Scanner scanner, CategoríaView categoríasView) {
		boolean salir= false;
		while(!salir) {
			switch (encabezado(scanner)) {
			case 0:
				salir=true;
				break;
			case 1:
				categoríasView.add();
				break;
			case 2:
				categoríasView.listar();
				break;
			case 3:
				try {
					categoríasView.delete();}
					catch(NoExisteCategoría e){
						System.out.println("No existe la categoría");
					}
					break;
			case 4:
				try {
					categoríasView.lisarProductos();
				} catch (NoExisteCategoría e) {
					e.printStackTrace();
				}
				break;
			}
		}
	}



}
