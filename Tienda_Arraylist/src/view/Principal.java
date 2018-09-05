package view;

import java.util.Scanner;

import categor�a.control.Categor�as;
import categor�a.view.Categor�aView;
import producto.control.Productos;
import producto.view.ProductoView;


public class Principal {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner (System.in);
		Categor�as categor�as= new Categor�as();
		Productos productos= new Productos(10);
		
		ProductoView productosview= new ProductoView(productos, categor�as, scanner);
		Categor�aView categor�asview= new Categor�aView(categor�as, productos, scanner);
		
		
		MenuPrincipal.men�(scanner, productosview,  categor�asview);
		scanner.close();

	}

}
