package view;

import java.util.Scanner;

import categor�a.view.Categor�aMen�;
import categor�a.view.Categor�aView;
import producto.view.ProductoMen�;
import producto.view.ProductoView;

public class MenuPrincipal {

	private static int encabezado(Scanner scanner) {
		int opcion;
		while(true) {
			System.out.println("Ingrese una opci�n: ");
			System.out.println("1. categor�as ");
			System.out.println("2. productos ");
			//System.out.println("0. salir");
			System.out.println();
			
			opcion= InputTypes.readInt("�Su opci�n?", scanner);
			
			if(opcion>=0&& opcion<=2) {
				return opcion;
			}
		}
	}
	public static void men�(Scanner scanner, ProductoView productosView, Categor�aView categor�asView){
		boolean salir= false;
		
		while(!salir) {
			switch (encabezado(scanner)) {
			/*case 0:
				salir=true;
				break;*/
			case 1:
				Categor�aMen�.men�(scanner, categor�asView);
				break;
			case 2:
				ProductoMen�.men�(scanner, productosView);
				break;
			}
		}
	}
}
