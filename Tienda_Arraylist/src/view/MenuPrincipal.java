package view;

import java.util.Scanner;

import categoría.view.CategoríaMenú;
import categoría.view.CategoríaView;
import producto.view.ProductoMenú;
import producto.view.ProductoView;

public class MenuPrincipal {

	private static int encabezado(Scanner scanner) {
		int opcion;
		while(true) {
			System.out.println("Ingrese una opción: ");
			System.out.println("1. categorías ");
			System.out.println("2. productos ");
			//System.out.println("0. salir");
			System.out.println();
			
			opcion= InputTypes.readInt("¿Su opción?", scanner);
			
			if(opcion>=0&& opcion<=2) {
				return opcion;
			}
		}
	}
	public static void menú(Scanner scanner, ProductoView productosView, CategoríaView categoríasView){
		boolean salir= false;
		
		while(!salir) {
			switch (encabezado(scanner)) {
			/*case 0:
				salir=true;
				break;*/
			case 1:
				CategoríaMenú.menú(scanner, categoríasView);
				break;
			case 2:
				ProductoMenú.menú(scanner, productosView);
				break;
			}
		}
	}
}
